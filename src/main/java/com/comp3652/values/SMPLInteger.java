package com.comp3652.values;


import com.comp3652.lang.AIRExpInt;

public class SMPLInteger extends SMPLValue<AIRExpInt> {

	protected int value;

	public SMPLInteger(AIRExpInt newValue) {
		super(newValue);
		value = newValue.getVal();
	}

	@Override
	public String toString() {
		return "" + value;
	}
}