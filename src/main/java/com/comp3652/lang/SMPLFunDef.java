package com.comp3652.lang;

import java.util.*;

public class SMPLFunDef extends SMPLStatement {

	protected String name;
	protected ArrayList<String> params;
	protected SMPLStmtSequence statements;

	public SMPLFunDef() {

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