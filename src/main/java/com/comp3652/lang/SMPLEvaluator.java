package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

public class SMPLEvaluator implements SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {
	
	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator(arithEval);
		lastResult = SMPLValue.DEFAULT;
	}

	//#TODO
	@Override
	public SMPLValue<SMPLExp> visitSMPLProgram(SMPLProgram program, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtSequence(SMPLStmtSequence s, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLAssignment(SMPLAssignment smplAssignment, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLPrintStmt(SMPLPrintStmt printStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLReadStmt(SMPLReadStmt smplReadStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLExpFnCall(SMPLExpFnCall smplExpFnCall, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}
}