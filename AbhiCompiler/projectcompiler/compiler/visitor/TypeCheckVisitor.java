package visitor;

import java.util.Enumeration;
import syntaxtree.*;

public class TypeCheckVisitor extends TypeDepthFirstVisitor {
    String currentIdentifier = null;
    private ClassSymbolTable currClass;
    private MethodSymbolTable currMethod;
    public SymbolTable symTable =new SymbolTable();
/**
 * Constructor
 */
public TypeCheckVisitor(SymbolTable symTable){
	this.symTable=symTable;
}
	/**
	 * f0 -> MainClass()
	 * f1 -> ( ClassDecl() )*
	 * f2 -> <EOF>
	 */
	public Type visit(Program n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
	}

	/**
	 * f0 -> <CLASS>
	 * f1 -> ID()
	 * f2 -> <LBRACE>
	 * f3 -> <PUBLIC>
	 * f4 -> <STATIC>
	 * f5 -> <Type>
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
	public Type visit(MainClass n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   n.f6.accept(this);
	   n.f7.accept(this);
	   n.f8.accept(this);
	   n.f9.accept(this);
	   n.f10.accept(this);
	   n.f11.accept(this);
	   n.f12.accept(this);
	   n.f13.accept(this);
	   n.f14.accept(this);
	   n.f15.accept(this);
	   n.f16.accept(this);
	   return null;
	}

	/**
	 * f0 -> ClassDeclSimple()
	 *       | ClassDeclExtends()
	 */
	public Type visit(ClassDecl n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> <CLASS>
	 * f1 -> ID()
	 * f2 -> <LBRACE>
	 * f3 -> ( VarDecl() )*
	 * f4 -> ( MethodDecl() )*
	 * f5 -> <RBRACE>
	 */
	public Type visit(ClassDeclSimple n) {
	   this.currClass=this.symTable.get(n.f1.f0.tokenImage);
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   return null;
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
	public Type visit(ClassDeclExtends n) {
	   this.currClass= this.symTable.get(n.f1.f0.tokenImage);
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   n.f6.accept(this);
	   n.f7.accept(this);
	   return null;
	}

	/**
	 * f0 -> Type()
	 * f1 -> ID()
	 * f2 -> <SEMICOLON>
	 */
	public Type visit(VarDecl n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
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
	public Type visit(MethodDecl n) {
	   this.currMethod=this.currClass.getMethod(n.f2.f0.tokenImage);
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   n.f6.accept(this);
	   n.f7.accept(this);
	   n.f8.accept(this);
	   n.f9.accept(this);
	   n.f10.accept(this);
	   n.f11.accept(this);
	   n.f12.accept(this);
	   return null;
	}

	/**
	 * f0 -> Type()
	 * f1 -> ID()
	 * f2 -> ( FormalRest() )*
	 */
	public Type visit(FormalList n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
	}

	/**
	 * f0 -> <COMMA>
	 * f1 -> Type()
	 * f2 -> ID()
	 */
	public Type visit(FormalRest n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
	}

	/**
	 * f0 -> IntArrayType()
	 *       | BooleanType()
	 *       | IntegerType()
	 *       | IdentifierType()
	 */
	public Type visit(Type n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> <INT>
	 * f1 -> <LBRACKET>
	 * f2 -> <RBRACKET>
	 */
	public Type visit(IntArrayType n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
	}

	/**
	 * f0 -> <BOOLEAN>
	 */
	public Type visit(BooleanType n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> <INT>
	 */
	public Type visit(IntegerType n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> <IDENTIFIER>
	 */
	public Type visit(IdentifierType n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> Block()
	 *       | IfStatement()
	 *       | WhileStatement()
	 *       | StatementPrint()
	 *       | Assign()
	 *       | ArrayAssign()
	 */
	public Type visit(Statement n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> "{"
	 * f1 -> StatementList()
	 * f2 -> "}"
	 */
	public Type visit(Block n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return null;
	}

	/**
	 * f0 -> ( Statement() )*
	 */
	public Type visit(StatementList n) {
	   n.f0.accept(this);
	   return null;
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
	public Type visit(IfStatement n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   n.f6.accept(this);
	   return null;
	}

	/**
	 * f0 -> <WHILE>
	 * f1 -> <LPAREN>
	 * f2 -> Exp()
	 * f3 -> <RPAREN>
	 * f4 -> Statement()
	 */
	public Type visit(WhileStatement n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   return null;
	}

	/**
	 * f0 -> <PRINT>
	 * f1 -> <LPAREN>
	 * f2 -> Exp()
	 * f3 -> <RPAREN>
	 * f4 -> <SEMICOLON>
	 */
	public Type visit(StatementPrint n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   return null;
	}

	/**
	 * f0 -> ID()
	 * f1 -> <ASSIGN>
	 * f2 -> Exp()
	 * f3 -> <SEMICOLON>
	 */
	public Type visit(Assign n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   return null;
	}

	/**
	 * f0 -> ID()
	 * f1 -> <LBRACKET>
	 * f2 -> Exp()
	 * f3 -> <RBRACKET>
	 * f4 -> <ASSIGN>
	 * f5 -> Exp()
	 * f6 -> <SEMICOLON>
	 */
	public Type visit(ArrayAssign n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   n.f5.accept(this);
	   n.f6.accept(this);
	   return null;
	}

	/**
	 * f0 -> ExpFirst()
	 * f1 -> ( ExpFirstAdjacent() )*
	 */
	public Type visit(Exp n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return null;
	}

	/**
	 * f0 -> <AND>
	 * f1 -> ExpFirst()
	 */
	public Type visit(ExpFirstAdjacent n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return null;
	}

	/**
	 * f0 -> ExpSecond()
	 * f1 -> ( ExpSecondAdjacent() )*
	 */
	public Type visit(ExpFirst n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return null;
	}

	/**
	 * f0 -> <LT>
	 * f1 -> ExpSecond()
	 */
	public Type visit(ExpSecondAdjacent n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return null;
	}

	/**
	 * f0 -> Term()
	 * f1 -> ( TermAdjacent() )*
	 */
	public Type visit(ExpSecond n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   TermAdjacent t;
	   if(n.f1.present()){
	   	for ( int i = 0; i < n.f1.size(); i++ ) {
	   		
	   		  t =(TermAdjacent)n.f1.elementAt(i);
	  
	   		
	      if(t.f1.accept(this) != null){
	   		  
	    if(t.f1.accept(this).f0.which!=2){
	    	if(t.f1.accept(this).f0.which ==3){
	    		Variable v =this.currMethod.getVar(this.currentIdentifier);
	    		if(v.getVariableType()!=2){
	    	   	ErrorMsg.complain("Right Side of expression should be of type integer");
	    		//ErrorMsg.complain(".....Line number:"+(AddMinus) 
	    		}
	    		}else{
	   			ErrorMsg.complain("Right Side of expression should be of type integer");
	   			//ErrorMsg.complain(".....Line number:"+f.f0.beginLine); 
	   		}
	    	}
	   		 
	   		 	
	    }
	  
	   	if(n.f0.f0.accept(this).f0.which!= 2){
	   	  	
	   	if(n.f0.accept(this).f0.which ==3){
	   	
	   	Variable v =this.currMethod.getVar(this.currentIdentifier);
	   	
	   	if(v.getVariableType()!=2){
	   		ErrorMsg.complain("Left Side of expression should be of type integer");
	   		//ErrorMsg.complain(".....Line number:"+f.f0.beginLine);
	   	
			
	   	}
	   }else{
	   	
	   	 ErrorMsg.complain("Left Side of expression should be of type integer");		
	   	
	   }
	   	}
	  
	   	
	}//end of for loop
	   	
	   	
	   }//end of if 
	   
	   return null;
	}

	/**
	 * f0 -> AddMinus()
	 * f1 -> Term()
	 */
	public Type visit(TermAdjacent n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	  return  n.f1.accept(this);
	}

	/**
	 * f0 -> <PLUS>
	 *       | <MINUS>
	 */
	public Type visit(AddMinus n) {
	   n.f0.accept(this);
	   return null;
	}

	/**
	 * f0 -> Factor()
	 * f1 -> ( FactorAdjacent() )*
	 */
	public Type visit(Term n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	  
	   FactorAdjacent f;
	   if(n.f1.present()){
	   		
	   	
	   
	   	for ( int i = 0; i < n.f1.size(); i++ ) {
	   		
	   		  f =(FactorAdjacent)n.f1.elementAt(i);
	  
	   		
	      if(f.f1.accept(this) != null){
	   		  
	    if(f.f1.accept(this).f0.which !=2){
	    	if(f.f1.accept(this).f0.which ==3){
	    		Variable v =this.currMethod.getVar(this.currentIdentifier);
	    		if(v.getVariableType()!=2){
	    	   	ErrorMsg.complain("Right Side of expression should be of type integer");
	    		ErrorMsg.complain(".....Line number:"+f.f0.beginLine); 
	    		}
	    		}else{
	   			ErrorMsg.complain("Right Side of expression should be of type integer");
	   			ErrorMsg.complain(".....Line number:"+f.f0.beginLine); 
	   		}
	    	}
	   		 
	   		 	
	    }
	  
	   	if(n.f0.accept(this).f0.which != 2){
	   	  	
	   	if(n.f0.accept(this).f0.which ==3){
	   	
	   	Variable v =this.currMethod.getVar(this.currentIdentifier);
	   	
	   	if(v.getVariableType()!=2){
	   		ErrorMsg.complain("Left Side of expression should be of type integer");
	   		ErrorMsg.complain(".....Line number:"+f.f0.beginLine);
	   	
			
	   	}
	   }else{
	   	
	   	 ErrorMsg.complain("Left Side of expression should be of type integer");		
	   	ErrorMsg.complain(".....Line number:"+f.f0.beginLine);
	   }
	   	}
	   	
	   	
	}//end of for loop
	   }//end of present
	
	   if(n.f1.present())
	   {
	   	
	   return new Type(new NodeChoice(n,2));
	   }else
	   	return n.f0.accept(this);
	
	}
	/**
	 * f0 -> <STAR>
	 * f1 -> Factor()
	 */
	public Type visit(FactorAdjacent n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   
  	   return n.f1.accept(this);
	}

	/**
	 * f0 -> Not()
	 *       | Elements()
	 */
	public Type visit(Factor n) {
	   n.f0.accept(this);
	   
	   if(n.f0.accept(this)!=null)
	   {
	   	
	   return n.f0.accept(this).f0.choice.accept(this);
	   }else
	   	return null;
	   }

	/**
	 * f0 -> ( <NOT> )+
	 * f1 -> Elements()
	 */
	public Type visit(Not n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return n.f1.accept(this);
	}

	/**
	 * f0 -> TerminalExp()
	 * f1 -> ( PostExp() )*
	 */
	public Type visit(Elements n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   if(n.f1.present())
	   	return new Type(new NodeChoice(n,2));
		  else
		  	return n.f0.accept(this);
	   
	}

	/**
	 * f0 -> ArrayLookup()
	 *       | Call()
	 *       | ArrayLength()
	 */
	public Type visit(PostExp n) {
	   n.f0.accept(this);
	   if(n.f0.accept(this)!=null)
		   return n.f0.accept(this).f0.choice.accept(this);
		   else 
		   	return null;
	}

	/**
	 * f0 -> <LBRACKET>
	 * f1 -> Exp()
	 * f2 -> <RBRACKET>
	 */
	public Type visit(ArrayLookup n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return new Type(new NodeChoice(n,2));
	}

	/**
	 * f0 -> <DOT>
	 * f1 -> ID()
	 * f2 -> <LPAREN>
	 * f3 -> [ ExpList() ]
	 * f4 -> <RPAREN>
	 */
	public Type visit(Call n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   return new Type(new NodeChoice(n,2));
	}

	/**
	 * f0 -> <DOT>
	 * f1 -> <LENGTH>
	 */
	public Type visit(ArrayLength n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   return new Type(new NodeChoice(n,2));
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
	public Type visit(TerminalExp n) {
	   n.f0.accept(this);
	     
	   if(n.f0.accept(this)!=null)
	   {
	   	
	   return n.f0.accept(this).f0.choice.accept(this);
	   }
	   else 
	   	return null;
	   
	}

	/**
	 * f0 -> <INTEGER_LITERAL>
	 */
	public Type visit(IntegerLiteral n) {
	   n.f0.accept(this);
	   
	   return new Type(new NodeChoice(n,2));
	}

	/**
	 * f0 -> <TRUE>
	 */
	public Type visit(True n) {
	   n.f0.accept(this);
	   return new Type(new NodeChoice(n,1));
	}

	/**
	 * f0 -> <FALSE>
	 */
	public Type visit(False n) {
	   n.f0.accept(this);
	   return new Type(new NodeChoice(n,1));
	}

	/**
	 * f0 -> <IDENTIFIER>
	 */
	public Type visit(IdentifierExp n) {
	   n.f0.accept(this);
	   this.currentIdentifier=n.f0.tokenImage;
	   return new Type(new NodeChoice(n,3));
	}

	/**
	 * f0 -> <THIS>
	 */
	public Type visit(This n) {
	   n.f0.accept(this);
	   return new Type(new NodeChoice(n,5));
	}

	/**
	 * f0 -> <LPAREN>
	 * f1 -> Exp()
	 * f2 -> <RPAREN>
	 */
	public Type visit(ParenExp n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   return n.f1.accept(this);
	}

	/**
	 * f0 -> <NEW>
	 * f1 -> <INT>
	 * f2 -> <LBRACKET>
	 * f3 -> Exp()
	 * f4 -> <RBRACKET>
	 */
	public Type visit(NewArray n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   n.f4.accept(this);
	   return new Type(new NodeChoice(n,0));
	}

	/**
	 * f0 -> <NEW>
	 * f1 -> ID()
	 * f2 -> <LPAREN>
	 * f3 -> <RPAREN>
	 */
	public Type visit(NewObject n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	   n.f2.accept(this);
	   n.f3.accept(this);
	   return new Type(new NodeChoice(n,5));
	}

	/**
	 * f0 -> Exp()
	 * f1 -> ( ExpRest() )*
	 */
	public Type visit(ExpList n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	  // return null;
	   return new Type(new NodeChoice(n,2));
	}

	/**
	 * f0 -> <COMMA>
	 * f1 -> Exp()
	 */
	public Type visit(ExpRest n) {
	   n.f0.accept(this);
	   n.f1.accept(this);
	  
	   return new Type(new NodeChoice(n,2));
	}


	/**
	 * f0 -> <IDENTIFIER>
	 */
	public Type visit(ID n) {
	   n.f0.accept(this);
	   this.currentIdentifier=n.f0.tokenImage;
	  
	   return new Type(new NodeChoice(n,3));
	}

	}

