package com.comp3652.lang;

import java.util.*;

public class SMPLFunCall extends SMPLStatement {
	protected final String funName;
	protected final ArrayList<SMPLExp> argExps;

	public SMPLFunCall(String name, ArrayList<SMPLExp> args) {
		funName = name;
		argExps = args;
	}

	public String getFunctionName() {
		return funName;
	}

	public ArrayList<SMPLExp> getArgExps() {
		return argExps;
	}

	@Override
	public T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLFunctionCall(this, state);
	}
}