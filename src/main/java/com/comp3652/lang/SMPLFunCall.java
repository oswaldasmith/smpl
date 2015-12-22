package com.comp3652.lang;


import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends SMPLExp {
    private final String funName;
    private final ArrayList<ASTExp<AIRExp>> nArgExps;
    private final ArrayList<ASTExp<SMPLExp>> pArgExps;

    public SMPLFunCall(String fnName, ArrayList<ASTExp<AIRExp>> nArgs,
                      ArrayList<ASTExp<SMPLExp>> pArgs) {
        funName = fnName;
        nArgExps = nArgs;
        pArgExps = pArgs;
    }

    /**
     *
     * @return The name of the function in this function application expression
     */
    public String getFunName() {
        return funName;
    }

    /**
     *
     * @return The list of numerical argument expressions in this call expression.
     */
    public ArrayList<ASTExp<AIRExp>> getNumericalArgExps() {
        return nArgExps;
    }

    /**
     *
     * @return The list of painter argument expressions in this call expression
     */
    public ArrayList<ASTExp<SMPLExp>> getPainterArgExps() {
        return pArgExps;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
        return v.visitSMPLFunCall(this, state);
    }
	
}