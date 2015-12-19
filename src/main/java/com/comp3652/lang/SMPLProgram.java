package com.comp3652.lang;


public class SMPLProgram extends SMPLStatement {

	protected SMPLProgram statements;

	public SMPLProgram (SMPLSequence stmts) {
		statements = stmts;
	}

	public SMPLSequence getSequence() {
		return statements;
	}

	@Override
	public <S, T> T visit()
}