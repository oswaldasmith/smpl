package com.comp3652.values;

import com.comp3652.lang.*;
import com.comp3652.sys.SMPLContext;

import java.util.*;

<<<<<<< HEAD
public class SMPLFunction extends SMPLValue<SMPLFunction> {
=======
public class SMPLFunction extends SMPLValue {
>>>>>>> chadsmpl

	String name;
	ArrayList<String> params;
	SMPLSequence body;
	SMPLContext closingEnv;

	public SMPLFunction(String id, ArrayList<String> params,
						SMPLStmtSequence body, SMPLContext env) {
        super();
        this.name = id;
        this.params = params;
        this.body = body;
        this.closingEnv = env;
    }

    public String getName() {
    	return name;
    }

    public ArrayList<String> getParams() {
    	return params;
    }

    public SMPLStmtSequence getBody() {
    	return body;
    }

    public SMPLContext getClosingEnv() {
    	return closingEnv;
    }
}