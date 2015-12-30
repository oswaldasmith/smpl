package com.comp3652.values;


import com.comp3652.lang.StringExp;

public class SMPLString extends SMPLValue<StringExp> {

	public String value;

	public SMPLString(StringExp newValue) {
		super(newValue);
		value = newValue.getString();
	}

	public SMPLString(String s) {
		value = s;
	}

	@Override
	public String toString() {
		return " " + value;
	}
}