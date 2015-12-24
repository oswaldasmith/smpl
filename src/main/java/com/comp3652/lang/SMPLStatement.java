package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

public abstract class SMPLStatement extends SMPLExp {

    public abstract <S, T> T visit(SMPLVisitor<S,T> v, S state) throws SMPLException;

}
