package com.comp3652.values;


public class SMPLCharacter extends SMPLValue<Character> {

	public SMPLCharacter(char newValue) {
		value = newValue;
	}

	public SMPLCharacter(int intValue) {
		// TODO - fix this
		value = (Character) (char) intValue;
	}

	public Character getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}