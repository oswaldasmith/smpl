package com.comp3652.sys;

import java.util.*;
import com.comp3652.lang.*;
import com.comp3652.values.*;

public class SMPLContextImpl implements SMPLContext {
	protected SMPLValue value;
	protected SMPLEnvironment<Double> nEnv;
	protected SMPLEnvironment<SMPLFunction> fEnv;
	protected SMPLEnvironment<SMPLVector> vEnv;
	protected SMPLEnvironment<String> sEnv;
	protected SMPLEnvironment<SMPLPair> pEnv;

	public SMPLContextImpl(SMPLValue v,SMPLEnvironment<Double> nEnv, SMPLEnvironment<SMPLFunction> fEnv, SMPLEnvironment<SMPLVector> vEnv, SMPLEnvironment<String> sEnv, SMPLEnvironment<SMPLPair> pEnv) {
		this.value = v;
		this.nEnv = nEnv;
		this.fEnv = fEnv;
		this.vEnv = vEnv;
		this.sEnv = sEnv;
		this.pEnv = pEnv;
	}

	public SMPLContextImpl(){
		this(new PrimitiveSMPLValue(),new SMPLEnvironment<Double>(),new SMPLEnvironment<SMPLFunction>(),new SMPLEnvironment<SMPLVector>(),new SMPLEnvironment<String>(),new SMPLEnvironment<SMPLPair>());
	}

	public SMPLEnvironment<Double> getnEnv(){
		return this.nEnv;
	}

	@Override
	public SMPLContext composeSMPLValue(SMPLValue v) {
		SMPLValue toRet = (SMPLValue) v.getValue();
		return new SMPLContextImpl(toRet,new SMPLEnvironment<Double>(),new SMPLEnvironment<SMPLFunction>(),new SMPLEnvironment<SMPLVector>(), new SMPLEnvironment<String>(),new SMPLEnvironment<SMPLPair>()) ;
	}

	@Override
	public SMPLEnvironment<Double> getN(String name) {
		return null;
	}

	@Override
	public SMPLFunction getF(String name) throws SMPLException {
		return null;
	}

	@Override
	public SMPLVector getV(String name) throws SMPLException {
		return null;
	}

	@Override
	public SMPLPair getP(String name) throws SMPLException {
		return null;
	}

	@Override
	public SMPLContext extendF(ArrayList<String> fParams, ArrayList<SMPLFunction> args) {
		return null;
	}

	@Override
	public SMPLContext extendN(ArrayList<String> nParams, ArrayList<Double> vals) {
		return null;
	}

	@Override
	public SMPLContext extendV(ArrayList<String> vParams, ArrayList<SMPLVector> args) {
		return null;
	}

	@Override
	public SMPLContext extendP(ArrayList<String> pParams, ArrayList<SMPLPair> args) {
		return null;
	}

	@Override
	public SMPLEnvironment<Double> getNumEnv() {
		return null;
	}

	@Override
	public void putF(String name, SMPLFunction p) {

	}

	@Override
	public void putN(String name, Double n) {

	}
}