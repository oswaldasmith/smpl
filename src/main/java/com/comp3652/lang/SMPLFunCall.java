package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends SMPLExp {
    private String funName;
    private ArrayList<ASTNode> arithArgExps;

    public SMPLFunCall() {}

    public SMPLFunCall(String fn, ArrayList<ASTExp<AIRExp>> args) {
        this.funName = fn;
        this.arithArgExps = args;
    }

	public ArrayList<SMPLExp> getArgExps() {
		return argExps;
	}

    /**
     *
     * @return The name of the function in this function application expression
     */
    public String getFunName() {
        return funName;
    }

    // TODO
    // should remove
    public ArrayList<ASTExp<AIRExp>> getArgExps() {
        return arithArgExps;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLFunCall(this,context);
    }

    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRFunCall(this,arg);
    }
}