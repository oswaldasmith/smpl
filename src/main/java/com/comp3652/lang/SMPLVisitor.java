package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	public T visitSMPLProgram(SMPLProgram smplProgram, S state) throws SMPLException;

	public T visitSMPLProgram(SMPLSequence seq, S state) throws SMPLException;

	public T visitSMPLAssignment(SMPLAssignment assignment, S state) throws SMPLException;

	public T visitSMPLConditional(SMPLConditional cond, S state) throws SMPLException;

	public T visitSMPLFunCall(SMPLFunCall funCall, S state) throws SMPLException;

	public T visitSMPLFunDef(SMPLFunDef funDef, S state) throws SMPLException;
}