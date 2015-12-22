package com.comp3652.values;


public class SMPLInteger extends SMPLValue<SMPLInteger> {

	protected int value;

	public SMPLInteger(int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}