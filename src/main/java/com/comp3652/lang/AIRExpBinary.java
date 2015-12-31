package com.comp3652.lang;

/**
 * Created by shane on 12/31/15.
 */
public class AIRExpBinary extends AIRExpInt {
    public AIRExpBinary(int v) {

        super(Integer.parseInt("" + v, 2));
    }
}
