package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

public interface AIRVisitor<S, T> extends ASTVisitor<AIRExp, S, T> {

    T visitAIRExpInt(AIRExpInt exp, S state) throws SMPLException;

    T visitAIRExpFrac(AIRExpFrac exp, S state) throws SMPLException;

    T visitAIRFunCall(SMPLFunCall smplFunCall, S arg) throws SMPLException;

}