package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public abstract class SMPLStatement extends ASTNode {

    public abstract <S, T> T visit(SMPLEvaluator v, Object state) throws SMPLException;
}