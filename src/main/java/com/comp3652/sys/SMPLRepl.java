package com.comp3652.sys;

import com.comp3652.lang.SMPLEvaluator;
import com.comp3652.lang.SMPLLexer;
import com.comp3652.lang.SMPLParser;
import com.comp3652.lang.SMPLProgram;
import com.comp3652.values.SMPLValue;

import java.io.*;

public class SMPLRepl {
    static SMPLEvaluator interp;
    static SMPLContext globalEnv;

    public static void main(String args[]) throws FileNotFoundException {

        setup();

        String file = "/home/shane/Documents/School/LP/smpl/smpl-tests.smpl";

        try {
            parseEvalShow(new FileReader(new File(file)), globalEnv);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file " + file);
        }
    }

    public static void setup() {
        interp = new SMPLEvaluator();
        globalEnv = interp.mkInitialContext();
    }

    public static void reader(String name, SMPLContext genv) throws FileNotFoundException {
        FileReader file = new FileReader(name);
        BufferedReader bufRead = new BufferedReader(file);
        StringBuffer input = new StringBuffer();
        String myLine = null;

        try {
            while (true) {
                while ((myLine = bufRead.readLine()) != null && !bufRead.readLine().equals("EOF")) {
                    input.append(myLine);
                    myLine = bufRead.readLine();
                }
                StringReader r = new StringReader(new String(input));
                parseEvalShow(r, genv);
            }
        } catch (IOException ex) {
            System.out.println("Bye");
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