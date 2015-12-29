package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunDef extends SMPLStatement {
	protected String name;
	protected ArrayList<String> params;
	protected SMPLStmtSequence statements;

	public SMPLFunDef(String functionName, ArrayList args,
		SMPLStmtSequence body) {
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

	public SMPLStmtSequence getStatements() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLFunDef(this, state);
	}
}