package com.comp3652.lang;

import com.comp3652.sys.SMPLException;
import com.comp3652.values.SMPLPair;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLisPairStmt extends SMPLFunCall {
    private SMPLPair pair;

    public SMPLisPairStmt(SMPLPair p) {
        pair = p;
    }

    public SMPLPair getPair() {
        return pair;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitSMPLisPairStmt(this,arg);
    }
}
