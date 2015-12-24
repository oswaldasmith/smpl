package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

/**
 * Created by carlos on 12/19/15.
 */
public abstract class SMPLExp extends ASTExp<SMPLExp>{

    public abstract <S,T> T visit(SMPLVisitor<S,T> v, S context) throws SMPLException;

	@Override
	public abstract <S, T> T visit(ASTVisitor<S, T> v, S arg) throws SMPLException;


    @Override
    public <S, T> T visit(ASTVisitor<SMPLExp, S, T> v, S state) throws SMPLException {
        return null;
    }

}
