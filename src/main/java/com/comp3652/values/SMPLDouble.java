package com.comp3652.values;


public class SMPLDouble extends SMPLValue<SMPLDouble> {
	
	protected double value;

	public SMPLDouble(double newValue) {
		value = newValue;
	}

	public double getValue(){
		return value;
	}

	@Override
	public String toString() {
		return "" + double;
	}
}