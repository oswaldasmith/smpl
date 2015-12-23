package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface ASTVisitor<E extends ASTExp<E>, S, T> {
    
    T visitVar(ASTVar<E> var, S state) throws SMPLException;
    
    T visitUnaryExp(ASTUnaryExp<E> exp, S state) throws SMPLException;
    
    T visitBinaryExp(ASTBinaryExp<E> exp, S state) throws SMPLException;

    T visitBoolExp(BoolExp boolExp, S state)throws SMPLException;

    T visitStringExp(StringExp stringExp, S state)throws SMPLException;
}
