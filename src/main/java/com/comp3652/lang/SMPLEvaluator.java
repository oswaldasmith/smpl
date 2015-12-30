package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLContextImpl;
import com.comp3652.sys.SMPLException;
import com.comp3652.values.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class SMPLEvaluator implements SMPLVisitor<SMPLContext, SMPLValue> {

	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	private final StringEvaluator stringEval;
	private final BooleanEvaluator boolEval;


	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator(arithEval);
		stringEval = new StringEvaluator();
		lastResult = SMPLValue.DEFAULT;
		boolEval = new BooleanEvaluator();
	}


	@Override
	public SMPLValue visitSMPLProgram(SMPLProgram program, SMPLContext state) throws SMPLException {
		SMPLStmtSequence stmts = program.getSeq();
		SMPLValue tmp = stmts.visit(this, state);

		return lastResult;
	}

	@Override
	public SMPLValue visitSMPLStmtSequence(SMPLStmtSequence s, SMPLContext state) throws SMPLException {
		ArrayList<SMPLStatement> stmts = s.getStatements();
		SMPLValue result = SMPLValue.DEFAULT;

		for (SMPLStatement stmt : stmts) {
			result = stmt.visit(this, state);
		}

		return result;
	}

	@Override
	public SMPLValue visitSMPLAssignment(SMPLAssignment smplAssignment, SMPLContext state) throws SMPLException {
		SMPLValue result = smplAssignment.getExp().visit(this, state);
		state.putSMPLVal(smplAssignment.getVar(), result);
		return result;
	}


	@Override
	public SMPLValue visitSMPLPrintStmt(SMPLPrintStmt printStmt, SMPLContext state) throws SMPLException {
		SMPLValue exp = null;
		Class check = printStmt.getExp().getClass();

		if (check.isAssignableFrom(StringExp.class)) {
			exp = new SMPLString(printStmt.getExp().visit(this.stringEval, state.getStringEnv()));
		}
		if (check.isAssignableFrom(AIRExp.class)) {
			exp = new SMPLFloat(printStmt.getExp().visit(this.arithEval, state.getNumEnv()));
		}
		if (check.isAssignableFrom(BoolExp.class)) {
			exp = new SMPLBoolean(printStmt.getExp().visit(this.boolEval, state.getBoolEnv()));
		}
		if (printStmt.isPrintln()) {
			System.out.println(exp);
		} else {
			System.out.print(exp);
		}

		return exp;
	}

	@Override
	public SMPLValue visitSMPLReadStmt(SMPLReadStmt smplReadStmt, SMPLContext state) {
		Scanner scan = new Scanner(System.in);
		Object str = scan.next();

		if(smplReadStmt.getReadInt()){
			SMPLString v = new SMPLString(str.toString());
			return v;

		} else{
			SMPLValue v = new SMPLString(new StringExp((String) str));
			return v;

		}
	}

	@Override
	public SMPLValue visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, SMPLContext state) throws SMPLException {
		String toRet = smplSubStrStmt.getString();
		return new SMPLString(toRet.substring(smplSubStrStmt.getStart(),smplSubStrStmt.getEnd()));
	}

	@Override
	public SMPLValue visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, SMPLContext state) throws SMPLException {
		if(smplCaseStmt.getPredicate().visit(this.condEval,state)){
			return (smplCaseStmt.getConsequent().visit(this, state));
		}

		return null;
	}

	@Override
	public SMPLValue visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, SMPLContext state) throws SMPLException {
		SMPLVector exp = smplRetVctStmt.getVector();
		int index = smplRetVctStmt.getIndex();
		return exp.get(index);
	}

	@Override
	public SMPLValue visitSMPLIfStmt(SMPLIfStmt smplIfStmt, SMPLContext state) throws SMPLException {
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
	public SMPLValue visitSMPLLetStmt(SMPLLetStmt smplLetStmt, SMPLContext state) throws SMPLException {
		SMPLStmtSequence body = smplLetStmt.getBody();

		return body.visit(this, state);
	}

	@Override
	public SMPLValue visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, SMPLContext state) throws SMPLException {
		SMPLValue result = (SMPLValue) smplStmtDefinition.getExp().visit(this, state);
		state.putSMPLVal(smplStmtDefinition.getVar(), result);
		return result;
	}

	@Override
	public SMPLValue visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext context) throws SMPLException {
		String funName = smplFunCall.getFunName();
		ArrayList<ASTExp<SMPLExp>> argExps = smplFunCall.getArgExps();

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


		return new SMPLCompoundValue(this, function.getBody(), newEnvironment);
	}


	@Override
	public SMPLValue visitSMPLisPairStmt(SMPLisPairStmt smplisPairStmt, SMPLContext arg) throws SMPLException {
		return new SMPLBoolean(smplisPairStmt.getPair().equals("Vector"));
	}

	@Override
	public SMPLValue visitSMPLVectorExp(SMPLVectorExp smplVectorExp, SMPLContext context) throws SMPLException {
		ArrayList<ASTExp<SMPLExp>> contents = smplVectorExp.getExplist();
		ArrayList<SMPLValue> container = new ArrayList<>();
		for (int i = 0; i < contents.size(); i++) {
			ASTExp curr = contents.get(i);
			container.add((SMPLValue) curr.visit(this, context));
		}
		return (new SMPLVector(container));
	}

	@Override
	public SMPLValue visitSMPLCaseFunction(SMPLCaseFunction smplCaseFunction, SMPLContext state) throws SMPLException {
		for(SMPLCaseStmt stmt : smplCaseFunction.getCaseStmts()){
			if(stmt.getPredicate().visit(this.condEval,state)){
				return stmt.getConsequent().visit(this,state);
			}
		}

		return smplCaseFunction.getFinalCase().visit(this,state);
	}

	@Override
	public SMPLValue visitSMPLSizeStmt(SMPLSizeStmt sizeStmt, SMPLContext state) throws SMPLException {
		return new SMPLInteger(sizeStmt.getVector().size());
	}


	@Override
	public SMPLValue visitSMPLIsEqualStmt(SMPLIsEqualStmt stmt, SMPLContext state) throws SMPLException {
		return new SMPLBoolean(stmt.isEqual());
	}

	@Override
	public SMPLValue visitSMPLIsEqvStmt(SMPLIsEqvStmt stmt, SMPLContext state) throws SMPLException {
		return new SMPLBoolean(stmt.isEquivalent());
	}

	@Override
	public SMPLValue visitSMPLCarStmt(SMPLCarStmt smplCarStmt, SMPLContext context) throws SMPLException {
		return (SMPLValue) smplCarStmt.ret();
	}

	@Override
	public SMPLValue visitSMPLCdrStmt(SMPLCdrStmt smplCdrStmt, SMPLContext context) throws SMPLException {
		return (SMPLValue) smplCdrStmt.ret();
	}

	@Override
	public SMPLValue visitSMPLFunDef(SMPLFunDef smplFunDef, SMPLContext state) throws SMPLException {
		SMPLFunction function = new SMPLFunction(smplFunDef.getFunctionName(), smplFunDef.getParameters(), smplFunDef.getStatements(), state);

		return null;
	}

	@Override
	public SMPLValue visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException {
		return state.getSMPLValue(var.getId());
	}


	public SMPLValue<ASTExp> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException {
		throw new SMPLException("Unknown unary operation applied to value: " +
				exp);
	}

	public SMPLValue<ASTExp> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException {
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