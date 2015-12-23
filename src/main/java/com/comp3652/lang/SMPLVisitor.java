package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	public T visitSMPLProgram(SMPLProgram program, S state) throws SMPLException;

	public T visitSMPLSequence(SMPLSequence seq, S state) throws SMPLException;

	public T visitSMPLDefinition(SMPLDefinition def, S state) throws SMPLException; 

	public T visitSMPLFunctionCall(SMPLFunCall funCall, S state) throws SMPLException;

	public T visitSMPLFunctionDefinition(SMPLFunDef funDef, S state) throws SMPLException;

	public T visitSMPLCondition(SMPLCondition condition, S state) throws SMPLException;

	public T visitSMPLLogicJoin(SMPLLogicJoin join, S state) throws SMPLException;

	public T visitSMPLLogicNot(SMPLLogicNot not, S state) throws SMPLException;

	public T visitSMPLAssignment(SMPLAssignment assign, S state) throws SMPLException;

	public T visitSMPLMultipleAssignment(SMPLMultipleAssignment mulAssign, S state) throws SMPLException;

	public T visitSMPLLet(SMPLLet let, S state) throws SMPLException;

	public T visitSMPLPair(SMPLPairExp pair, S state) throws SMPLException;

	public T visitSMPLVector(SMPLVectorExp vector, S state) throws SMPLException;

	public T visitSMPLCaseStatement(SMPLCaseStatement case, S state) throws SMPLException;

	public T visitSMPLCaseExpression(SMPLCaseExp exp, S state) throws SMPLException;
}