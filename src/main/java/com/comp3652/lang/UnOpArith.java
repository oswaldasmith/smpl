package com.comp3652.lang;

public enum UnOpArith implements UnaryOp<Double, Double> {
	INC("++") {
        @Override
        public Double apply(Double arg) {
            return arg + 1;
        }
    },   // experimental examples

    DEC("--") {
        @Override
        public Double apply(Double arg) {
            return arg - 1;
        }
    },   // experimental

    NEG("-") {
        @Override
        public Double apply(Double arg) {
            return -arg;
        }
    }
    ;
    
    String symbol;

    private UnOpArith(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}