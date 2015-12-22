package com.comp3652.lang;

import com.comp3652.sys.*;

public class SMPLAssignment extends SMPLStatement {

	protected String var;
	protected AST exp;

	public SMPLAssignment(String id, ASTNode exp) {
		this.var = id;
		this.exp = exp;
	}

	public final String getVar() {
		return var;
	}

	public final ASTExp<SMPLExp> getExp() {
		return exp;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLAssignment(this, state);
	}
}