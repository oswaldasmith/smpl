package com.comp3652.lang;

import com.comp3652.sys.*;

import java.util.HashMap;

public class CIREvaluator implements CIRVisitor<SMPLContext, Boolean> {

	protected ArithEvaluator arithEval;

	public CIREvaluator(ArithEvaluator arithEval) {
		this.arithEval = arithEval;
	}

	@Override
	public Boolean visitCIRExp(CIRExp exp, SMPLContext state) throws SMPLException {
		SMPLEnvironment<Double> numEnv = state.getNumEnv();

		String comp = exp.getComparator();

		switch (comp) {
			case "<":
				return numEnv.get(exp.getId()) < exp.getArithExp().visit(arithEval, numEnv);
			case ">":
				return numEnv.get(exp.getId()) > exp.getArithExp().visit(arithEval, numEnv);
			case "<=":
				return numEnv.get(exp.getId()) <= exp.getArithExp().visit(arithEval, numEnv);
			case ">=":
				return numEnv.get(exp.getId()) >= exp.getArithExp().visit(arithEval, numEnv);
			case "==":
				return numEnv.get(exp.getId()) == exp.getArithExp().visit(arithEval, numEnv);
			case "!=":
				return numEnv.get(exp.getId()) != exp.getArithExp().visit(arithEval, numEnv);
			default:
				throw new SMPLException("Invalid comparator.");
		}
	}

	@Override
	public Boolean visitVar(ASTVar<CIRExp> var, SMPLContext state) throws SMPLException {
		throw new SMPLException("Unimplemented.");
	}

	@Override
	public Boolean visitUnaryExp(ASTUnaryExp<CIRExp> exp, SMPLContext state)
	throws SMPLException  {
		// should never get here unless language changes
		throw new SMPLException("Unimplemented.");
	}

	@Override
	public Boolean visitBinaryExp(ASTBinaryExp<CIRExp> exp, SMPLContext state)
	throws SMPLException {
		// should never get here unless language changes
		throw new SMPLException("Unimplemented.");
	}
}