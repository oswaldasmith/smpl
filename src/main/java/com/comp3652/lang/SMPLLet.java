package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLLet extends SMPLStatement {

	protected ArrayList<SMPLExp> bindings;
	protected SMPLStmtSequence body;

	public SMPLLet(ArrayList<SMPLExp> params, SMPLStmtSequence sequence) {
		bindings = params;
		body = sequence;
	}

	public SMPLLet(ArrayList<SMPLExp> params, SMPLStatement stmt) {
		bindings = params;
		body = new SMPLStmtSequence();
		body.addStatement(stmt);
	}

	public ArrayList<SMPLExp> getBindings() {
		return bindings;
	}

	public SMPLStmtSequence getBody() {
		return body;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLLetStmt(this, state);
	}
}