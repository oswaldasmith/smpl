package com.comp3652.sys;

import com.comp3652.values.SMPLFunction;
import com.comp3652.values.SMPLPair;
import com.comp3652.values.SMPLValue;
import com.comp3652.values.SMPLVector;

import java.util.ArrayList;

public interface SMPLContext {


    /**
	 *
	 * Resole an SMPLValue and make the result be the new current frame in a newly created context
	 * @param v the value to be derived from the current value
	 * @return new created context
	 */
	public SMPLContext composeSMPLValue(SMPLValue v);


	/**
	 * Get the smplValue associated with a binding
	 *
	 * @param name the identifier associated with it
	 * @return
	 */
	public SMPLValue getSMPLValue(String name);

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
	 * @throws SMPLException if the name is not bound to a Function in this
	 * context
	 */
	public SMPLFunction getF(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Vector
	 * @param name The identifier of the Vector
	 * @return The vector associated
	 *@throws SMPLException if the name is unbound in this context
	 */
	public SMPLVector getV(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Pair
	 * @param name the identifier fo the pair
	 * @return The pair associated
	 * @throws SMPLException
	 */
	public SMPLPair getP(String name) throws SMPLException;


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
	 * Pairs
	 *
	 * @param pParams The corresponding names of the values
	 * @param args Corresponding values for the pair
	 * @return new created context with pairs extended with new bindings
	 */
	public SMPLContext extendP(ArrayList<String> pParams, ArrayList<SMPLPair> args);

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

	/**
	 * Store  a binding for the given name to an SMPLValue
	 * @param name the identifier of the binding
	 * @param v the identifier of the binding
	 */
	public void putV(String name, SMPLValue v);

	/**
	 *
	 * Get boolean environment associated with this context
	 * @return bool this associated boolean environment
     */
	public  SMPLEnvironment<Boolean> getBoolEnv();

}