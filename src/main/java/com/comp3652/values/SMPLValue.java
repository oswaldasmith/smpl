package com.comp3652.values;

import com.comp3652.lang.SMPLExp;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLValue<T extends SMPLExp> extends SMPLExp {

<<<<<<< HEAD
    public static final SMPLValue<PrimitiveSMPLValue> DEFAULT =  new PrimitiveSMPLValue();

    public T getType() {
    	return T;
=======
    private T value;

    public SMPLValue(){
        this.value = (T) this.DEFAULT;
    }

    public SMPLValue(T value) {
    	this.value = value;
    }

    public T getType() {
    	return (T) value.getClass();
    }

    public T getValue() {
    	return value;
>>>>>>> chadsmpl
    }
}
