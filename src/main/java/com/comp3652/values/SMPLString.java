package com.comp3652.values;


public class SMPLString extends SMPLValue<SMPLString> {

	protected String value;

	public SMPLString(String string) {
		// TODO
		// should probably format
		value = string;
	}

	@Override
	public String toString() {
		return value;
	}
}