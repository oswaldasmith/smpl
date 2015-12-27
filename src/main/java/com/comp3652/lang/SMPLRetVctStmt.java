package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLRetVctStmt extends SMPLFunCall {
    private int index;
    private SMPLVectorExp vector;

    public SMPLRetVctStmt(SMPLVectorExp v, Integer i) {
        this.index = i.intValue();
        this.vector = v;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitRetVctStmt(this,state);
    }

    public int getIndex() {
        return index;
    }

    public SMPLVectorExp getVector() {
        return vector;
    }
}
