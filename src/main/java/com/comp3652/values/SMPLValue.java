package com.comp3652.values;


/**
 * Created by carlos on 12/28/15.
 */
public abstract class SMPLValue <T> {

    public static final SMPLValue DEFAULT = new PrimitiveSMPLValue();
    private T value;

    public SMPLValue(T value) {
        this.value = value;
    }

    public SMPLValue() {
        value = null;
    }


}
