package com.comp3652.lang;

import com.comp3652.sys.SMPLContext;
import com.comp3652.sys.SMPLException;

public interface SMPLVisitor<S, T> extends ASTVisitor<SMPLExp,S,T> {

	T visitSMPLProgram(SMPLProgram program, S state) throws SMPLException;

	T visitSMPLStmtSequence(SMPLStmtSequence s, S state) throws SMPLException;

	T visitSMPLAssignment(SMPLAssignment smplAssignment, S state) throws SMPLException;

	T visitSMPLFunCall(SMPLFunCall smplFunCall, S state)throws SMPLException;

	T visitSMPLPrintStmt(SMPLPrintStmt printStmt, S state) throws SMPLException;

	T visitSMPLReadStmt(SMPLReadStmt smplReadStmt, S state) throws SMPLException;

	T visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, S state) throws SMPLException;

	T visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, S state) throws SMPLException;

	T visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, S state) throws SMPLException;

	T visitSMPLIfStmt(SMPLIfStmt smplIfStmt, S state) throws SMPLException;

	T visitSMPLLetStmt(SMPLLetStmt smplLetStmt, S state) throws SMPLException;

	T visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, S state) throws SMPLException;

	T visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, S context) throws SMPLException;

	T visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, S arg) throws SMPLException;

	T visitSMPLVectorExp(SMPLVectorExp smplVectorExp, S context) throws SMPLException;

	T visitSMPLCaseFunction(SMPLCaseFunction smplCaseFunction, S state) throws SMPLException;

	T visitSMPLSizeStmt(SMPLSizeStmt sizeStmt, S state) throws SMPLException;

	T visitSMPLIsEqualStmt(SMPLIsEqualStmt stmt, S state) throws SMPLException;

	T visitSMPLIsEqvStmt(SMPLIsEqvStmt stmt, S state) throws SMPLException;

	T visitSMPLCarStmt(SMPLCarStmt smplCarStmt, S context) throws SMPLException;

	T visitSMPLCdrStmt(SMPLCdrStmt smplCdrStmt, S context) throws SMPLException;

	T visitSMPLFunDef(SMPLFunDef smplFunDef, S state) throws SMPLException;
}