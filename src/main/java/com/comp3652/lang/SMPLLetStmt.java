package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLLetStmt extends SMPLStatement {
    public SMPLLetStmt(ArrayList<SMPLStmtDefinition> ids, SMPLStmtSequence body) {

    }

    @Override
    public <S, T> T visit(SMPLEvaluator v, Object state) throws SMPLException {
        return null;
    }
}
