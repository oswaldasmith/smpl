package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLStmtDefinition extends SMPLStatement {
    private String v;
    private ASTExp e;

    public SMPLStmtDefinition(String v, ASTExp e) {

    }


    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLStmtDefinition(this,state);
    }
}
