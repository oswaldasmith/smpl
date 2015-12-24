package com.comp3652.lang;

import java.util.*;
import com.comp3652.sys.SMPLException;

public class SMPLFunCall extends SMPLStatement {
	protected final String funName;
	protected final ArrayList<SMPLExp> argExps;
    // private  ArrayList<ASTExp<AIRExp>> arithArgExps;
    // TODO not sure about this chad

	public SMPLFunCall(String name, ArrayList<SMPLExp> args) {
		funName = name;
		argExps = args;
	}

	public String getFunctionName() {
		return funName;
	}

	public ArrayList<SMPLExp> getArgExps() {
		return argExps;
	}

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLFunCall(this,context);
    }

    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRFunCall(this,arg);
    }
}