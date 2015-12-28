package com.comp3652.values;

import com.comp3652.lang.StringExp;

/**
 * Created by carlos on 12/27/15.
 */
public class SMPLString extends SMPLValue<StringExp> {
    private  String value;

    public SMPLString(String string) {
        this.value = string;
    }

    @Override
    public String toString(){
        return value;
    }
}
