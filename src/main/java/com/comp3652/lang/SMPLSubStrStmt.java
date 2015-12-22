package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLSubStrStmt extends SMPLExpFnCall {
    public SMPLSubStrStmt(String s, Integer start, Integer end) {

        super(args);
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLSubStrStmt(this,state);
    }
}
