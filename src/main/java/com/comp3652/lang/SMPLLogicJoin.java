package com.comp3652.lang;


public class SMPLLogicJoin extends SMPLStatement {

	protected ASTExp<SMPLExp> leftExp, rightExp;
	protected String operator;

	public SMPLLogicJoin(ASTExp<SMPLExp> left, ASTExp<SMPLExp> right, String op) {
		leftExp = left;
		rightExp = right;
		operator = op;
	}

	public ASTExp<SMPLExp> getLeftExpression(){
		return leftExp;
	}

	public ASTExp<SMPLExp> getRightExpression(){
		return rightExp;
	}

	public String getOperator() {
		return operator;
	}

	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLLogicJoin(this, state);
	}
}