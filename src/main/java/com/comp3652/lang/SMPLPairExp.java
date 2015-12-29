package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class SMPLPairExp extends ASTExp<SMPLExp> {
    private ASTExp e1,e2;

    public SMPLPairExp(SMPLExp e1, SMPLExp e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public SMPLPairExp(ASTExp<AIRExp> e1, ASTExp<AIRExp> e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return null;
    }
}
