package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<> {
	
	public T visitSMPLProgram(SMPLProgram program, S args) throws SMPLException;

	public T visitSMPLSequence(SMPLSequence seq, S state) throws HPLException;

			
}