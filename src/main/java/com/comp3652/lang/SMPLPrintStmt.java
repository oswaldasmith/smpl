package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPrintStmt extends SMPLStatement {
    private ASTExp<SMPLExp> exp;
    private boolean isPrintln;


    public SMPLPrintStmt(ASTExp<SMPLExp> e, boolean b) {
        exp = e;
        isPrintln = b;
    }

    public SMPLPrintStmt(StringExp s, boolean b) {
        exp = s;
        isPrintln = b;
    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLPrintStmt(this,state);
    }


    public ASTExp<SMPLExp> getExp() {
        return exp;
    }


    public boolean isPrintln() {
        return isPrintln;
    }

    @Override
    public String toString() {
        return exp.toString();
    }
}
