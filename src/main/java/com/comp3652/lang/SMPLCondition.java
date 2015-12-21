package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class SMPLCondition extends SMPLStatement {

	ASTExp<CIRExp> conditionalExpression;
	SMPLSequence statements;

	public PIRConditional(ASTExp<CIRExp> cExp, SMPLSequence seq) {
		conditionalExpression = cExp;
		statements = seq;
	}

	public ASTExp<CIRExp> getConditionalExpression() {
		return conditionalExpression;
	}

	public SMPLSequence getStatements() {
		return statements;
	}

	@Override
	public <S, T> T visit(HPLVisitor<S, T> v, S state) throws HPLException {
		return v.visitPIRConditional(this, state);
	}

}