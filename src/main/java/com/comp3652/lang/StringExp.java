package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class StringExp extends ASTExp<SMPLExp> {
    public StringExp(char c) {

    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return v.visitStringExp(this,state);
    }
}
