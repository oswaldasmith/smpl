package com.comp3652.values;


public class SMPLDouble extends SMPLValue<Double> {
	
	public SMPLDouble(double newValue) {
		value = Double.valueOf(newValue);
	}

	public SMPLDouble(Double newValue) {
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