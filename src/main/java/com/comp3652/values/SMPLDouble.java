package com.comp3652.values;


public class SMPLDouble extends SMPLValue<Double> {
	
	public SMPLDouble(double newValue) {
		value = newValue;
	}

	public SMPLDouble(Double newValue) {
		value = newValue;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}