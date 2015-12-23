package com.comp3652.sys;

import com.comp3652.values.*;
import java.util.ArrayList;

public interface SMPLContext {

	// function
	public SMPLContext extendF(ArrayList<String> fParams, ArrayList<SMPLFunction<SMPLExp>> args);

	// compound
    public SMPLContext extendC(ArrayList<String> nParams, ArrayList<SMPLCompound<SMPLExp>> args);

    // primitives
    public SMPLContext extendP(ArrayList<String> pParams, ArrayList<SMPLPrimitive<SMPLExp>> args);

    public SMPLEnvironment<SMPLFunction<SMPLExp>> getF(String name) throws SMPLException;

    public SMPLEnvironment<SMPLCompound<SMPLExp>> getC(String name) throws SMPLException;

    public SMPLEnvironment<SMPLPrimitive<SMPLExp>> getP(String name) throws SMPLException;

    public void putF(String name, SMPLFunction<SMPLExp> p);

    public void putC(String name, SMPLCompound<SMPLExp> c);

    public void putP(String name, SMPLPrimitive<SMPLExp> p);
}