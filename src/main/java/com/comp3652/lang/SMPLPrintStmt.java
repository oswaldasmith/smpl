package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPrintStmt extends SMPLStatement {
    private StringExp exp;
    private boolean isPrintln;

    public SMPLPrintStmt(StringExp e, boolean b) {
        this.exp = e;
        this.isPrintln = b;
    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLPrintStmt(this,state);
    }


    public StringExp getExp() {
        return exp;
    }

    public boolean isPrintln() {
        return isPrintln;
    }
}
