package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPrintStmt extends SMPLStatement {
    private String exp;
    private boolean isPrintln;


    public SMPLPrintStmt(ASTExp<SMPLExp> e, boolean b) {
        exp = e.toString();
        isPrintln = b;
    }

    public SMPLPrintStmt(String s, boolean b) {
        exp = s;
        isPrintln = b;
    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLPrintStmt(this,state);
    }


    public String getExp() {
        return exp;
    }

    public boolean isPrintln() {
        return isPrintln;
    }
}
