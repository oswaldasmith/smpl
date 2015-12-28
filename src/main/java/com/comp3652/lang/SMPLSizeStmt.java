package com.comp3652.lang;

import com.comp3652.sys.SMPLException;
import com.comp3652.values.SMPLVector;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLSizeStmt extends SMPLExp {
    private SMPLVector vector;

    public SMPLSizeStmt(SMPLVector v) {
        this.vector = v;
    }

    public SMPLVector getVector() {
        return vector;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLSizeStmt(this,context);
    }
}
