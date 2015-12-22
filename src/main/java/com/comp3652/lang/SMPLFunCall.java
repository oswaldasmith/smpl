package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends SMPLExp {
    private  String funName;
    private  ArrayList<ASTExp> ArgExps;

    public SMPLFunCall() {
    }

    public SMPLFunCall(String fn, ArrayList<ASTExp<AIRExp>> args) {

    }

    /**
     *
     * @return The name of the function in this function application expression
     */
    public String getFunName() {
        return funName;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLFunCall(this, state);
    }

    public ArrayList<ASTExp> getArgExps() {
        return ArgExps;
    }
	
}