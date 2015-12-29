package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends AIRExp {
    private final String funName;
    private final ArrayList<ASTExp<SMPLExp>> argExps;

    public SMPLFunCall(String fn, ArrayList<ASTExp<SMPLExp>> args) {
        this.funName = fn;
        this.argExps = args;
    }

    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLFunCall(this, context);
    }

    public String getFunName() {
        return funName;
    }

    public ArrayList<ASTExp<SMPLExp>> getArgExps() {
        return argExps;
    }
}