package com.comp3652.sys;

public interface SMPLContext {

	public SMPLContext extendF(ArrayList<String> fParams);

	public SMPLContext extendN(ArrayList<String> nParams, ArrayList<Double> vals);

	public SMPLContext extendV();

	public SMPLContext extendP();
}