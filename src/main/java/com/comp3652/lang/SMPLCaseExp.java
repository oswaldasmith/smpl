package com.comp3652.lang;


public class SMPLCaseExp extends SMPLStatement {

	protected CIRExp pred;
	protected SMPLStmtSequence body;

	protected SMPLCaseExp(CIRExp predicate,
		SMPLStmtSequence body) {

		this.pred = predicate;
		this.body = body;
	}

	public CIRExp getPredicate() {
		return pred;
	}

	public SMPLStmtSequence getBody() {
		return body;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) {
		v.visitSMPLCaseStmt(this, state);
	}
}