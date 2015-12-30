package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public abstract class ASTExp<E extends ASTExp<E>> extends ASTNode {
    public abstract <S, T> T visit (ASTVisitor<E, S, T> v, S state) throws SMPLException;
}
