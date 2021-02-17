package visitor;
import java.io.*;
import syntaxtree.*;
/**
 * This class generates the code for the assembler
 * @author Abhijeet Rane
 *
 * 
 */
public class CodeGenerationVisitor extends ObjectDepthFirst{
	private static String outputFileName;
	private FileWriter outputWriter;
	private int localvariable =1;
	private String methodcall;
	//FileOutputStream ofs;
	 File outputFile;
public void createFile(String s){
	try{
     		
	// outputFile = new File("s"+".txt"); 
	//  ofs = new FileOutputStream(outputFile);
	outputWriter = new FileWriter(s+".j",true);
	}  catch(IOException e){
		System.err.println(e);
  }
}	
/**
 * f0 -> MainClass()
 * f1 -> ( ClassDecl() )*
 * f2 -> <EOF>
 */
public Object visit(Program n, Object argu) {
   Object _ret=null;

   
   n.f0.accept(this, argu);
  if(n.f1.present())
   n.f1.elementAt(0).accept(this,argu);
   //n.f2.accept(this, argu);
   return _ret;
}
/**
 * f0 -> <CLASS>
 * f1 -> ID()
 * f2 -> <LBRACE>
 * f3 -> <PUBLIC>
 * f4 -> <STATIC>
 * f5 -> <VOID>
 * f6 -> <MAIN>
 * f7 -> <LPAREN>
 * f8 -> <STRING>
 * f9 -> <LBRACKET>
 * f10 -> <RBRACKET>
 * f11 -> ID()
 * f12 -> <RPAREN>
 * f13 -> <LBRACE>
 * f14 -> Statement()
 * f15 -> <RBRACE>
 * f16 -> <RBRACE>
 */
public Object visit(MainClass n, Object argu) {
   Object _ret=null;
   createFile(n.f1.f0.tokenImage);
   String o = ".class "+n.f1.f0+ "\n";
   o+=".super java/lang/Object\n";
   o+="\n";
   o+=".method public <init>()V\n";
   o+="\t.limit stack 1\n";
   o+="\t.limit locals 1\n";
   o+="\taload_0\n";
   o+="\tinvokespecial java/lang/Object/<init>()V\n";
   o+="\treturn\n";
   o+=".end method\n";
   o+="\n";
   o+=".method public static main([Ljava/lang/String;)V\n";
   o+="\t.limit stack 8\n";
   o+="\n";
   //if(n.f14.accept(this, argu) == null )
   //{}
   	//else  		
   o+=n.f14.accept(this, argu);
   o+="\n";
   o+="\treturn\n";
   o+=".end method\n";
   o+="\n";
   try{
   	outputWriter.write(o);
   	outputWriter.close();
   }catch(IOException e){
   	System.err.println(e);
   }
  /* 
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   n.f5.accept(this, argu);
   n.f6.accept(this, argu);
   n.f7.accept(this, argu);
   n.f8.accept(this, argu);
   n.f9.accept(this, argu);
   n.f10.accept(this, argu);
   n.f11.accept(this, argu);
   n.f12.accept(this, argu);
   n.f13.accept(this, argu);
   n.f14.accept(this, argu);
   n.f15.accept(this, argu);
   n.f16.accept(this, argu);*/
   return _ret;
}


/**
 * f0 -> ClassDeclSimple()
 *       | ClassDeclExtends()
 */
public Object visit(ClassDecl n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <CLASS>
 * f1 -> ID()
 * f2 -> <LBRACE>
 * f3 -> ( VarDecl() )*
 * f4 -> ( MethodDecl() )*
 * f5 -> <RBRACE>
 */
public Object visit(ClassDeclSimple n, Object argu) {
   Object _ret=null;
   createFile(n.f1.f0.tokenImage);
   String o = ".class "+n.f1.f0+ "\n";
   o+=".super java/lang/Object\n";
   o+="\n";
   o+=".method  <init>()V\n";
   o+="\t.limit stack 1\n";
   o+="\t.limit locals 1\n";
   o+="\taload_0\n";
   o+="\tinvokespecial java/lang/Object/<init>()V\n";
   o+="\treturn\n";
   o+=".end method\n";
   o+="\n";
   
   o+=n.f4.elementAt(0).accept(this, argu);
   o+="\n";
   try{
   	outputWriter.write(o);
   	outputWriter.close();
   }catch(IOException e){
   	System.err.println(e);
   }
   /*
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   n.f5.accept(this, argu);
   */
   return _ret;
}

/**
 * f0 -> <CLASS>
 * f1 -> ID()
 * f2 -> <EXTENDS>
 * f3 -> ID()
 * f4 -> <LBRACE>
 * f5 -> ( VarDecl() )*
 * f6 -> ( MethodDecl() )*
 * f7 -> <RBRACE>
 */
public Object visit(ClassDeclExtends n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   n.f5.accept(this, argu);
   n.f6.accept(this, argu);
   n.f7.accept(this, argu);
   return _ret;
}
/**
 * f0 -> <PUBLIC>
 * f1 -> Type()
 * f2 -> ID()
 * f3 -> <LPAREN>
 * f4 -> ( FormalList() )*
 * f5 -> <RPAREN>
 * f6 -> <LBRACE>
 * f7 -> ( VarDecl() )*
 * f8 -> ( Statement() )*
 * f9 -> <RETURN>
 * f10 -> Exp()
 * f11 -> <SEMICOLON>
 * f12 -> <RBRACE>
 */
public Object visit(MethodDecl n, Object argu) {
   Object _ret=null;
/*   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   n.f5.accept(this, argu);
   n.f6.accept(this, argu);
   n.f7.accept(this, argu);
   n.f8.accept(this, argu);
   n.f9.accept(this, argu);
   n.f10.accept(this, argu);
   n.f11.accept(this, argu);
   n.f12.accept(this, argu);
  */
   String o=".method ";
   o+=n.f2.f0.tokenImage;
   
   o+="()";
   if(n.f1.f0.which == 2)
      o+="I";
   o+="\n";
   o+=".limit stack 8";
   o+="\n";
   o+=".limit locals 1";
   o+="\n";
   //System.out.println(n.f10.accept(this,argu));
   	if(Integer.parseInt(n.f10.accept(this,argu).toString())>=-128 && Integer.parseInt(n.f10.accept(this,argu).toString()) <=127)
        o+="\tbipush ";
    else if(Integer.parseInt(n.f10.accept(this,argu).toString())>=-32768 && Integer.parseInt(n.f10.accept(this,argu).toString())<= 32767 )
    	o+="\tsipush ";
   o+=n.f10.accept(this,argu);
   o+="\n";
   o+="ireturn";               
   o+="\n";
   o+=".end method\n";              

   
    return o;
}
/**
 * f0 -> IntArrayType()
 *       | BooleanType()
 *       | IntegerType()
 *       | IdentifierType()
 */
public Object visit(Type n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <INT>
 * f1 -> <LBRACKET>
 * f2 -> <RBRACKET>
 */
public Object visit(IntArrayType n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <BOOLEAN>
 */
public Object visit(BooleanType n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <INT>
 */
public Object visit(IntegerType n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <IDENTIFIER>
 */
public Object visit(IdentifierType n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> Block()
 *       | IfStatement()
 *       | WhileStatement()
 *       | StatementPrint()
 *       | Assign()
 *       | ArrayAssign()
 */
public Object visit(Statement n, Object argu) {
   Object _ret=null;

   return n.f0.accept(this, argu);
}
/**
 * f0 -> "{"
 * f1 -> StatementList()
 * f2 -> "}"
 */
public Object visit(Block n, Object argu) {
   Object _ret=null;
   if(n.f1.f0.present())
   return n.f1.accept(this,argu);
   else 
   return "\n";	
}

/**
 * f0 -> ( Statement() )*
 */
public Object visit(StatementList n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
  String concat="\n";
   for ( int i = 0; i < n.f0.size(); i++ ) {
   // System.out.print("      ");
    concat+= n.f0.elementAt(i).accept(this,argu).toString();
    concat+="\n";
    //System.out.println();
}
   return concat;
}
/**
 * f0 -> <IF>
 * f1 -> <LPAREN>
 * f2 -> Exp()
 * f3 -> <RPAREN>
 * f4 -> Statement()
 * f5 -> <ELSE>
 * f6 -> Statement()
 */
public Object visit(IfStatement n, Object argu) {
   Object _ret=null;
 /*  n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   n.f5.accept(this, argu);
   n.f6.accept(this, argu);
   */
   //System.out.println(n.f2.accept(this, argu));
   if( n.f2.accept(this, argu).equals("true"))
   	return n.f4.accept(this, argu);
   else if(n.f2.accept(this, argu).equals("false"))
   return n.f6.accept(this, argu);
   else{
   	System.out.println("The if statement should have boolean value");
    //return "\n";
   }
   return "\n";
}
/**
 * f0 -> <PRINT>
 * f1 -> <LPAREN>
 * f2 -> Exp()
 * f3 -> <RPAREN>
 * f4 -> <SEMICOLON>
 */
public Object visit(StatementPrint n, Object argu) {
   Object _ret=null;
   String o="\t.limit locals "+this.localvariable+"\n" ;
    o="\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
    //System.out.println(n.f2.accept(this,argu));
      // o+="\tinvovkestatic java/lang/String/valueOf(I)Ljava/lang/String;\n";
    try{
     int i =Integer.parseInt(n.f2.accept(this,argu).toString());
     if(Integer.parseInt(n.f2.accept(this,argu).toString())>=-128 && Integer.parseInt(n.f2.accept(this,argu).toString()) <=127)
        o+="\tbipush ";
    else if(Integer.parseInt(n.f2.accept(this,argu).toString())>=-32768 && Integer.parseInt(n.f2.accept(this,argu).toString())<= 32767 )
    	o+="\tsipush ";
    }catch(Exception e){}
    	
     		o+=n.f2.accept(this,argu);
    /*
    	if(Integer.parseInt(n.f2.accept(this,argu).toString())>=-128 && Integer.parseInt(n.f2.accept(this,argu).toString()) <=127)
        o+="\tbipush ";
    else if(Integer.parseInt(n.f2.accept(this,argu).toString())>=-32768 && Integer.parseInt(n.f2.accept(this,argu).toString())<= 32767 )
    	o+="\tsipush ";
    	o+=n.f2.accept(this,argu);
    */
    
    o+="\n";
    o+="\tinvokevirtual java/io/PrintStream/println(I)V\n";
    o+="\n";
   /*n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   */
    	return o;
}

/**
 * f0 -> ID()
 * f1 -> <ASSIGN>
 * f2 -> Exp()
 * f3 -> <SEMICOLON>
 */
public Object visit(Assign n, Object argu) {
 //  Object _ret=null;
   //n.f0.accept(this, argu);
  // n.f1.accept(this, argu);
   //n.f2.accept(this, argu);
   //n.f3.accept(this, argu);
   return n.f2.accept(this,argu);
}
/**
 * f0 -> ExpFirst()
 * f1 -> ( ExpFirstAdjacent() )*
 */
public Object visit(Exp n, Object argu) {
   Object _ret=null;
 //  n.f0.accept(this, argu);
 //  n.f1.accept(this, argu);
   return n.f0.accept(this, argu);
}

/**
 * f0 -> <AND>
 * f1 -> ExpFirst()
 */
public Object visit(ExpFirstAdjacent n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   return _ret;
}

/**
 * f0 -> ExpSecond()
 * f1 -> ( ExpSecondAdjacent() )*
 */
public Object visit(ExpFirst n, Object argu) {
   //Object _ret=null;
  // n.f0.accept(this, argu);
 //  n.f1.accept(this, argu);
	String checkobject =null ;
   if(n.f1.present()){
   	for ( int i = 0; i < n.f1.size(); i++ ) {
   		if( Integer.parseInt(n.f0.accept(this,argu).toString())< Integer.parseInt(n.f1.elementAt(i).accept(this,argu).toString()))
        checkobject ="true";  
   	    else
   	    checkobject = "false";	
   	}		
   }
   if(!n.f1.present())
   	return n.f0.accept(this, argu);
   else 
   	return checkobject;
   	   
   
}

/**
 * f0 -> <LT>
 * f1 -> ExpSecond()
 */
public Object visit(ExpSecondAdjacent n, Object argu) {
   Object _ret=null;
   /*n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   */
   return n.f1.accept(this, argu);
}

/**
 * f0 -> Term()
 * f1 -> ( TermAdjacent() )*
 */
public Object visit(ExpSecond n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
   //n.f1.accept(this, argu);
   return n.f0.accept(this, argu);
}

/**
 * f0 -> AddMinus()
 * f1 -> Term()
 */
public Object visit(TermAdjacent n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   return _ret;
}

/**
 * f0 -> <PLUS>
 *       | <MINUS>
 */
public Object visit(AddMinus n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   return _ret;
}

/**
 * f0 -> Factor()
 * f1 -> ( FactorAdjacent() )*
 */
public Object visit(Term n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
  // n.f1.accept(this, argu);
   return n.f0.accept(this, argu);
}

/**
 * f0 -> <STAR>
 * f1 -> Factor()
 */
public Object visit(FactorAdjacent n, Object argu) {
   Object _ret=null;
   n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   return _ret;
}

/**
 * f0 -> Not()
 *       | Elements()
 */
public Object visit(Factor n, Object argu) {
   Object _ret=null;
  // n.f0.accept(this, argu);
   return n.f0.accept(this, argu);
}

/**
 * f0 -> ( <NOT> )+
 * f1 -> Elements()
 */
public Object visit(Not n, Object argu) {
   Object _ret=null;
  // n.f0.accept(this, argu);
  // n.f1.accept(this, argu);
   return _ret;
}

/**
 * f0 -> TerminalExp()
 * f1 -> ( PostExp() )*
 */
public Object visit(Elements n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
   //n.f1.accept(this, argu);
   //if(n.f1.present())
   	//for ( int i = 0; i < n.f1.size(); i++ ) {
   		//Object_ret =n.f1.elementAt(0).accept(this,argu);
   	//}
   if(n.f1.present()){
  String joinstring =n.f0.accept(this, argu).toString();
   	joinstring+= n.f1.elementAt(0).accept(this,argu);
   return joinstring;
   }
   	else
   return n.f0.accept(this, argu);
}
/**
 * f0 -> ArrayLookup()
 *       | Call()
 *       | ArrayLength()
 */
public Object visit(PostExp n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
   return n.f0.choice.accept(this,argu);
}
/**
 * f0 -> <DOT>
 * f1 -> ID()
 * f2 -> <LPAREN>
 * f3 -> [ ExpList() ]
 * f4 -> <RPAREN>
 */
public Object visit(Call n, Object argu) {
   Object _ret=null;
 /*  n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   n.f4.accept(this, argu);
   */
 //  if (n.f3.present())
   //	   return n.f3.accept(this,argu);
   
   //return _ret;
   //invokevirtual         Fac/printone()I
String methodstring="invokevirtual ";
   methodstring+=this.methodcall;
   methodstring+="/";
   methodstring+=n.f1.accept(this,argu);
   methodstring+="()I";	
   /*try{
    this.outputWriter.write(methodstring);
    }catch(Exception e){
    	
    }*/
    //return "newobject";
return methodstring;
}
/**
 * f0 -> IntegerLiteral()
 *       | True()
 *       | False()
 *       | IdentifierExp()
 *       | This()
 *       | ParenExp()
 *       | NewArray()
 *       | NewObject()
 */
public Object visit(TerminalExp n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
  // System.out.println(n.f0.choice.accept(this,argu));
   return n.f0.choice.accept(this,argu);
   
   
}
/**
 * f0 -> <INTEGER_LITERAL>
 */
public Object visit(IntegerLiteral n, Object argu) {
   Object _ret=null;
   //n.f0.accept(this, argu);
   //System.out.println(n.f0.tokenImage);
   return n.f0.tokenImage;
}
/**
 * f0 -> <IDENTIFIER>
 */
public Object visit(IdentifierExp n, Object argu) {
   Object _ret=null;
   this.localvariable++;
   return n.f0.tokenImage;
}
/**
 * f0 -> <NEW>
 * f1 -> ID()
 * f2 -> <LPAREN>
 * f3 -> <RPAREN>
 */
public Object visit(NewObject n, Object argu) {
   Object _ret=null;
 /*  n.f0.accept(this, argu);
   n.f1.accept(this, argu);
   n.f2.accept(this, argu);
   n.f3.accept(this, argu);
   */
   String functionstring ="new  ";
   functionstring+="\t";
   this.methodcall=n.f1.accept(this,argu).toString();
   functionstring+=n.f1.accept(this,argu);
   functionstring+="\n";
   functionstring+="dup \n";
   functionstring+="invokespecial  ";
   functionstring+=n.f1.accept(this,argu);
   functionstring+="/<init>()V";
   functionstring+="\n";
  /* try{
   this.outputWriter.write(functionstring);
   }catch(Exception e){
   	
   }*/
   
   return functionstring;
//return "";
}


/**
 * f0 -> <IDENTIFIER>
 */
public Object visit(ID n, Object argu) {
  // Object _ret=null;
   n.f0.accept(this, argu);
   return n.f0.tokenImage;
}

}

