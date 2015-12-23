package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class BoolExp extends ASTExp<SMPLExp> {
    public BoolExp(Boolean f) {

    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return v.visitBoolExp(this,state);
    }
}
