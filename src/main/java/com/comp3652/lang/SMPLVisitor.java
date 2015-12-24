package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	T visitSMPLProgram(SMPLProgram program, S state);

	T visitSMPLStmtSequence(SMPLStmtSequence s, S state);

	T visitSMPLAssignment(SMPLAssignment smplAssignment, S state);

	T visitSMPLFunCall(SMPLFunCall smplFunCall, S state);

	T visitSMPLPrintStmt(SMPLPrintStmt printStmt, S state);

	T visitSMPLReadStmt(SMPLReadStmt smplReadStmt, S state);

	T visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, S state);

	T visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, S state);

	T visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, S state);

	T visitSMPLFunDef(SMPLFunDef smplFunDef, S state);

	T visitSMPLIfStmt(SMPLIfStmt smplIfStmt, S state);

	T visitSMPLLetStmt(SMPLLetStmt smplLetStmt, S state);

	T visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, S state);

	T visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, S context);

	T visitStringExp(StringExp stringExp, S state)throws SMPLException;

	T visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, S arg);
}