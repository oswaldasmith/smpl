package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;

import java.util.ArrayList;

public class SMPLVector extends SMPLValue<SMPLExp> {
    private ArrayList<SMPLValue> vector;
    private ASTExp ob1,ob2;

    public SMPLVector(ArrayList<SMPLValue> v) {
        this.vector = v;
    }

    public SMPLVector(ASTExp ob1,ASTExp ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public int size() {
        return vector.size();
    }


    @Override
    public String toString() {

        String strOutput = "[: ";
        for (SMPLValue c : vector)
            strOutput += c.toString() + ",";

        if (strOutput.length() > 0)
            strOutput = strOutput.substring(0, strOutput.length() - 1);

        strOutput += ":]";
        return strOutput;

    }

    public SMPLValue get(int index) {
        return vector.get(index);
    }
}