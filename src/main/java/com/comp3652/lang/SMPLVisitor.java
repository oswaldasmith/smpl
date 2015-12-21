package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	public T visitSMPLProgram(SMPLProgram program, S state);

	public T visitSMPLStmtSequence(SMPLStmtSequence s);

	public T visitSMPLAssignment(SMPLAssignment smplAssignment, S state);
}