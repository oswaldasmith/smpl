package com.comp3652.values;

import com.comp3652.lang.BoolExp;

/**
 * Created by carlos on 12/27/15.
 */
<<<<<<< HEAD
public class SMPLBoolean extends SMPLValue<Boolean> {

    private boolean value;

    public SMPLBoolean(BoolExp vector) {
        this.value = vector.getVal();
=======
public class SMPLBoolean extends SMPLValue<BoolExp> {

    private boolean value;

    public SMPLBoolean(BoolExp value) {
        super(value);
        this.value = value.getVal();

>>>>>>> master
    }

    public SMPLBoolean(Boolean equal) {
        super();
    }

<<<<<<< HEAD
    public SMPLBoolean(int value) {
        this.value = (value == 0) ? false : true;
    }
=======
>>>>>>> master

    @Override
	public String toString() {
		return (value) ? "true" : "false";
	}
}