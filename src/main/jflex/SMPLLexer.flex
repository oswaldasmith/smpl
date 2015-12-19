/* Specification for SMPL tokens */

// user customisations
package com.comp3652.smpl;

import java_cup.runtime.*;
import java.io.IOException;

// Jlex directives
%%
    
%cup
%public

%class SMPLLexer

%type java_cup.runtime.Symbol

%eofval{
	return new Symbol(sym.EOF);
%eofval}

%eofclose false

%char
%column
%line

%{
    public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }
%}


nl = [\n\r]

cc = ([\b\f]|{nl})

ws = {cc}|[\t ]

alpha = [a-zA-Z_"$""#""?""@""~"]

alphanum = {alpha}|[0-9]

%%

<YYINITIAL>	{ws}	{/* ignore whitespace */}
<YYINITIAL>	"+"	{return new Symbol(sym.PLUS);}
<YYINITIAL>	"-"	{return new Symbol(sym.MINUS);}
<YYINITIAL>	"*"	{return new Symbol(sym.MUL);}
<YYINITIAL>	"/"	{return new Symbol(sym.DIV);}
<YYINITIAL>	"%"	{return new Symbol(sym.MOD);}
<YYINITIAL>	"="	{return new Symbol(sym.ASSIGN);}

<YYINITIAL>	"("	{return new Symbol(sym.LPAREN);}
<YYINITIAL>	")"	{return new Symbol(sym.RPAREN);}
<YYINITIAL>	"{"	{return new Symbol(sym.LBRACE);}
<YYINITIAL>	"}"	{return new Symbol(sym.RBRACE);}
<YYINITIAL>	","	{return new Symbol(sym.COMMA);}
<YYINITIAL>	";"	{return new Symbol(sym.SEMI);}
<YYINITIAL>	"let"	{return new Symbol(sym.LET);}
<YYINITIAL>	"def"	{return new Symbol(sym.DEF);}

<YYINITIAL>    [0-9]+ {
	       // INTEGER
	       return new Symbol(sym.INTEGER, 
				 new Integer(yytext()));
	       }

<YYINITIAL>    {alpha}{alphanum}* {
	       // VARIABLE
	       return new Symbol(sym.VARIABLE, yytext());
	       }
