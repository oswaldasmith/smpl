package com.comp3652.lang;

/**
 * Created by carlos on 12/23/15.
 */
public class BinOpNonArith implements BinaryOp<String,String> {
    String symbol;


    public BinOpNonArith(String symbol){
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String apply(String leftArg, String rightArg) {
        return (leftArg && rightArg);
    }
}
