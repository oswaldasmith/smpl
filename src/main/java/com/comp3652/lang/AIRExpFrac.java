package com.comp3652.lang;

import com.comp3652.sys.*;

public class AIRExpFrac extends AIRExp {

    double value;

    public AIRExpFrac(double v) {
        value = v;
    }

    public AIRExpFrac(Double v) {
        value = v.doubleValue();
    }

    public double getVal() {
        return value;
    }

    @Override
    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws HPLException {
        return v.visitAIRExpFrac(this, arg);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
