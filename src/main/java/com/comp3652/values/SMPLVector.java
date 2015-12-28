package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import com.comp3652.lang.SMPLVectorExp;

import java.util.*;

public class SMPLVector extends SMPLValue<SMPLExp> {
    private Vector vector;
    private SMPLVectorExp values;
    private ASTExp ob1,ob2;

    public SMPLVector(SMPLValue v) {
        this.vector = new Vector(v);
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

        String strOutput = "";
        for (ASTExp c : values.getExplist())
            strOutput += c.toString() + ",";

        if (strOutput.length() > 0)
            strOutput = strOutput.substring(0, strOutput.length() - 1);

        return strOutput;

    }
}