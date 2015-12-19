package com.comp3652.lang;


public class SMPLProgram extends SMPLStatement {

	protected SMPLSequence statements;

	public SMPLSe (SMPLSequence stmts) {
		statements = stmts;
	}

	public SMPLSequence getSequence() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLProgram(this, state);
	}
}