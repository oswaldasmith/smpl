package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public class AIRExpInt extends AIRExp {

    int value;

    public AIRExpInt(int v) {
        value = v;
    }

    public AIRExpInt(Integer v) {
        value = v.intValue();
    }

    public Double getVal() {
        return new Double(value);
    }

    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRExpInt(this, arg);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
