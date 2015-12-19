JFLEX = jflex
SRC_PATH = /home/shane/Documents/School/LP/project-3/src/
LANG_PATH = $(SRC_PATH)hpl/lang/
SYS_PATH = $(SRC_PATH)hpl/sys/
VALUES_PATH = $(SRC_PATH)hpl/values/
CUP = cup
CUPFLAGS = -parser
JAVAC = javac
JAVA = java
CLASSPATH = /usr/share/java/java-cup-11a-runtime.jar:$(SRC_PATH)


all: build run

build: lex parser compile

lex: $(LANG_PATH)HPLLexer
	$(JFLEX) $(LANG_PATH)HPLLexer

parser: $(LANG_PATH)HPLParser.cup 
	$(CUP) $(CUPFLAGS) HPLParser $(LANG_PATH)HPLParser.cup
	mv HPLParser.java sym.java $(LANG_PATH)

compile: $(LANG_PATH)sym.java $(LANG_PATH)HPLParser.java 
	$(JAVAC) -classpath $(CLASSPATH) $(LANG_PATH)*.java $(SYS_PATH)*.java $(VALUES_PATH)*.java

run: $(SYS_PATH)HPLRepl.class
	$(JAVA) -classpath $(CLASSPATH) hpl.sys.HPLRepl

clean:
	rm $(SRC_PATH)hpl/*/*.class $(LANG_PATH)HPLParser.java $(LANG_PATH)HPLLexer.java $(LANG_PATH)sym.java
	
