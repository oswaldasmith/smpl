package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	T visitSMPLProgram(SMPLProgram program, S state);

	T visitSMPLStmtSequence(SMPLStmtSequence s, S state);

	T visitSMPLAssignment(SMPLAssignment smplAssignment, S state);

	T visitSMPLFunCall(SMPLFunCall smplFunCall, S state);

	T visitSMPLPrintStmt(SMPLPrintStmt printStmt, S state);

	T visitSMPLReadStmt(SMPLReadStmt smplReadStmt, S state);

	T visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, S state);

	T visitSMPLExpFnCall(SMPLExpFnCall smplExpFnCall, S state);

	T visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, S state);
}