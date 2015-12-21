package com.comp3652.lang;
import com.comp3652.sys.SMPLException;

public class SMPLProgram extends SMPLStatement {

	protected SMPLSequence statements;

	public SMPLProgram(SMPLSequence stmts) {
		statements = stmts;
	}

	public SMPLSequence getSequence() {
		return statements;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S,T> v, S state) throws SMPLException {
		return v.visitSMPLProgram(this, state);
	}

	
}