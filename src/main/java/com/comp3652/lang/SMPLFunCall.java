package com.comp3652.lang;

import java.util.*;

<<<<<<< HEAD
public class SMPLFunCall extends SMPLStatement {
	protected final String funName;
	protected final ArrayList<SMPLExp> argExps;

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
	public T visit(SMPLVisitor<S, T> v, S state) throws SMPLException {
		return v.visitSMPLFunctionCall(this, state);
	}
=======
import com.comp3652.sys.SMPLException;

import java.util.ArrayList;

public class SMPLFunCall extends SMPLExp {
    private  String funName;
    private  ArrayList<ASTExp<AIRExp>> arithArgExps;


    public SMPLFunCall() {
    }

    public SMPLFunCall(String fn, ArrayList<ASTExp<AIRExp>> args) {
        this.funName = fn;
        this.arithArgExps = args;
    }



    /**
     *
     * @return The name of the function in this function application expression
     */
    public String getFunName() {
        return funName;
    }


    public ArrayList<ASTExp<AIRExp>> getArgExps() {
        return argExps;
    }

    @Override
    public <S, T> T visit(SMPLVisitor<S, T> v, S context) throws SMPLException {
        return v.visitSMPLFunCall(this,context);
    }

    public <S, T> T visit(AIRVisitor<S, T> v, S arg) throws SMPLException {
        return v.visitAIRFunCall(this,arg);
    }
>>>>>>> chadsmpl
}