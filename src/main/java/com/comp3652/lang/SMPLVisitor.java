package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	public T visitSMPLProgram(SMPLProgram program, S state) throws SMPLException;

	public T visitSMPLStmtSequence(SMPLStmtSequence seq, S state) throws SMPLException;

	public T visitSMPLDefinition(SMPLStmtDefinition def, S state) throws SMPLException; 

	public T visitSMPLFunCall(SMPLFunCall funCall, S state) throws SMPLException;

	public T visitSMPLFunDef(SMPLFunDef funDef, S state) throws SMPLException;
}