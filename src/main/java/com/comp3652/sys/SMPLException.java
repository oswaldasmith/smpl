package com.comp3652.sys;

public class SMPLException extends Exception {

	public static final long serialVersionUID= 1L;

	SMPLException cause;

	public SMPLException() {
		super();
	}

	public SMPLException(String s) {
		super(s);
	}

	public SMPLException(String s, SMPLException smple) {
		super(e);
		cause = smple;
	}

	public String report() {
		if (null == cause)
			return getMessage();
		else
			return getMessage() + " caused by " + cause.report();
	}
}