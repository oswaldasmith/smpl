package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLReadStmt extends SMPLStatement {
    private Boolean readInt;

    public SMPLReadStmt(boolean b) {
        this.readInt = b;
    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLReadStmt(this,state);
    }

    public Boolean getReadInt() {
        return readInt;
    }

}
