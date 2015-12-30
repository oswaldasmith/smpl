package com.comp3652.values;

import com.comp3652.lang.*;
import com.comp3652.sys.SMPLContext;

import java.util.*;

public class Function {
	String name;
	ArrayList<String> params;
	SMPLStmtSequence body;
	SMPLContext closingEnv;

	public Function(String id, ArrayList<String> params,
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

    /**
     * Created by carlos on 12/27/15.
     */
    public static class SMPLBoolean extends SMPLValue<Boolean> {

        public SMPLBoolean(Boolean equal) {
            value = equal;
        }

        @Override
        public String toString() {
            return (value) ? "true" : "false";
        }

    }
}