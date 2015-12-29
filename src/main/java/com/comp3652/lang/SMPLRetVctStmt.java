package com.comp3652.lang;

import com.comp3652.sys.SMPLException;
import com.comp3652.values.SMPLVector;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLRetVctStmt extends SMPLStatement {
    private int index;
    private SMPLVector vector;

    public SMPLRetVctStmt(SMPLVector v, Integer i) {
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

    public SMPLVector getVector() {
        return vector;
    }
}
