package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends AIRExp {
    private  String funName;
    private  ArrayList<ASTExp<AIRExp>> arithArgExps;


    public SMPLFunCall() {
    }

    public SMPLFunCall(String fn, ArrayList<ASTExp<AIRExp>> args) {
        this.funName = fn;
        this.arithArgExps = args;
    }

    public ArrayList<ASTExp<AIRExp>> getArgExps() {
        return arithArgExps;
	}

    /**
     *
     * @return The name of the function in this function application expression
     */
    public String getFunName() {
        return funName;
    }



    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRFunCall(this,arg);
    }
}