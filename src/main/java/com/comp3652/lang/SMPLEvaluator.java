package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

public class SMPLEvaluator implements SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {

	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	private final StringEvaluator stringEval;

	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator(arithEval);
		stringEval = new StringEvaluator();
		lastResult = SMPLValue.DEFAULT;
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLProgram(SMPLProgram program, SMPLContext state) throws SMPLException {
		SMPLStmtSequence stmts = program.getSeq();
		SMPLValue tmp = stmts.visit(this, state);

		return lastResult;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtSequence(SMPLStmtSequence s, SMPLContext state) throws SMPLException {
		ArrayList<SMPLStatement> stmts = s.getStatements();
		SMPLValue result = SMPLValue.DEFAULT;

		for (SMPLStatement stmt : stmts) {
			result = stmt.visit(this, state);
		}

		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLAssignment(SMPLAssignment smplAssignment, SMPLContext state) throws SMPLException {
		SMPLValue result = smplAssignment.getExp().visit(this, state);
		state.putSMPLVal(smplAssignment.getVar(), result);
		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLPrintStmt(SMPLPrintStmt printStmt, SMPLContext state) throws SMPLException {
		StringExp stringExp = printStmt.getExp();
		SMPLValue v = stringExp.visit(this,state);
		Object output = v.getValue().toString();

		if (printStmt.isPrintln()) {
			System.out.println(output);
		} else {
			System.out.print(output);
		}

		return v;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLReadStmt(SMPLReadStmt smplReadStmt, SMPLContext state) {
		Scanner scan = new Scanner(System.in);
		Object str = scan.next();

		if(smplReadStmt.getReadInt()){
			SMPLValue v = new PrimitiveSMPLValue(new AIRExpInt((Integer) str));
			return v;

		} else{
			SMPLValue v = new PrimitiveSMPLValue(new StringExp((String) str));
			return v;

		}
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, SMPLContext state) throws SMPLException {
		String toRet = smplSubStrStmt.getString();
		return new SMPLString(toRet.substring(smplSubStrStmt.getStart(),smplSubStrStmt.getEnd()));
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, SMPLContext state) throws SMPLException {
		if(smplCaseStmt.getPredicate().visit(this.condEval,state)){
			return (smplCaseStmt.getConsequent().visit(this, state));
		}

		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, SMPLContext state) throws SMPLException {
		SMPLValue<SMPLExp> exp = smplRetVctStmt.getVector().visit(this,state);
		return new PrimitiveSMPLValue (exp.getValues().get(smplRetVctStmt.getIndex()));
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLIfStmt(SMPLIfStmt smplIfStmt, SMPLContext state) throws SMPLException {
		ASTExp<CIRExp> conditionalExpression = smplIfStmt.getCondExp();
		SMPLStmtSequence alternativeBody = smplIfStmt.getAlternative();
		Boolean conditionalEval = conditionalExpression.visit(condEval,state);
		boolean shouldExecute = conditionalEval.booleanValue();
		if (shouldExecute) {
			SMPLStmtSequence statements = smplIfStmt.getBody();
			statements.visit(this, state);
			return SMPLValue.DEFAULT;
		} else{
			if(alternativeBody != null){
				alternativeBody.visit(this, state);
				return SMPLValue.DEFAULT;
			}

		}
		return SMPLValue.DEFAULT;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLLetStmt(SMPLLetStmt smplLetStmt, SMPLContext state) throws SMPLException {
		SMPLStmtSequence body = smplLetStmt.getBody();

		return body.visit(this, state);
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, SMPLContext state) throws SMPLException {
		SMPLValue result = (SMPLValue) smplStmtDefinition.getExp().visit(this, state);
		state.putSMPLVal(smplStmtDefinition.getVar(), result);
		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, SMPLContext context) throws SMPLException {
		String funName = smplExpFunCall.getFunName();
		ArrayList<ASTExp<SMPLExp>> argExps = smplExpFunCall.getArgExps();

		ArrayList<SMPLValue> arguments = new ArrayList<SMPLValue>();

		SMPLFunction function = context.getFunction(funName);

		ArrayList<String> formalParameters = function.getParams();

		SMPLContext closingEnvironment = function.getClosingEnv();
		for (ASTExp<SMPLExp> arg : argExps) {
			arguments.add(arg.visit(this, context));
		}

		// extend the closing environment with bindings for painter parameters
		SMPLContext newEnvironment = closingEnvironment.extendSMPLValue(formalParameters, arguments)
				.extendFunctionEnvironment(new ArrayList<String>(), new ArrayList<SMPLFunction>());


		return new CompoundSMPLValue(this, function.getBody(), newEnvironment);
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLisPairStmt(SMPLisPairStmt smplisPairStmt, SMPLContext arg) throws SMPLException {
		return new SMPLBoolean(new BoolExp(smplisPairStmt.getPair().visit(this, arg).getType().equals( "Vector")));
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLVectorExp(SMPLVectorExp smplVectorExp, SMPLContext context) throws SMPLException {
		ArrayList<ASTExp> contents = smplVectorExp.getExplist();
		ArrayList<ASTExp> container = new ArrayList<ASTExp>();
		for (int i = 0; i < contents.size(); i++) {
			ASTExp curr = contents.get(i);
			container.add((ASTExp) curr.visit(this, context));
		}
		return (new SMPLVector(container));
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCaseFunction(SMPLCaseFunction smplCaseFunction, SMPLContext state) throws SMPLException {
		for(SMPLCaseStmt stmt : smplCaseFunction.getCaseStmts()){
			if(stmt.getPredicate().visit(this.condEval,state)){
				return stmt.getConsequent().visit(this,state);
			}
		}

		return smplCaseFunction.getFinalCase().visit(this,state);
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSizeStmt(SMPLSizeStmt sizeStmt, SMPLContext state) throws SMPLException {
		return new PrimitiveSMPLValue(new SMPLVector(sizeStmt.getVector().visit(this,state)).size());
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLIsEqualStmt(SMPLIsEqualStmt stmt, SMPLContext state) throws SMPLException {
		return new SMPLBoolean(stmt.isEqual());
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLIsEqvStmt(SMPLIsEqvStmt stmt, SMPLContext state) throws SMPLException {
		return new SMPLBoolean(stmt.isEquivalent());
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCarStmt(SMPLCarStmt smplCarStmt, SMPLContext context) throws SMPLException {
		return (SMPLValue<SMPLExp>) smplCarStmt.ret();
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCdrStmt(SMPLCdrStmt smplCdrStmt, SMPLContext context) throws SMPLException {
		return (SMPLValue<SMPLExp>) smplCdrStmt.ret();
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunDef(SMPLFunDef smplFunDef, SMPLContext state) throws SMPLException {
		//#TODO
		
		String funcName = smplFunDef.getFunctionName();
		ArrayList<String> parameters = smplFunDef.getParameters();
		SMPLStmtSequence seq = smplFunDef.getStatements();

		

		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException, SMPLException {
		return state.getSMPLValue(var.getId());
	}

	@Override
	public SMPLValue<SMPLExp> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		throw new SMPLException("Unknown unary operation applied to value: " +
				exp);
	}

	@Override
	public SMPLValue<SMPLExp> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		throw new SMPLException("Unknown binary operation applied to values: " +
				exp);
	}

	public SMPLContext mkInitialContext() {
		return new SMPLContextImpl();
	}

	public SMPLValue getResult() {
		return lastResult;
	}
}