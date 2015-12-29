package com.comp3652.sys;

import com.comp3652.lang.SMPLEvaluator;
import com.comp3652.lang.SMPLLexer;
import com.comp3652.lang.SMPLParser;
import com.comp3652.lang.SMPLProgram;
import com.comp3652.values.SMPLValue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class SMPLRepl {
    static SMPLEvaluator interp;
    static SMPLContext globalEnv;


    public static void main(String args[]) throws FileNotFoundException {
        String file = "/Users/carlos/Desktop/smpl-oswald/smpl/smpl-tests.smpl";
            try {
                parseEvalShow(new FileReader(new File(file)), globalEnv);
            } catch (FileNotFoundException fnfe) {
                System.out.println("Could not find file " + file);
            }
    }

    /**
     * @param r   The reader containing the program fragment to be interpreted
     * @param env The environment w.r.t. which the fragment should be evaluated
     */
    public static void parseEvalShow(Reader r, SMPLContext env) {
        SMPLLexer lexer;
        SMPLParser parser;
        SMPLProgram commands = null;

        try{
            lexer = new SMPLLexer(r);
            parser = new SMPLParser(lexer);
            commands = (SMPLProgram) parser.parse().value;
        }
        catch (Exception e){
            System.out.println("Syntax Error:" + e.getMessage());
        }

        SMPLValue result;
        if (commands != null)
            try {
                result = commands.visit(interp, env);
                if (result != SMPLValue.DEFAULT) {
                    System.out.println("\n" + result.toString());
                } else {
                    System.out.println("\nNo result");
                }
            } catch (SMPLException hple) {
                System.out.println("Runtime Error: " + hple.report());
            }
    }
}