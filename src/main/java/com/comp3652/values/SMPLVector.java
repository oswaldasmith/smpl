package com.comp3652.values;

import java.util.*;

public class SMPLVector extends SMPLValue<SMPLVector>{
	
	// need to rep empty lists
	public static final List<SMPLValue> EMPTY = Collections.emptyList();

	List<SMPLValue> values = new ArrayList<>();

	public SMPLVector(SMPLValue.. newValues) {
		values = new ArrayList(Arrays.asList(newValues));
	}

	public SMPLVector(ArrayList<SMPLValue> newValues) {
		values.addAll(newValues);
	}

	public ArrayList<SMPLValue> getValues() {
		return values;
	}

	// @Override
	// public String toString() {
	// 	String output = "";

	// 	for (int i = 0; i < values.size() - 1; i++)
	// 		output += values[i].getValue.toString() + ", ";

	// 	if (values.size() > 0)
	// 		output += values[values.size() - 1] + " "

	// 	return "[: " + output + "]";
	// }
}