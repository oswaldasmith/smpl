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
	public SMPLValue<SMPLExp> visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, SMPLContext state) {
		//#TODO
		return null;
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
	public SMPLValue<SMPLExp> visitSMPLLetStmt(SMPLLetStmt smplLetStmt, SMPLContext state) {
		//#TODO
		return null;
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
				.extendF(new ArrayList<String>(), new ArrayList<SMPLFunction>());

		// also extend with bindings for numerical parameters
		// newEnvironment = newEnvironment.extendN(numericalFormalParameters, numericalArguments);

		// and we extend with empty function frame to keep local functions local
		// newEnvironment = newEnvironment.extendF(new ArrayList<String>(), new ArrayList<HPLFunction>());
		// now return a painter that will execute the body when rendered.
		return new CompoundSMPLValue(this, function.getBody(), newEnvironment);
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, SMPLContext arg) {
		//#TODO
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