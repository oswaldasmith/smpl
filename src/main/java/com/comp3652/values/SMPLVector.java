package com.comp3652.values;

import com.comp3652.lang.ASTExp;

import java.util.*;

public class SMPLVector {
    Vector vector;

    public SMPLVector(ArrayList<ASTExp> v) {
        this.vector = new Vector(v);
    }


    public int size() {
        return vector.size();
    }
}