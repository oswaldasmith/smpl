package com.comp3652.values;


public class SMPLCharacter extends SMPLValue<Character> {

	public Character value;

	public SMPLChar(char newValue) {
		value = newValue;
	}

	public SMPLChar(int intValue) {
		value = Character.toChars(intValue);
	}

	public Character getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}