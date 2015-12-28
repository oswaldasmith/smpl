package com.comp3652.values;

/**
 * Created by carlos on 12/28/15.
 */
public abstract class SMPLValue <T>{
    private T value;

    public SMPLValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
