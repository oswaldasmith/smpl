package com.comp3652.lang;

/**
 * Created by shane on 12/31/15.
 */
public class AIRExpHex extends AIRExpInt {

    public AIRExpHex(int v) {
        super(Integer.parseInt("" + v, 16));
    }
}
