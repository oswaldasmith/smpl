package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPrintStmt extends SMPLStatement {
    private ASTExp<SMPLExp> exp;
    private ASTExp<AIRExp> arithExp;
    private boolean isPrintln;

    public SMPLPrintStmt(SMPLExp e, boolean b) {
        this.exp = e;
        this.isPrintln = b;
    }

    public SMPLPrintStmt(ASTExp<AIRExp> e, boolean b) {
        this.arithExp = e;
        this.isPrintln = b;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLPrintStmt(this,state);
    }

    public ASTExp<AIRExp> getArithExp() {
        return arithExp;
    }


    public ASTExp<SMPLExp> getExp() {
        return exp;
    }
}
