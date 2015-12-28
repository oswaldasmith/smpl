package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import java.util.ArrayList;

/**
 * Created by carlos on 12/19/15.
 */
// public abstract class SMPLValue<T extends SMPLExp> extends SMPLExp {
//     public static final SMPLValue<PrimitiveSMPLValue> DEFAULT =  new PrimitiveSMPLValue();
public abstract class SMPLValue <T> extends ArrayList<ASTExp> {

    public static final SMPLValue DEFAULT =  new PrimitiveSMPLValue();
    private ArrayList<T> values;

    private T value;

    public SMPLValue(){
        this.value = (T) this.DEFAULT;
    }

    public SMPLValue(T value) {
    	this.value = value;
    }

    public SMPLValue(ArrayList<ASTExp> container) {
        this.values = (ArrayList<T>) container;
    }

    public SMPLValue(Boolean val) {
        this.value = (T) val;
    }

    public T getType() {
    	return (T) value.getClass();
    }

    public T getValue() {
    	return value;
    }

    public ArrayList<T> getValues() {
        return values;
    }

    public void setValue(SMPLValue smplValue){
        this.value = (T) smplValue;
    }
}
