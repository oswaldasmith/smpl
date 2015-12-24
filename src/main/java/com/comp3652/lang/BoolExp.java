package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */


public class BoolExp extends ASTExp<SMPLExp> {

    private Boolean val;

    public BoolExp(String value) {
        if(value.contains("#t")){
            val = true;
        }
        else {
            val = false;
        }
    }


    public Boolean getVal() {
        return val;
    }


    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return visit((BoolVisitor<S, T>) v, state);
    }

    public <S, T> T visit(BoolVisitor<S, T> v, S context) throws SMPLException{
        return v.visitBoolExp(this, context);
    }
}
