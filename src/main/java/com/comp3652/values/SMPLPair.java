package com.comp3652.values;

import com.comp3652.lang.ASTExp;


public class SMPLPair extends SMPLVector{
    private Object v1,v2;

    public SMPLPair(ASTExp v, ASTExp v2) {
        super(v,v2);
    }

    @Override
 	public String toString() {
		return "(" + v1.toString() + ", " + v2.toString() + ")";
	}

    public Object getSecond() {
        return v2;
    }

    public Object getFirst() {
        return v1;
    }
}