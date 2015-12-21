package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface CIRVisitor<S, T> extends ASTVisitor<CIRExp, S, T> {

	@Override
	public Boolean visitCIRExp(CIRExp exp, S state) throws SMPLException {

	}
}