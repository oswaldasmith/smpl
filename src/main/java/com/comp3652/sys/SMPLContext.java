package com.comp3652.sys;

import com.comp3652.values.SMPLFunction;
import com.comp3652.values.SMPLValue;
import com.comp3652.values.SMPLVector;

import java.util.ArrayList;

public interface SMPLContext {

	/**
	 * Lookup a reference to a number
	 *
	 * @param name of the identifier of the Double
	 * @return associated double
	 * @throws SMPLException
	 */
	public SMPLEnvironment<Double> getN(String name);

	/**
	 * Lookup a reference to a SMPL function.
	 * @param name The identifier of the HPL function
	 * @return The HPL function associated with the given name in this context
	 * @throws SMPLException if the name is not bound to a painter in this
	 * context
	 */
	public SMPLFunction getF(String name) throws SMPLException;


	/**
	 * Functions
	 * 
	 * @param  fParams [description]
	 * @return         [description]
	 */
	public SMPLContext extendF(ArrayList<String> fParams, ArrayList<SMPLFunction> args);

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
	 * @param vParams The corresponding names of the values
	 * @param args The corresponding values for the names
	 * @return new created context with Vectors is extended with new bindings
	 */
	public SMPLContext extendV(ArrayList<String> vParams, ArrayList<SMPLVector> args);


	/**
	 * Get the numerical environment associated with this context
	 * @return this numerical environment
     */
	public SMPLEnvironment<Double> getNumEnv();

	/**
	 * Store a binding for the given name to the given SMPL function.
	 * @param name The identifier of the binding
	 * @param p The HPL function to be associated with the name
	 */
	public void putF(String name, SMPLFunction p);

	/**
	 * Store a binding for the given name to the given number.
	 * @param name The identifier of the binding
	 * @param n The numerical value to be associated with the name
	 */
	public void putN(String name, Double n);
}