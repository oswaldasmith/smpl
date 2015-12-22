package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLRetVctStmt extends SMPLExpFnCall {
    public SMPLRetVctStmt() {
        super(args);
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitRetVctStmt();
    }
}
