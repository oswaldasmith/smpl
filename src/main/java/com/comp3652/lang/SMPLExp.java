package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/19/15.
 */
public class SMPLExp extends ASTExp<SMPLExp> {

    @Override
    public <S, T> T visit(SMPLVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return visit(SMPLVisitor<S,T> v,state);
    }
}
