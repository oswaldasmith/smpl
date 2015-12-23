package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import java.util.*;

public class SMPLEvaluator extends SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {

	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	private SMPLValue<SMPLExp> lastResult;

	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator();
		lastResult = SMPLValue.DEFAULT;

	}

	public SMPLValue<SMPLExp> getLastValue() {
		return lastResult;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLProgram(SMPLProgram program, SMPLContext state) 
	throws SMPLException {
		SMPLSequence stmts = program.getSequence();
		return stmts.visit(this, state);
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSequence(SMPLSequence seq, SMPLContext state) 
	throws HPLException {
		ArrayList<SMPLStatement> stmts = seq.getStatements();
		SMPLValue<SMPLExp> result = SMPLValue.DEFAULT;

		for (SMPLStatement stmt : stmts)
			result = stmt.visit(this, state);

		return result;
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLFunDef(SMPLFunDef funDef, SMPLContext state) 
	throws SMPLException {
		SMPLFun
	}
	
	@Override
	public SMPLValue<SMPLExp> visitSMPLDefinition(SMPLDefinition def, SMPLContext state) 
	throws SMPLException {

	} 

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall funCall, SMPLContext state) 
	throws SMPLException {

	}

	
}