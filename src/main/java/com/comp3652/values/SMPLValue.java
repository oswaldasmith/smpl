package com.comp3652.values;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLValue<T> extends SMPLExp {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();

    protected exp;

    public SMPLValue(SMPLExp exp) {
    	
    }

    public T getType() {
    	return T;
    }
}
