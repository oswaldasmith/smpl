package com.comp3652.values;


public class SMPLPair extends SMPLValue<Pair>{

    public SMPLPair(Pair pair) {
        value = pair;
    }

    @Override
 	public String toString() {
		return value.toString();
    }
}