package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLIfStmt extends SMPLStatement {
    public SMPLIfStmt(ASTExp<CIRExp> p, SMPLStmtSequence cons) {

    }

    public SMPLIfStmt(ASTExp<CIRExp> p, SMPLStmtSequence cons, SMPLStmtSequence alt) {

    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLIfStmt(this,state);
    }
}
