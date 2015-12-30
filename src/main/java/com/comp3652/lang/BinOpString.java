package com.comp3652.lang;

/**
 * Created by carlos on 12/24/15.
 */
public enum BinOpString implements BinaryOp<String,String> {
    CONCAT("@") {
        @Override
        public String apply(String leftArg, String rightArg) {
            return leftArg.concat(rightArg);
        }
    };

    String symbol;

    BinOpString(String symbol) {
        this.symbol = symbol;
    }


    @Override
    public String getSymbol() {
        return this.symbol;
    }



}
