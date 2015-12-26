package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;
import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;

public class SMPLEvaluator implements SMPLVisitor<SMPLContext, SMPLValue<SMPLExp>> {
	
	private final ArithEvaluator arithEval;
	private final CIREvaluator condEval;
	private final StringEvaluator stringEval;
	Map<String, SMPLFunction> baseFuncMap;
	SMPLValue lastResult; // collects results


	public SMPLEvaluator() {
		arithEval = new ArithEvaluator();
		condEval = new CIREvaluator(arithEval);
		stringEval = new StringEvaluator();
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
		state.putV(smplAssignment.getVar(), result);
		return result;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLFunCall(SMPLFunCall smplFunCall, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLPrintStmt(SMPLPrintStmt printStmt, SMPLContext state) throws SMPLException {
		StringExp stringExp = printStmt.getExp();
		SMPLValue v = stringExp.visit(this,state);
		return v;
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
	public SMPLValue<SMPLExp> visitSMPLIfStmt(SMPLIfStmt smplIfStmt, SMPLContext state) throws SMPLException {
		ASTExp<CIRExp> conditionalExpression = smplIfStmt.getCondExp();
		SMPLStmtSequence alternativeBody = smplIfStmt.getAlternative();
		Boolean conditionalEval = conditionalExpression.visit(condEval,state);
		boolean shouldExecute = conditionalEval.booleanValue();
		if (shouldExecute) {
			SMPLStmtSequence statements = smplIfStmt.getBody();
			statements.visit(this, state);
			return SMPLValue.DEFAULT;
		} else{
			if(alternativeBody != null){
				alternativeBody.visit(this, state);
				return SMPLValue.DEFAULT;
			}

		}
		return SMPLValue.DEFAULT;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLLetStmt(SMPLLetStmt smplLetStmt, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLStmtDefinition(SMPLStmtDefinition smplStmtDefinition, SMPLContext state) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitSMPLExpFunCall(SMPLExpFunCall smplExpFunCall, SMPLContext context) {
		//#TODO
		return null;
	}


	@Override
	public SMPLValue<SMPLExp> visitSMPLisPairStmt(SMPLisPairStmt smpLisPairStmt, SMPLContext arg) {
		//#TODO
		return null;
	}

	@Override
	public SMPLValue<SMPLExp> visitVar(ASTVar<SMPLExp> var, SMPLContext state) throws SMPLException, SMPLException {
		return state.getSMPLValue(var.getId());
	}

	@Override
	public SMPLValue<SMPLExp> visitUnaryExp(ASTUnaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		throw new SMPLException("Unknown unary operation applied to value: " +
				exp);
	}

	@Override
	public SMPLValue<SMPLExp> visitBinaryExp(ASTBinaryExp<SMPLExp> exp, SMPLContext state) throws SMPLException, SMPLException {
		throw new SMPLException("Unknown binary operation applied to values: " +
				exp);
	}

	public SMPLContext mkInitialContext() {
		return new SMPLContextImpl();
	}

	public SMPLValue getResult() {
		return lastResult;
	}
}