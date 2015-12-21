package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import java.util.*;

public class SMPLEvaluator extends SMPLVisitor<SMPLContext, SMPLValue<T>> {
	
	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue result; // collects results

	// change this
	Double lastResult;

	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator();

		

		lastResult = 0;
	}

	public SMPLContext mkInitialContext() {
		SMPLContext context = new SMPLContextImpl();

		context.
	}

	@Override
	public T visitSMPLProgram(SMPLProgram program, S args) 
	throws SMPLException {
		SMPLSequence stmts = program.getSequence();
		

	}

	public T visitSMPLSequence(SMPLSequence seq, S state) 
	throws HPLException {

	}

}