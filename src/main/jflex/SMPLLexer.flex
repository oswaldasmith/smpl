/* Specification for SMPL tokens */

// user customisations
package com.comp3652.lang;

import java_cup.runtime.*;
import java.io.IOException;

// Jlex directives
%%
    
%cup
%public

%class SMPLLexer
%unicode

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

special = [_"$""#""?""~"]

hex = [0-9a-fA-F]

alpha = [a-zA-Z]

num = [0-9]

alphanum = {alpha}|{num}

all = {alphanum}|{special}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

%%

<YYINITIAL>	{ws}	{/* ignore whitespace */}
<YYINITIAL>	"."	{ //. on a line by itself is EOF
			  return new Symbol(sym.EOF);}

<YYINITIAL>    {nl} {
                        //skip newline, but reset char counter
                        yychar = 0;
                      }
<YYINITIAL>    \#.*  { // ignore line comments
                    }

<YYINITIAL> {Comment} { /* ignore */ }

<YYINITIAL>	"+"		{ return new Symbol(sym.PLUS); }
<YYINITIAL>	"-"		{ return new Symbol(sym.MINUS); }
<YYINITIAL>	"*"		{ return new Symbol(sym.TIMES); }
<YYINITIAL>	"/"		{ return new Symbol(sym.DIV); }
<YYINITIAL>	"%"		{ return new Symbol(sym.MOD); }
<YYINITIAL> ":=" 	{ return new Symbol(sym.ASSIGN); }

<YYINITIAL> "<"|">"|"<="|">="|"="|"!=" { return new Symbol(sym.CMP, yytext()); }

<YYINITIAL>	"("		{ return new Symbol(sym.LPAREN); }
<YYINITIAL>	")"		{ return new Symbol(sym.RPAREN); }

<YYINITIAL>	"["		{ return new Symbol(sym.LBRACKET); }
<YYINITIAL>	"]"		{ return new Symbol(sym.RBRACKET); }

<YYINITIAL>	"{"		{ return new Symbol(sym.LBRACE); }
<YYINITIAL>	"}"		{ return new Symbol(sym.RBRACE); }

<YYINITIAL>	","		{ return new Symbol(sym.COMMA); }
<YYINITIAL>	":"		{ return new Symbol(sym.COLON); }
<YYINITIAL>	";"		{ return new Symbol(sym.SEMI); }

<YYINITIAL>	"let" 	{ return new Symbol(sym.LET); }
<YYINITIAL> "def" 	{ return new Symbol(sym.DEF); }

<YYINITIAL> "if" 	{ return new Symbol(sym.IF); }
<YYINITIAL> "case" 	{ return new Symbol(sym.CASE); }

<YYINITIAL>	"call" 	{ return new Symbol(sym.CALL); }
<YYINITIAL> "proc" 	{ return new Symbol(sym.PROC); }
<YYINITIAL> "lazy" 	{ return new Symbol(sym.LAZY); }

<YYINITIAL> "&"		{ return new Symbol(sym.BITAND); }
<YYINITIAL> "|"		{ return new Symbol(sym.BITOR); }
<YYINITIAL> "~"		{ return new Symbol(sym.BITNOT); }

<YYINITIAL> "and" 	{ return new Symbol(sym.AND); }
<YYINITIAL> "or" 	{ return new Symbol(sym.OR); }
<YYINITIAL> "not" 	{ return new Symbol(sym.NOT); }

<YYINITIAL> "pair" 	{ return new Symbol(sym.PAIR); }
<YYINITIAL> "pair?" { return new Symbol(sym.IFPAIR); }

<YYINITIAL> "print" 	{ return new Symbol(sym.PRINT); }
<YYINITIAL> "println" 	{ return new Symbol(sym.PRINTLN); }
<YYINITIAL> "read" 		{ return new Symbol(sym.READ); }
<YYINITIAL> "readint" 	{ return new Symbol(sym.READINT); }

<YYINITIAL> "car" 		{ return new Symbol(sym.CAR); }
<YYINITIAL> "cdr" 		{ return new Symbol(sym.CDR); }
<YYINITIAL> "list" 		{ return new Symbol(sym.LIST); }
<YYINITIAL> "substr" 	{ return new Symbol(sym.SUBSTRING); }
<YYINITIAL> "size" 		{ return new Symbol(sym.SIZE); }
<YYINITIAL> "eqv?" 		{ return new Symbol(sym.IFEQUIVALENT); }
<YYINITIAL> "equal?" 	{ return new Symbol(sym.IFEQUAL); }
<YYINITIAL> "then" 		{ return new Symbol(sym.THEN); }
<YYINITIAL> "else" 		{ return new Symbol(sym.ELSE); }
<YYINITIAL> "list" 		{ return new Symbol(sym.LIST); }
<YYINITIAL> "be" 		{ return new Symbol(sym.BE); }


<YYINITIAL> "#t" 	{ return new Symbol(sym.TRUE, yytext()); }
<YYINITIAL> "#f" 	{ return new Symbol(sym.FALSE, yytext()); }



<YYINITIAL>    [0-9]+ {
	       // INTEGER
	       return new Symbol(sym.INTEGER, 
				 new Integer(yytext()));
	       }

<YYINITIAL> #b{0|1}+ { return new Symbol(sym.BIN, Integer.parseInt(yytext().substring(2), 2)); }

<YYINITIAL> #x{hex}+ { return new Symbol(sym.HEX, Integer.parseInt(yytext().substring(2), 16)); }


<YYINITIAL>    {alpha}+{alphanum}* | {alphanum}+{alpha}* {
						return new Symbol(sym.VAR, yytext());
	       }

<YYINITIAL>     0?"."{num}+ {
			// FRACTION
			return new Symbol(sym.FRACTION, new Double(yytext()));
		}

<YYINITIAL>	{num}*"."{num}+ | {num}+"."{num}* {
			// REAL no. used for defining frames
			return new Symbol(sym.FLOAT, new Double(yytext()));
		}


