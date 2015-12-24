package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;

import java.util.*;

public class SMPLFunDef extends SMPLStatement {

	protected String name;

	protected List<String> numericParams;
	protected List<String> vectorParams;
	protected ArrayList<String> params;
	protected SMPLSequence statements;

	public SMPLFunDef(String functionName, ArrayList args,
		SMPLSequence body) {
		name = functionName;
		params = args;
		statements = body;
	}

	public String getFunctionName() {
		return name;
	}

	public ArrayList<String> getParameters() {
		return params;
	}

	public SMPLSequence getStatements() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLFunctionDefinition(this, state);
	}
}