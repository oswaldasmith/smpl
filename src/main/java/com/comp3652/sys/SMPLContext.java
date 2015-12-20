package com.comp3652.sys;

import java.util.ArrayList;

public interface SMPLContext {

	/**
	 * Functions
	 * 
	 * @param  fParams [description]
	 * @return         [description]
	 */
	public SMPLContext extendF(ArrayList<String> fParams);

	/**
	 * Numbers
	 * 
	 * @param  nParams [description]
	 * @param  vals    [description]
	 * @return         [description]
	 */
	public SMPLContext extendN(ArrayList<String> nParams, ArrayList<Double> vals);

	/**
	 * Vectors
	 * 
	 * @return [description]
	 */
	public SMPLContext extendV();

	public SMPLContext extendP();
}