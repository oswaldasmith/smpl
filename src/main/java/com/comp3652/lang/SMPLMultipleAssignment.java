package com.comp3652.lang;

import java.util.*;

public class SMPLMultipleAssignment extends SMPStatement {

	protected List<String> varList;
	protected ASTExp<SMPLExp> exp;

	public SMPLMultipleAssignment(ArrayList<String> vars, ASTExp<SMPLExp> exp) {
		this.varList = vars;
		this.exp = exp;
	}

	public ArrayList<String> getVariables() {
		return varList;
	}

	public ASTExp<SMPLExp> getExpression() {
		return exp;
	}

	public <S, T> T visit(SMPLVisitor<S, T> v, S state) {
		return v.visitSMPLMultipleAssignment(this, state);
	}
}