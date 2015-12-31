package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/31/15.
 */
public class SMPLProcedure extends SMPLExp {
    SMPLStmtDefinition list;
    ASTExp<SMPLExp> body;

    public SMPLProcedure(SMPLStmtDefinition ids, ASTExp<SMPLExp> body) {
        this.list = ids;
        this.body = body;
    }

    public SMPLStmtDefinition getVar() {
        return list;
    }

    public ASTExp<SMPLExp> getBody() {
        return body;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLProcedure(this, context);
    }
}
