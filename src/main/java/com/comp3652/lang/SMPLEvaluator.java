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
		lastResult = SMPLValue.DEFAULT;

		init();
	}

	@Override
	public SMPLValue visitSMPLProgram(SMPLProgram program, SMPLContext args) 
	throws SMPLException {
		SMPLSequence stmts = program.getSequence();
		

	}

	@Override
	public SMPLValue visitSMPLSequence(SMPLSequence seq, SMPLContext state) 
	throws HPLException {

	}

	@Override
	public SMPLValue visitSMPLDefinition(SMPLDefinition def, SMPLContext state) 
	throws SMPLException {

	} 

	@Override
	public SMPLValue visitSMPLFunCall(SMPLFunCall funCall, SMPLContext state) 
	throws SMPLException {

	}

	@Override
	public SMPLValue visitSMPLFunDef(SMPLFunDef funDef, SMPLContext state) 
	throws SMPLException {

	}
	
}