package com.comp3652.values;

// public class SMPLBoolean extends SMPLPrimitive<SMPLBoolean> {

// 	protected boolean value;

// 	public SMPLBoolean(boolean newValue) {
// 		value = newValue;
// 	}

// 	public boolean getValue() {
// 		return value;
// 	}

// 	@Override
// 	public String toString() {
// 		return (value) ? "true" : "false";
// 	}
// }

import com.comp3652.lang.BoolExp;
import com.comp3652.lang.SMPLExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLBoolean extends SMPLValue<SMPLExp> {

    private boolean value;

    public SMPLBoolean(BoolExp vector) {
        this.value = vector.getVal();

    }

    public SMPLBoolean(Boolean equal) {
        this.value = equal.booleanValue();
    }

    @Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}