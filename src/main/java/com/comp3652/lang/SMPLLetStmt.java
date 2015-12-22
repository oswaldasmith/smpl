package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLLetStmt extends SMPLStatement {

    private ArrayList<SMPLStmtDefinition> ids;
    private SMPLStmtSequence body;

    public SMPLLetStmt(ArrayList<SMPLStmtDefinition> ids, SMPLStmtSequence body) {

        this.ids = ids;
        this.body = body;
    }

    public SMPLLetStmt(SMPLStmtDefinition ids, SMPLStmtSequence body) {
        this.body = body;
        this.ids.add(ids);

    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLLetStmt(this,state);
    }
}
