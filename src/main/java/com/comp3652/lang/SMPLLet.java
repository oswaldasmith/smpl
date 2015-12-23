package com.comp3652.lang;


public class SMPLLet extends SMPLStatement {

	protected ArrayList<SMPLExp> bindings;
	protected SMPLSequence body;

	public SMPLLet(ArrayList<SMPLExp> params, SMPLSequence sequence) {
		bindings = params;
		body = sequence;
	}

	public SMPLLet(ArrayList<SMPLExp> params, SMPLStatement stmt) {
		bindings = params;
		body = new SMPLSequence();
		body.add(stmt);
	}

	public ArrayList<SMPLExp> getBindings() {
		return bindings;
	}

	public SMPLSequence getBody() {
		return body;
	}

	@Override
	public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLLet(this, state);
	}
}