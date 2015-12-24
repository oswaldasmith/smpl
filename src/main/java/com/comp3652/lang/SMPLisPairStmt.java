package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLisPairStmt extends SMPLFunCall {
    private SMPLPairExp pair;

    public SMPLisPairStmt(SMPLPairExp p) {
        pair = p;
    }

    public SMPLPairExp getPair() {
        return pair;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitSMPLisPairStmt(this,arg);
    }
}
