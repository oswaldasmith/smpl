package com.comp3652.lang;


public class SMPLCaseExp extends SMPLStatement {

	protected SMPLExp pred;
	protected SMPLExp body;

	protected SMPLCaseExp(SMPLExp predicate,
		SMPLExp body) {

		this.pred = predicate;
		this.body = body;
	}

	public SMPLStatement getPredicate() {
		return pred;
	}

	public SMPLStatement getBody() {
		return body;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) {
		v.visitSMPLCaseExp(this, state);
	}
}