package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/26/15.
 */
public class SMPLCaseFunction extends SMPLStatement {
    private ArrayList<SMPLCaseStmt> caseStmts;
    private SMPLStatement finalCase;

    public SMPLCaseFunction(ArrayList<SMPLCaseStmt> lst, SMPLStatement s) {
        this.caseStmts = lst;
        this.finalCase = s;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLCaseFunction(this,state);
    }

    public ArrayList<SMPLCaseStmt> getCaseStmts() {
        return caseStmts;
    }

    public SMPLStatement getFinalCase() {
        return finalCase;
    }
}
