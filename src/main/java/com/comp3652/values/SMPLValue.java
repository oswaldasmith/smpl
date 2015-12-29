package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import java.util.ArrayList;

/**
 * Created by carlos on 12/19/15.
 */
// public abstract class SMPLValue<T> extends ArrayList<ASTExp> {
public abstract class SMPLValue<T> {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();

    protected T value;

    public T getValue() {
        return value;
    }
}
