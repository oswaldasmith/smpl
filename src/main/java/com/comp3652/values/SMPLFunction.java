package com.comp3652.values;

import com.comp3652.lang.*;
import com.comp3652.sys.SMPLContext;

import java.util.*;

public class SMPLFunction {

	String name;
	ArrayList<String> params;
	SMPLStmtSequence body;
	SMPLContext closingEnv;

	public SMPLFunction(String id, ArrayList<String> params,
						SMPLStmtSequence body, SMPLContext env) {
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