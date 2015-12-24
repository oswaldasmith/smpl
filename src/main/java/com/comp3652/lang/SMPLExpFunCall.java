package com.comp3652.lang;

import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

/**
 * Created by carlos on 12/23/15.
 */
public class SMPLExpFunCall extends SMPLExp{

    private final String funName;
    private final ArrayList<ASTExp<SMPLExp>> argExps;

    public SMPLExpFunCall(String fn, ArrayList<ASTExp<SMPLExp>> args) {
        this.funName = fn;
        this.argExps = args;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLExpFunCall(this,context);
    }
}
