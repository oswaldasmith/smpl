package com.comp3652.sys;

import com.comp3652.values.*;

import java.util.ArrayList;

public class SMPLContextImpl implements SMPLContext {

	protected SMPLValue value;
	protected SMPLEnvironment<SMPLValue> valueEnv;
	protected SMPLEnvironment<Boolean> boolEnv;
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

	public SMPLContextImpl(SMPLValue v,SMPLEnvironment<SMPLValue> valueEnv,SMPLEnvironment<Double> nEnv, SMPLEnvironment<SMPLFunction> fEnv, SMPLEnvironment<SMPLVector> vEnv, SMPLEnvironment<String> sEnv, SMPLEnvironment<SMPLPair> pEnv) {
		this.value = v;
		this.valueEnv = valueEnv;
		this.nEnv = nEnv;
		this.fEnv = fEnv;
		this.vEnv = vEnv;
		this.sEnv = sEnv;
		this.pEnv = pEnv;
	}

	public SMPLContextImpl(){
		this(new PrimitiveSMPLValue(), new SMPLEnvironment<SMPLValue>(), new SMPLEnvironment<Double>(), new SMPLEnvironment<SMPLFunction>(), new SMPLEnvironment<SMPLVector>(), new SMPLEnvironment<String>(), new SMPLEnvironment<SMPLPair>());
	}

	public SMPLEnvironment<Double> getnEnv(){
		return this.nEnv;
	}


	@Override
	public SMPLValue getSMPLValue(String name) throws SMPLException {
		return valueEnv.get(name);
	}

	@Override
	public Double getN(String name) throws SMPLException {
		return nEnv.get(name);
	}

	@Override
	public SMPLFunction getFunction(String name) throws SMPLException {
		return fEnv.get(name);
	}

	@Override
	public SMPLVector getVector(String name) throws SMPLException {
		return vEnv.get(name);
	}

	@Override
	public SMPLPair getPair(String name) throws SMPLException {
		return pEnv.get(name);
	}

	@Override
	public SMPLContext extendFunctionEnvironment(ArrayList<String> fParams, ArrayList<SMPLFunction> args) {
		SMPLEnvironment<SMPLFunction> newFunEnv = new SMPLEnvironment<>();
		return new SMPLContextImpl(value,valueEnv,nEnv,newFunEnv,vEnv,sEnv,pEnv);
	}

	@Override
	public SMPLContext extendNumericalEnvironment(ArrayList<String> nParams, ArrayList<Double> vals) {
		SMPLEnvironment<Double> newNumEnv = new SMPLEnvironment<>();
		return new SMPLContextImpl(value,valueEnv,newNumEnv,fEnv,vEnv,sEnv,pEnv);
	}

	@Override
	public SMPLContext extendVectorEnvironment(ArrayList<String> vParams, ArrayList<SMPLVector> args) {
		SMPLEnvironment<SMPLVector> newVectorEnv = new SMPLEnvironment<>();
		return new SMPLContextImpl(value,valueEnv,nEnv,fEnv,newVectorEnv,sEnv,pEnv);
	}

	@Override
	public SMPLContext extendPairEnvironment(ArrayList<String> pParams, ArrayList<SMPLPair> args) {
		SMPLEnvironment<SMPLPair> newPair = new SMPLEnvironment<>();
		return new SMPLContextImpl(value,valueEnv,nEnv,fEnv,vEnv,sEnv,newPair);
	}


	@Override
	public SMPLContext extendSMPLValue(ArrayList<String> formalParameters, ArrayList<SMPLValue> arguments) {
		SMPLEnvironment<SMPLValue> valEnv = new SMPLEnvironment<SMPLValue>();
		return new SMPLContextImpl(this.value,valEnv,this.nEnv,this.fEnv,this.vEnv,this.sEnv,this.pEnv);
	}


	@Override
	public SMPLEnvironment<Double> getNumEnv() {
		return this.nEnv;
	}

	@Override
	public void putFunction(String name, SMPLFunction p) {
		fEnv.put(name,p);

	}


	@Override
	public void putNumber(String name, Double n) {
		nEnv.put(name,n);
	}

	@Override
	public void putVector(String name, SMPLVector v) {
		vEnv.put(name,v);
	}

	@Override
	public void putPair(String name, SMPLPair p) {
		pEnv.put(name,p);

	}

	@Override
	public void putSMPLVal(String name, SMPLValue v) {
		this.valueEnv.put(name,v);
	}

	@Override
	public SMPLEnvironment<Boolean> getBoolEnv() {
		return this.boolEnv;
	}

	@Override
	public SMPLEnvironment<String> getStringEnv() {
		return this.sEnv;
	}


}