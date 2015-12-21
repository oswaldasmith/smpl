package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPrintStmt extends SMPLStatement {
    public SMPLPrintStmt(ASTExp<AIRExp> e) {

    }

    @Override
    public <S, T> T visit(SMPLEvaluator v, Object state) throws SMPLException {
        return null;
    }
}
