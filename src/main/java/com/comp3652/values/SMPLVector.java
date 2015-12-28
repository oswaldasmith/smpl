package com.comp3652.values;

import com.comp3652.lang.ASTExp;
import com.comp3652.lang.SMPLExp;
import com.comp3652.lang.SMPLVectorExp;

import java.util.*;
import java.util.stream.Stream;

public class SMPLVector extends SMPLValue<SMPLExp> {
    private Vector vector;
    private SMPLVectorExp values;
    private ASTExp ob1,ob2;

    public SMPLVector(ArrayList<ASTExp> v) {
        this.vector = new Vector(v);
    }

    public SMPLVector(ASTExp ob1,ASTExp ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }


    public int size() {
        return vector.size();
    }

    @Override
    public Stream<ASTExp> stream() {
        return null;
    }

    @Override
    public String toString(){

        String strOutput = "";
        for(ASTExp c : values.getExplist())
            strOutput += c.toString() + ",";

        if( strOutput.length() > 0 )
            strOutput = strOutput.substring(0, strOutput.length() - 1);

// public class SMPLVector extends SMPLValue<SMPLVector>{
	
// 	// need to rep empty lists
// 	public static final List<SMPLValue> EMPTY = Collections.emptyList();

// 	List<SMPLValue> values = new ArrayList<>();

// 	public SMPLVector(SMPLValue.. newValues) {
// 		values = new ArrayList(Arrays.asList(newValues));
// 	}

// 	public SMPLVector(ArrayList<SMPLValue> newValues) {
// 		values.addAll(newValues);
// 	}

// 	public ArrayList<SMPLValue> getValues() {
// 		return values;
// 	}

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