package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import java.util.*;

public class SMPLEvaluator extends SMPLVisitor<SMPLContext, SMPLValue<T>> {
	
	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator();
		lastResult = SMPLValue.DEFAULT;
	}


	@Override
	public SMPLValue<T> visitSMPLProgram(SMPLProgram program, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<T> visitSMPLStmtSequence(SMPLStmtSequence s) {
		return null;
	}

	@Override
	public SMPLValue<T> visitSMPLAssignment(SMPLAssignment smplAssignment, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<T> visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<T> visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<T> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<T> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	public SMPLContext mkInitialContext() {
	}

	public SMPLValue getResult() {
		return lastResult;
	}
}