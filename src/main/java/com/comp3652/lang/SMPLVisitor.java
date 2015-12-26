package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	T visitSMPLProgram(SMPLProgram program, S state) throws SMPLException;

	T visitSMPLStmtSequence(SMPLStmtSequence s, S state) throws SMPLException;

	T visitSMPLAssignment(SMPLAssignment smplAssignment, S state) throws SMPLException;

	T visitSMPLFunCall(SMPLFunCall smplFunCall, S state);

	T visitSMPLPrintStmt(SMPLPrintStmt printStmt, S state) throws SMPLException;

	T visitSMPLReadStmt(SMPLReadStmt smplReadStmt, S state);

	T visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, S state);

	T visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, S state);

	T visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, S state);

	T visitSMPLFunDef(SMPLFunDef smplFunDef, S state);

	T visitSMPLIfStmt(SMPLIfStmt smplIfStmt, S state) throws SMPLException;

	T visitSMPLLetStmt(SMPLLetStmt smplLetStmt, S state);

	T visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, S state) throws SMPLException;

	T visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, S context) throws SMPLException;

	T visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, S arg);
}