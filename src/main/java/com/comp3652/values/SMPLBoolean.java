package com.comp3652.values;


public class SMPLBoolean extends SMPLValues<SMPLBoolean> {

	protected boolean value;

	public SMPLBoolean(boolean newValue) {
		value = newValue;
	}

	public boolean getValue() {
		return value;
	}

	@Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}