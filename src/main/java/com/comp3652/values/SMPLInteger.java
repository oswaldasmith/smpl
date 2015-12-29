package com.comp3652.values;


public class SMPLInteger extends SMPLValue<Integer> {

	public SMPLInteger(int newValue) {
		value = Integer.valueOf(newValue);
	}

	public SMPLInteger(Integer newValue) {
		value = newValue;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}