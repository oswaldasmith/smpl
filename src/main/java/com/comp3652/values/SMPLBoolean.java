package com.comp3652.values;

import com.comp3652.lang.BoolExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLBoolean extends SMPLValue<Boolean> {

    public SMPLBoolean(BoolExp value) {
        this.value = value.getVal();
    }

    public SMPLBoolean(Boolean equal) {
        this.value = equal;
    }

    @Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}