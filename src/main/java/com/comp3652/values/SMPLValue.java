package com.comp3652.values;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLValue <T> {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();

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
    }
}
