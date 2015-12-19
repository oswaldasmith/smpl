package com.comp3652.lang;

import java.util.HashMap;

public class CIREvaluator implements CIRVisitor<HPLContext, Boolean> {

	protected ArithEvaluator arithEval;

	public CIREvaluator(ArithEvaluator ae){
		arithEval = ae;
	}

	@Override
	public Boolean visitCIRExp(CIRExp exp, HPLContext state) throws HPLException {
		HPLEnvironment<Double> numEnv = state.getNumEnv();
		String comparator = exp.getComparator();
		switch (comparator){
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
				throw new HPLException("Invalid comparator.");
		}
	}

	@Override
	public Boolean visitVar(ASTVar<CIRExp> var, HPLContext state) throws HPLException {
		throw new HPLException("Unimplemented.");
	}

	@Override
    public Boolean visitUnaryExp(ASTUnaryExp<CIRExp> exp, HPLContext state)
	throws HPLException  {
	// should never get here unless language changes
	throw new HPLException("Unimplemented.");
    }
    
    @Override
    public Boolean visitBinaryExp(ASTBinaryExp<CIRExp> exp, HPLContext state)
	throws HPLException {
	// should never get here unless language changes
	throw new HPLException("Unimplemented.");
    }

}