package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLSizeStmt extends SMPLExp {
    private  SMPLVectorExp vector;

    public SMPLSizeStmt(SMPLVectorExp v) {
        this.vector = v;
    }

    public SMPLVectorExp getVector() {
        return vector;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLSizeStmt(this,context);
    }
}
