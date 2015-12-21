package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/20/15.
 */
public class LIRExp extends ASTExp<LIRExp> {
    public LIRExp(ASTExp<SMPLExp> e1, ASTExp<SMPLExp> e2) {
        super(e1, e2);
    }

    @Override
    public <S, T> T visit(ASTVisitor<LIRExp, S, T> v, S state) throws SMPLException {
        return null;
    }
}
