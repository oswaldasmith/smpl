package com.comp3652.lang;


public class SMPLCaseExp {

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

}