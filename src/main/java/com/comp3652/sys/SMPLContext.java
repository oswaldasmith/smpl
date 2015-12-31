package com.comp3652.sys;

import com.comp3652.values.SMPLFunction;
import com.comp3652.values.SMPLPair;
import com.comp3652.values.SMPLValue;
import com.comp3652.values.SMPLVector;

import java.util.ArrayList;

public interface SMPLContext {

	/**
	 * Get the smplValue associated with a binding
	 *
	 * @param name the identifier associated with it
	 * @return
	 */
	SMPLValue getSMPLValue(String name) throws SMPLException;

	/**
	 * Lookup a reference to a number
	 *
	 * @param name of the identifier of the Double
	 * @return associated double
	 * @throws SMPLException
	 */
	Double getN(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL function.
	 * @param name The identifier of the HPL function
	 * @return The HPL function associated with the given name in this context
	 * @throws SMPLException if the name is not bound to a Function in this
	 * context
	 */
	SMPLFunction getFunction(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Vector
	 * @param name The identifier of the Vector
	 * @return The vector associated
	 *@throws SMPLException if the name is unbound in this context
	 */
	SMPLVector getVector(String name) throws SMPLException;

	/**
	 * Lookup a reference to a SMPL Pair
	 * @param name the identifier fo the pair
	 * @return The pair associated
	 * @throws SMPLException
	 */
	SMPLPair getPair(String name) throws SMPLException;


	/**
	 * Functions
	 *
	 * @param  fParams [description]
	 * @return         [description]
	 */
	SMPLContext extendFunctionEnvironment(ArrayList<String> fParams, ArrayList<SMPLFunction> args);

	/**
	 * Numbers
	 * 
	 * @param  nParams [description]
	 * @param  vals    [description]
	 * @return         [description]
	 */
	SMPLContext extendNumericalEnvironment(ArrayList<String> nParams, ArrayList<Double> vals);

	/**
	 * Vectors
	 *
	 * @param vParams The corresponding names of the values
	 * @param args The corresponding values for the names
	 * @return new created context with Vectors is extended with new bindings
	 */
	SMPLContext extendVectorEnvironment(ArrayList<String> vParams, ArrayList<SMPLVector> args);

	/**
	 * Pairs
	 *
	 * @param pParams The corresponding names of the values
	 * @param args Corresponding values for the pair
	 * @return new created context with pairs extended with new bindings
	 */
	SMPLContext extendPairEnvironment(ArrayList<String> pParams, ArrayList<SMPLPair> args);


	/**
	 *
	 * @param formalParameters The corresponding names of the values
	 * @param arguments Corresponding values for the arguments
	 * @return new created context with pairs extended with new bindings
	 */
	SMPLContext extendSMPLValue(ArrayList<String> formalParameters, ArrayList<SMPLValue> arguments);

	/**
	 * Get the numerical environment associated with this context
	 * @return this numerical environment
     */
	SMPLEnvironment<Double> getNumEnv();

	/**
	 * Store a binding for the given name to the given SMPL function.
	 * @param name The identifier of the binding
	 * @param p The HPL function to be associated with the name
	 */
	void putFunction(String name, SMPLFunction p);

	/**
	 * Store a binding for the given name to the given number.
	 * @param name The identifier of the binding
	 * @param n The numerical value to be associated with the name
	 */
	void putNumber(String name, Double n);

	/**
	 * Store  a binding for the given name to an SMPLVector
	 * @param name the identifier of the binding
	 * @param v the identifier of the binding
	 */
	void putVector(String name, SMPLVector v);

	/**
	 * Store a binding for the given name to an SMPLPair
	 * @param name the identifier of the pair
	 * @param v the identifier of the binding
	 */
	void putPair(String name, SMPLPair v);

	/**
	 *Store a binding for the given name to an SMPLValue
	 *@param name the identifier of the binding
	 * @param v the identifier of the binding
	 */
	void putSMPLVal(String name, SMPLValue v);

	/**
	 *
	 * Get boolean environment associated with this context
	 * @return bool this associated boolean environment
     */
	SMPLEnvironment<Boolean> getBoolEnv();


	SMPLEnvironment<String> getStringEnv();
}