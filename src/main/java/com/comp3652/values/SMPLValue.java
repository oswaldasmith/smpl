package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by carlos on 12/28/15.
 */
public abstract class SMPLValue<T> {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();

    protected T value;

    public SMPLValue(T value) {
        this.value = value;
    }

    public SMPLValue() {
        value = null;
    }

    public T getValue() {
        return value;
    }
}
