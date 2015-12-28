package com.comp3652.values;


public class SMPLChar extends SMPLValue<SMPLChar> {

	public char value;

	public SMPLChar(char newValue) {
		value = newValue;
	}

	public SMPLChar(int intValue) {
		value = Character.toChars(intValue);
	}

	public char getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}