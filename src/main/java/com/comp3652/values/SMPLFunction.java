package com.comp3652.values;

import com.comp3652.lang.*;
import java.util.*;

public class SMPLFunction extends SMPLValue<SMPLFunction> {

	String name;
	ArrayList<String> params;
	SMPLSequence body;
	SMPLContext closingEnv;

	public HPLFunction(String id, ArrayList<String> params,
						SMPLSequence body, SMPLContext env) {
        this.name = id;
        this.params = params;
        this.body = b;
        this.closingEnv = env;
    }

    public String getName() {
    	return name;
    }

    public ArrayList<String> getParams() {
    	return params;
    }

    public SMPLSequence getBody() {
    	return body;
    }

    public SMPLContext getClosingEnv() {
    	return closingEnv;
    }
}