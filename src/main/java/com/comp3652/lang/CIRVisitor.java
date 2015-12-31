package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface CIRVisitor<S, T> extends ASTVisitor<SMPLExp, S, T> {
	T visitCIRExp(CIRExp exp, S state) throws SMPLException;
}