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
	public SMPLValue getSMPLValue(String name) throws SMPLException;

	/**
	 * Lookup a reference to a number
	 *
	 * @param name of the identifier of the Double
	 * @return associated double
	 * @throws SMPLException
	 */
	public Double getN(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL function.
	 * @param name The identifier of the HPL function
	 * @return The HPL function associated with the given name in this context
	 * @throws SMPLException if the name is not bound to a Function in this
	 * context
	 */
	public SMPLFunction getFunction(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Vector
	 * @param name The identifier of the Vector
	 * @return The vector associated
	 *@throws SMPLException if the name is unbound in this context
	 */
	public SMPLVector getVector(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Pair
	 * @param name the identifier fo the pair
	 * @return The pair associated
	 * @throws SMPLException
	 */
	public SMPLPair getPair(String name) throws SMPLException;


	/**
	 * Functions
	 * 
	 * @param  fParams [description]
	 * @return         [description]
	 */
	public SMPLContext extendFunctionEnvironment(ArrayList<String> fParams, ArrayList<SMPLFunction> args);

	/**
	 * Numbers
	 * 
	 * @param  nParams [description]
	 * @param  vals    [description]
	 * @return         [description]
	 */
	public SMPLContext extendNumericalEnvironment(ArrayList<String> nParams, ArrayList<Double> vals);

	/**
	 * Vectors
	 *
	 * @param vParams The corresponding names of the values
	 * @param args The corresponding values for the names
	 * @return new created context with Vectors is extended with new bindings
	 */
	public SMPLContext extendVectorEnvironment(ArrayList<String> vParams, ArrayList<SMPLVector> args);

	/**
	 * Pairs
	 *
	 * @param pParams The corresponding names of the values
	 * @param args Corresponding values for the pair
	 * @return new created context with pairs extended with new bindings
	 */
	public SMPLContext extendPairEnvironment(ArrayList<String> pParams, ArrayList<SMPLPair> args);

	/**
	 *
	 * @param formalParameters The corresponding names of the values
	 * @param arguments Corresponding values for the arguments
	 * @return new created context with pairs extended with new bindings
	 */
	public SMPLContext extendSMPLValue(ArrayList<String> formalParameters, ArrayList<SMPLValue> arguments);

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
	public void putFunction(String name, SMPLFunction p);

	/**
	 * Store a binding for the given name to the given number.
	 * @param name The identifier of the binding
	 * @param n The numerical value to be associated with the name
	 */
	public void putNumber(String name, Double n);

	/**
	 * Store  a binding for the given name to an SMPLVector
	 * @param name the identifier of the binding
	 * @param v the identifier of the binding
	 */
	public void putVector(String name, SMPLVector v);

	/**
	 * Store a binding for the given name to an SMPLPair
	 * @param name the identifier of the pair
	 * @param v the identifier of the binding
	 */
	public void putPair(String name, SMPLPair v);

	/**
	 *Store a binding for the given name to an SMPLValue
	 *@param name the identifier of the binding
	 * @param v the identifier of the binding
	 */
	public void putSMPLVal(String name,SMPLValue v);

	/**
	 *
	 * Get boolean environment associated with this context
	 * @return bool this associated boolean environment
     */
	public  SMPLEnvironment<Boolean> getBoolEnv();


}