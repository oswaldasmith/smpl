package com.comp3652.values;


/**
 * Created by carlos on 12/27/15.
 */
public class SMPLString extends SMPLValue<String> {    

	public SMPLString(String newValue) {
		value = newValue;
	}

	@Override
	public String toString() {
		return " " + value;
	}
}