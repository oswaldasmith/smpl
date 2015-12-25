package com.comp3652.lang;

/**
 * Created by carlos on 12/24/15.
 */
public class BinOpString implements BinaryOp<String,String> {
    private String symbol;

    public BinOpString(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public String apply (String leftArg, String rightArg){
        return leftArg.concat(rightArg);
    }

}
