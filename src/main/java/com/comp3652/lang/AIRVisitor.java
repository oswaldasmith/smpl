package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface AIRVisitor<S, T> extends ASTVisitor<AIRExp, S, T> {

    public T visitAIRExpInt(AIRExpInt exp, S state) throws HPLException;

    public T visitAIRExpFrac(AIRExpFrac exp, S state) throws HPLException;
    
    public T visitAIRExpVar(AIRExpVar exp, S state) throws HPLException;
   
    public T visitAIRBinaryExp(AIRBinaryExp exp, S state) throws HPLException;
    
}