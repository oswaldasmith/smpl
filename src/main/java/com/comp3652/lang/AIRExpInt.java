package com.comp3652.lang;

import com.comp3652.sys.*;
import com.comp3652.values.*;

public class AIRExpInt extends AIRExp {

    int value;

    public AIRExpInt(int v) {
        value = v;
    }

    public AIRExpInt(Integer v) {
        value = v.intValue();
    }

    public int getVal() {
        return value;
    }

    @Override
    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRExpInt(this, arg);
    }
}
