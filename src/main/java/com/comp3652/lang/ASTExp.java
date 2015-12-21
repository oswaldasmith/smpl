package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public abstract class ASTExp<E extends ASTExp<E>> extends ASTNode {

    public ASTExp(ASTExp<SMPLExp> e1, ASTExp<SMPLExp> e2) {

    }

    protected ASTExp() {
    }

    public abstract <S, T> T visit (ASTVisitor<E, S, T> v, S state) throws SMPLException;

}
