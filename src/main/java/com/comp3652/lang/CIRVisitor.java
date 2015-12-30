package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface CIRVisitor<S, T> extends ASTVisitor<CIRExp, S, T> {

	public T visitCIRExp(CIRExp exp, S state) throws SMPLException;

}