package com.comp3652.values;


import com.comp3652.lang.AIRExpInt;

import java.util.ArrayList;

public class SMPLInteger extends SMPLValue<AIRExpInt> {

	protected int value;

	public SMPLInteger(AIRExpInt newValue) {
		super(newValue);
		value = newValue.getVal();
	}

	public AIRExpInt getValue() {
		return null;
	}

	public ArrayList<AIRExpInt> getValues() {
		return null;
	}

	public SMPLInteger(int val) {
		value = val;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}