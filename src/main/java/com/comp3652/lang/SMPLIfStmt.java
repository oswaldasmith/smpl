package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLIfStmt extends SMPLStatement {

    private ASTExp<SMPLExp> condExp;
    private SMPLStmtSequence body;
    private SMPLStmtSequence alternative;


    public SMPLIfStmt(ASTExp<SMPLExp> p, SMPLStmtSequence cons) {
        this.condExp = p;
        this.body = cons;
    }

    public SMPLIfStmt(ASTExp<SMPLExp> p, SMPLStmtSequence cons, SMPLStmtSequence alt) {
        this.condExp = p;
        this.body = cons;
        this.alternative = alt;

    }

    public ASTExp<SMPLExp> getCondExp() {
        return condExp;
    }

    public SMPLStmtSequence getBody() {
        return body;
    }

    public SMPLStmtSequence getAlternative() {
        return alternative;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLIfStmt(this,state);
    }
}
