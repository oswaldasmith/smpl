JFLEX = jflex
SRC_PATH = /home/shane/Documents/School/LP/smpl/src/
LANG_PATH = $(SRC_PATH)main/lang/
SYS_PATH = $(SRC_PATH)main/sys/
VALUES_PATH = $(SRC_PATH)main/values/
CUP = cup
CUPFLAGS = -parser
JAVAC = javac
JAVA = java
CLASSPATH = /usr/share/java/java-cup-11a-runtime.jar:$(SRC_PATH)


all: build run

build: lex parser compile

lex: $(LANG_PATH)SMPLLexer
	$(JFLEX) $(LANG_PATH)SMPLLexer

parser: $(LANG_PATH)SMPLParser.cup 
	$(CUP) $(CUPFLAGS) SMPLParser $(LANG_PATH)SMPLParser.cup
	mv SMPLParser.java sym.java $(LANG_PATH)

compile: $(LANG_PATH)sym.java $(LANG_PATH)HPLParser.java 
	$(JAVAC) -classpath $(CLASSPATH) $(LANG_PATH)*.java $(SYS_PATH)*.java $(VALUES_PATH)*.java

run: $(SYS_PATH)HPLRepl.class
	$(JAVA) -classpath $(CLASSPATH) hpl.sys.HPLRepl

clean:
	rm $(SRC_PATH)hpl/*/*.class $(LANG_PATH)SMPLParser.java $(LANG_PATH)HPLLexer.java $(LANG_PATH)sym.java
	
