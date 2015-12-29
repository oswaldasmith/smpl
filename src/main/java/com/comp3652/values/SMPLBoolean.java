package com.comp3652.values;

import com.comp3652.lang.BoolExp;
import com.comp3652.lang.SMPLExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLBoolean extends SMPLValue<Boolean> {

    private boolean value;

    public SMPLBoolean(BoolExp vector) {
        this.value = vector.getVal();
    }

    public SMPLBoolean(Boolean equal) {
        this.value = equal.booleanValue();
    }

    public SMPLBoolean(int value) {
        this.value = (value == 0) ? false : true;
    }

    @Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}