package com.comp3652.lang;

import com.comp3652.sys.HPLException;

public interface ASTVisitor<E extends ASTExp<E>, S, T> {
    
    public T visitVar(ASTVar<E> var, S state) throws HPLException ;
    
    public T visitUnaryExp(ASTUnaryExp<E> exp, S state) throws HPLException ;
    
    public T visitBinaryExp(ASTBinaryExp<E> exp, S state) throws HPLException ;
    
}
