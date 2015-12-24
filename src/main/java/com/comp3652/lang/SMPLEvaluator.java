package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

<<<<<<< HEAD
public class SMPLEvaluator extends SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {

	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	private SMPLValue<SMPLExp> lastResult;

	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator();
		lastResult = SMPLValue.DEFAULT;

	}

	public SMPLValue<SMPLExp> getLastValue() {
		return lastResult;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLProgram(SMPLProgram program, SMPLContext state) 
	throws SMPLException {
		SMPLSequence stmts = program.getSequence();
		return stmts.visit(this, state);
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSequence(SMPLSequence seq, SMPLContext state) 
	throws HPLException {
		ArrayList<SMPLStatement> stmts = seq.getStatements();
		SMPLValue<SMPLExp> result = SMPLValue.DEFAULT;

		for (SMPLStatement stmt : stmts)
			result = stmt.visit(this, state);

		return result;
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLFunDef(SMPLFunDef funDef, SMPLContext state) 
	throws SMPLException {
		SMPLFun
	}
	
	@Override
	public SMPLValue<SMPLExp> visitSMPLDefinition(SMPLDefinition def, SMPLContext state) 
	throws SMPLException {

	} 

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall funCall, SMPLContext state) 
	throws SMPLException {

	}

	
=======
public class SMPLEvaluator implements SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {
	
	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator(arithEval);
		lastResult = SMPLValue.DEFAULT;
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLProgram(SMPLProgram program, SMPLContext state) throws SMPLException {
		SMPLStmtSequence stmts = program.getSeq();
		SMPLValue tmp = stmts.visit(this, state);

		return lastResult;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtSequence(SMPLStmtSequence s, SMPLContext state) throws SMPLException {
		ArrayList<SMPLStatement> stmts = s.getStatements();
		SMPLValue result = SMPLValue.DEFAULT;

		for (SMPLStatement stmt : stmts) {
			result = stmt.visit(this, state);
		}

		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLAssignment(SMPLAssignment smplAssignment, SMPLContext state) throws SMPLException {
		SMPLValue result = smplAssignment.getExp().visit(this, state);
		state.putF(smplAssignment.getVar(), (SMPLFunction) result);
		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLPrintStmt(SMPLPrintStmt printStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLReadStmt(SMPLReadStmt smplReadStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLSubStrStmt(SMPLSubStrStmt smplSubStrStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLCaseStmt(SMPLCaseStmt smplCaseStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitRetVctStmt(SMPLRetVctStmt smplRetVctStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunDef(SMPLFunDef smplFunDef, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLIfStmt(SMPLIfStmt smplIfStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLLetStmt(SMPLLetStmt smplLetStmt, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, SMPLContext state) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, SMPLContext context) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitStringExp(StringExp stringExp, SMPLContext state) throws SMPLException {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, SMPLContext arg) {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		return null;
	}

	public SMPLContext mkInitialContext() {
		return new SMPLContextImpl();
	}

	public SMPLValue getResult() {
		return lastResult;
	}
>>>>>>> chadsmpl
}