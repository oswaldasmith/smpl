package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLEnvironment;
import com.comp3652.sys.SMPLException;

public class CIREvaluator implements CIRVisitor<SMPLContext, Boolean> {

	protected ArithEvaluator arithEval;
	protected BooleanEvaluator boolEval;

	public CIREvaluator(ArithEvaluator arithEval) {
		this.arithEval = arithEval;
	}

	@Override
	public Boolean visitCIRExp(CIRExp exp, SMPLContext state) throws SMPLException {
		SMPLEnvironment<Double> numEnv = state.getNumEnv();
		SMPLEnvironment<Boolean> boolEnv = state.getBoolEnv();
		String comp = exp.getComparator();

		switch (comp) {
			case "<":
				return numEnv.get(String.valueOf(exp.getId())) < exp.getArithExp().visit(arithEval, numEnv);
			case ">":
				return numEnv.get(String.valueOf(exp.getId())) > exp.getArithExp().visit(arithEval, numEnv);
			case "<=":
				return numEnv.get(String.valueOf(exp.getId())) <= exp.getArithExp().visit(arithEval, numEnv);
			case ">=":
				return numEnv.get(String.valueOf(exp.getId())) >= exp.getArithExp().visit(arithEval, numEnv);
			case "==":
				return numEnv.get(String.valueOf(exp.getId())) == exp.getArithExp().visit(arithEval, numEnv);
			case "!=":
				return numEnv.get(String.valueOf(exp.getId())) != exp.getArithExp().visit(arithEval, numEnv);
			case "and":
				return boolEnv.get(String.valueOf(exp.getId())) && exp.getBoolExp().visit(boolEval, boolEnv);
			case "not":
				return !(boolEnv.get(String.valueOf(exp.getId())));
			case "or" :
				return boolEnv.get(String.valueOf(exp.getId())) || exp.getBoolExp().visit(boolEval, boolEnv);
			default:
				throw new SMPLException("Invalid comparator.");
		}
	}

	@Override
	public Boolean visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException {
		throw new SMPLException("Unimplemented.");
	}

	@Override
	public Boolean visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state)
	throws SMPLException  {
		// should never get here unless language changes
		throw new SMPLException("Unimplemented.");
	}

	@Override
	public Boolean visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state)
	throws SMPLException {
		// should never get here unless language changes
		throw new SMPLException("Unimplemented.");
	}


}