package com.comp3652.values;


public class SMPLFunction extends SMPLValue<Function> {

<<<<<<< HEAD
	public SMPLFunction(Function function) {
		value = function;
	}
} 
=======
public class SMPLFunction {
	String name;
	ArrayList<String> params;
	SMPLStmtSequence body;
	SMPLContext closingEnv;

	public SMPLFunction(String id, ArrayList<String> params,SMPLStmtSequence body, SMPLContext env) {
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
>>>>>>> master
