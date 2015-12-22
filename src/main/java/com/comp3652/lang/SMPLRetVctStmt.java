package com.comp3652.lang;

import com.comp3652.sys.SMPLException;
import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLRetVctStmt extends SMPLFunCall {
    //#TODO
    public SMPLRetVctStmt() {
        super();
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitRetVctStmt(this,state);
    }
}
