package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import com.comp3652.lang.SMPLVectorExp;

import java.util.*;

public class SMPLVector extends SMPLValue<ArrayList<SMPLValue>> {

    private ArrayList<SMPLValue> values;

    public SMPLVector(ArrayList<SMPLValue> newValues) {
        value = newValues;
    }

    public SMPLVector(SMPLValue newValue) {
        value = new ArrayList<>();
        value.add(newValue);
    }

    // should remove
    public int size() {
        return values.size();
    }


    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < value.size() - 1; i++)
         output += value.get(i).getValue().toString() + ", ";

        if (values.size() > 0)
         output += value.get(value.size() - 1) + " ";

        return "[: " + output + "]";
    }

    public SMPLValue get(int index) {
        return value.get(index);
    }
}