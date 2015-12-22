package com.comp3652.sys;

import java.util.*;
import com.comp3652.lang.*;
import com.comp3652.values.*;

public class SMPLContextImpl implements SMPLContext {
	protected SMPLEnvironment<Double> nEnv;
	protected SMPLEnvironment<SMPLFunction> fEnv;
	protected SMPLEnvironment<SMPLVector> vEnv;
	protected SMPLEnvironment<String> sEnv;
	protected SMPLEnvironment<SMPLPair> pEnv;

	public SMPLContextImpl(SMPLEnvironment<Double> nEnv, SMPLEnvironment<SMPLFunction> fEnv, SMPLEnvironment<SMPLVector> vEnv, SMPLEnvironment<String> sEnv, SMPLEnvironment<SMPLPair> pEnv) {
		this.nEnv = nEnv;
		this.fEnv = fEnv;
		this.vEnv = vEnv;
		this.sEnv = sEnv;
		this.pEnv = pEnv;
	}

	public SMPLEnvironment<Double> getnEnv(){
		return this.nEnv;
	}

}