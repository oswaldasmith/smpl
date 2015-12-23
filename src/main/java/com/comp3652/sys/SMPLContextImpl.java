package com.comp3652.sys;

import com.comp3652.values.*;
import java.util.*;

public class SMPLContextImpl implements SMPLContext {

	protected SMPLEnvironment<SMPLFunction<SMPLExp>> funcEnv;
	protected SMPLEnvironment<SMPLCompound<SMPLExp>> compEnv;
	protected SMPLEnvironment<SMPLPrimitive<SMPLExp>> primEnv;
	
	public SMPLContextImpl(SMPLEnvironment<SMPLFunction<SMPLExp>> funcEnv, 
		SMPLEnvironment<SMPLCompound<SMPLExp>> compEnv, SMPLEnvironment<SMPLPrimitive<SMPLExp>> primeEnv) {
		
		this.funcEnv = 	funcEnv;
		this.compEnv = 	compEnv;
		this.primEnv = primEnv;
	}

	public SMPLContextImpl() {
		this(new SMPLEnvironment<SMPLFunction<SMPLExp>>(), 
			new SMPLEnvironment<SMPLCompound<SMPLExp>>(), 
			new SMPLEnvironment<SMPLPrimitive<SMPLExp>>());
	}

	// function
	public SMPLContext extendF(ArrayList<String> fParams, 
		ArrayList<SMPLFunction<SMPLExp>> args) {
		
		SMPLEnvironment<SMPLFunction<SMPLExp>> newfuncEnv = 
			new SMPLEnvironment<SMPLFunction<SMPLExp>>(funcEnv, fParams, args);

		return new SMPLContextImpl(newFuncEnv, compEnv, primEnv);
	}

	// compound
    public SMPLContext extendC(ArrayList<String> cParams, 
    	ArrayList<SMPLCompound<SMPLExp>> args) {

    	SMPLEnvironment<SMPLCompound<SMPLExp>> newCompEnv = 
			new SMPLEnvironment<SMPLFunction<SMPLExp>>(compEnv, cParams, args);

		return new SMPLContextImpl(funcEnv, newCompEnv, primEnv);
    }

    // primitives
    public SMPLContext extendP(ArrayList<String> pParams, 
    	ArrayList<SMPLPrimitive<SMPLExp>> args) {

    	SMPLEnvironment<SMPLPrimitive<SMPLExp>> newPrimEnv =
    		new SMPLEnvironment<SMPLPrimitive<SMPLExp>>(primEnv, pParams, args);

    	return new SMPLContextImpl(primEnv, pParams, args);
    }

    public SMPLEnvironment<SMPLFunction<SMPLExp>> getF(String name) 
    throws SMPLException {
    	return funcEnv.get(name);
    }

    public SMPLEnvironment<SMPLCompound<SMPLExp>> getC(String name) 
    throws SMPLException {
    	return compEnv.get(name);
    }

    public SMPLEnvironment<SMPLPrimitive<SMPLExp>> getP(String name) 
    throws SMPLException {
    	return primEnv.get(name);
    }

    public void putF(String name, SMPLFunction<SMPLExp> p) {
    	funcEnv.put(name, p);
    }

    public void putC(String name, SMPLCompound<SMPLExp> c) {
    	compEnv.put(name, c);
    }

    public void putP(String name, SMPLPrimitive<SMPLExp> p) {
    	primEnv.put(name, p);
    }
}