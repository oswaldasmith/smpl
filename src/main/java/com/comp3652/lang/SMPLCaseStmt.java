package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLCaseStmt extends SMPLStatement {
    public SMPLCaseStmt(ArrayList<ASTExp<AIRExp>> lst, ASTExp<AIRExp> e1, ASTExp<AIRExp> e2) {

    }

    @Override
    public <S, T> T visit(SMPLEvaluator v, Object state) throws SMPLException {
        return null;
    }
}
