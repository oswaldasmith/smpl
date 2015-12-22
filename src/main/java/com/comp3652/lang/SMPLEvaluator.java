package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import java.util.*;

public class SMPLEvaluator extends SMPLVisitor<SMPLContext, SMPLValue> {

	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	

	// change this
	Double lastResult;

	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator();
		lastResult = 0;

		init();
	}

	@Override
	public SMPLValue visitSMPLProgram(SMPLProgram program, S args) 
	throws SMPLException {
		SMPLSequence stmts = program.getSequence();
		

	}

	@Override
	public SMPLValue visitSMPLSequence(SMPLSequence seq, S state) 
	throws HPLException {

	}
}