package com.comp3652.values;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLValue <T> {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();

    public void render(){};

}
