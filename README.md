# smpl
COMP3652 - 2015 Final Project - The 'SMPL' Programming Language

smpl is a small, but expressive toy programming language. As the name suggests, smpl is easy to learn but, as you will discover, it is quite powerful.

This document only partly specifies smpl. Specifically, only the core subset of smpl is described. There are a number of extensions and modifications that can be made to smpl, which you may choose to experiment with after implementing the core functionality.
smpl is dynamically typed and (should be) tail-recursive. 

Its procedures are first class objects3. 

All smpl sentences are in fact expressions in the sense that they implicitly return values. Some expressions return an “unspecified value” to indicate that the value is not useful; these expressions are essentially statements.
smpl has integers, floating point numbers, the two boolean literals, the empty list, characters, strings, pairs and vectors as primitive data types. Storage that is dynamically allocated is au- tomatically recovered by a garbage collector. There are no explicit pointers, all references to compound data are automatically treated as pointers to the data. All parameters are passed using the “call-by-value” convention, unless prefixed by a keyword indicating otherwise. Variables are statically scoped and may denote a value of any data type (they are dynamically typed).
