package com.comp3652.values;

import com.comp3652.lang.SMPLExp;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLValue<T extends SMPLExp> extends SMPLExp {

    public static final SMPLValue<PrimitiveSMPLValue> DEFAULT =  new PrimitiveSMPLValue();

    public T getType() {
    	return T;
    }
}
