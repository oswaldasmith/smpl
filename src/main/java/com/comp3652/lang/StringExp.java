package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/23/15.
 */
public class StringExp extends ASTExp<SMPLExp> {
    String string;

    public StringExp(char c) {
        this.string += c;

    }

    public StringExp(String s){
        this.string = s;
    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return visit((SMPLVisitor<S,T>) v,state);
    }

    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException{
        return v.visitStringExp(this, context);
    }
}
