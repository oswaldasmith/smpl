package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.sun.org.apache.bcel.internal.generic.InstructionComparator;

import java.util.ArrayList;

/**
 * Created by carlos on 12/28/15.
 */
public abstract class SMPLValue <T> {
    public static final SMPLValue DEFAULT = null;
    private T value;

    public SMPLValue(T value) {
        this.value = value;
    }

    public SMPLValue() {
        value = null;
    }


}
