package com.comp3652.lang;

import java.util.*;

public class SMPLCaseStatement extends SMPLStatement {

	List<SMPLStatement> statements

	public SMPLCase(ArrayList<SMPLStatement> newStatements) {
		statements = newStatements;
	}

	public ArrayList<SMPLStatement> getStatements() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) {
		return v.visitSMPLCaseStatement(this, state);
	}
}