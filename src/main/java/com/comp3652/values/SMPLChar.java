package com.comp3652.values;


public class SMPLChar extends SMPLValue<SMPLChar> {

	public char value;

	public SMPLChar(char newValue) {
		value = newValue;
	}

	public char getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}