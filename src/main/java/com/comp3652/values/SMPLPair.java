package com.comp3652.values;

import com.comp3652.lang.*;
import java.util.ArrayList;

public class SMPLPair extends SMPLValue<Pair>{

    public SMPLPair(Pair pair) {
        value = pair;

    @Override
 	public String toString() {
		return "(" + v1.toString() + ", " + v2.toString() + ")";
    }
}