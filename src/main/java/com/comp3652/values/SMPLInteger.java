package com.comp3652.values;


import com.comp3652.lang.AIRExpInt;

import java.util.ArrayList;

public class SMPLInteger extends SMPLValue<AIRExpInt> {

	protected Double value;

	public SMPLInteger(AIRExpInt newValue) {
		super(newValue);
		value = newValue.getVal();
	}

	public SMPLInteger(int size) {
		value = new Double(size);
	}

	public SMPLInteger(Double val) {
		value = val;
	}

	public AIRExpInt getValue() {
		return null;
	}

	public ArrayList<AIRExpInt> getValues() {
		return null;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}