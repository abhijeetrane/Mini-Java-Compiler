1)The CD contains two versions of compiler.
2)The TypeCheckcompiler folder contains compiler which is typechecked and runs for the TypeCheckTest programs.
3)The projectcompiler folder contains compiler which generates .j file for the CodeGen programs,which could be run by generating the .class file using
  java -jar jasmin.jar filename.j
  
  A class file will be created which can be run using JVM  with command
  java filename
  
4)The AbhiLang.jj file contains the grammer specification of the compiler.  



Abhijeet Rane