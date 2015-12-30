package com.comp3652.values;

import com.comp3652.lang.BoolExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLBoolean extends SMPLValue<BoolExp> {

    private boolean value;

    public SMPLBoolean(BoolExp value) {
        super(value);
        this.value = value.getVal();

    }

    public SMPLBoolean(Boolean equal) {
        super();
        this.value = equal.booleanValue();
    }


    @Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}