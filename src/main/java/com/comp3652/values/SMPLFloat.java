package com.comp3652.values;

import com.comp3652.lang.AIRExpFrac;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLFloat extends SMPLValue<Float> {

	public SMPLFloat(float newValue) {
		value = newValue;
	}

	public SMPLFloat(Float newValue) {
		value = newValue;
	}

    @Override
    public String toString(){
        return "" + value;
    }
}
