package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLCaseStmt extends SMPLStatement {

    private ASTExp<CIRExp> predicate;
    private SMPLStatement cons;

    public SMPLCaseStmt(ASTExp<CIRExp> p, SMPLStatement s) {
        this.predicate = p;
        this.cons = s;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLCaseStmt(this,state);
    }

    public ASTExp<CIRExp> getPredicate() {
        return predicate;
    }

    public SMPLStatement getConsequent() {
        return cons;
    }
}
