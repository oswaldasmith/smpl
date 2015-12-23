package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class BoolExp extends SMPLExp {
    private Boolean val;

    public BoolExp(Boolean value) {
        this.val = value;
    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitBoolExp(this,context);
    }

    public Boolean getVal() {
        return val;
    }
}
