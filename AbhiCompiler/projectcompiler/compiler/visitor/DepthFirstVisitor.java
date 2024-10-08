//
// Generated by JTB 1.2.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration e = n.elements(); e.hasMoreElements(); )
         ((Node)e.nextElement()).accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration e = n.elements(); e.hasMoreElements(); )
            ((Node)e.nextElement()).accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration e = n.elements(); e.hasMoreElements(); )
         ((Node)e.nextElement()).accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( ClassDecl() )*
    * f2 -> <EOF>
    */
   public void visit(Program n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
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
   public void visit(MainClass n) {
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
   }

   /**
    * f0 -> ClassDeclSimple()
    *       | ClassDeclExtends()
    */
   public void visit(ClassDecl n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <CLASS>
    * f1 -> ID()
    * f2 -> <LBRACE>
    * f3 -> ( VarDecl() )*
    * f4 -> ( MethodDecl() )*
    * f5 -> <RBRACE>
    */
   public void visit(ClassDeclSimple n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
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
   public void visit(ClassDeclExtends n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
   }

   /**
    * f0 -> Type()
    * f1 -> ID()
    * f2 -> <SEMICOLON>
    */
   public void visit(VarDecl n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
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
   public void visit(MethodDecl n) {
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
   }

   /**
    * f0 -> Type()
    * f1 -> ID()
    * f2 -> ( FormalRest() )*
    */
   public void visit(FormalList n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <COMMA>
    * f1 -> Type()
    * f2 -> ID()
    */
   public void visit(FormalRest n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> IntArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | IdentifierType()
    */
   public void visit(Type n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <INT>
    * f1 -> <LBRACKET>
    * f2 -> <RBRACKET>
    */
   public void visit(IntArrayType n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <BOOLEAN>
    */
   public void visit(BooleanType n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <INT>
    */
   public void visit(IntegerType n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(IdentifierType n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Block()
    *       | IfStatement()
    *       | WhileStatement()
    *       | StatementPrint()
    *       | Assign()
    *       | ArrayAssign()
    */
   public void visit(Statement n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "{"
    * f1 -> StatementList()
    * f2 -> "}"
    */
   public void visit(Block n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> ( Statement() )*
    */
   public void visit(StatementList n) {
      n.f0.accept(this);
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
   public void visit(IfStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> <WHILE>
    * f1 -> <LPAREN>
    * f2 -> Exp()
    * f3 -> <RPAREN>
    * f4 -> Statement()
    */
   public void visit(WhileStatement n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> <PRINT>
    * f1 -> <LPAREN>
    * f2 -> Exp()
    * f3 -> <RPAREN>
    * f4 -> <SEMICOLON>
    */
   public void visit(StatementPrint n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> ID()
    * f1 -> <ASSIGN>
    * f2 -> Exp()
    * f3 -> <SEMICOLON>
    */
   public void visit(Assign n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
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
   public void visit(ArrayAssign n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> ExpFirst()
    * f1 -> ( ExpFirstAdjacent() )*
    */
   public void visit(Exp n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <AND>
    * f1 -> ExpFirst()
    */
   public void visit(ExpFirstAdjacent n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> ExpSecond()
    * f1 -> ( ExpSecondAdjacent() )*
    */
   public void visit(ExpFirst n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <LT>
    * f1 -> ExpSecond()
    */
   public void visit(ExpSecondAdjacent n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> Term()
    * f1 -> ( TermAdjacent() )*
    */
   public void visit(ExpSecond n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> AddMinus()
    * f1 -> Term()
    */
   public void visit(TermAdjacent n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <PLUS>
    *       | <MINUS>
    */
   public void visit(AddMinus n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> Factor()
    * f1 -> ( FactorAdjacent() )*
    */
   public void visit(Term n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <STAR>
    * f1 -> Factor()
    */
   public void visit(FactorAdjacent n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> Not()
    *       | Elements()
    */
   public void visit(Factor n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> ( <NOT> )+
    * f1 -> Elements()
    */
   public void visit(Not n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> TerminalExp()
    * f1 -> ( PostExp() )*
    */
   public void visit(Elements n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> ArrayLookup()
    *       | Call()
    *       | ArrayLength()
    */
   public void visit(PostExp n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <LBRACKET>
    * f1 -> Exp()
    * f2 -> <RBRACKET>
    */
   public void visit(ArrayLookup n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <DOT>
    * f1 -> ID()
    * f2 -> <LPAREN>
    * f3 -> [ ExpList() ]
    * f4 -> <RPAREN>
    */
   public void visit(Call n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> <DOT>
    * f1 -> <LENGTH>
    */
   public void visit(ArrayLength n) {
      n.f0.accept(this);
      n.f1.accept(this);
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
   public void visit(TerminalExp n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <TRUE>
    */
   public void visit(True n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <FALSE>
    */
   public void visit(False n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(IdentifierExp n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <THIS>
    */
   public void visit(This n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <LPAREN>
    * f1 -> Exp()
    * f2 -> <RPAREN>
    */
   public void visit(ParenExp n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
   }

   /**
    * f0 -> <NEW>
    * f1 -> <INT>
    * f2 -> <LBRACKET>
    * f3 -> Exp()
    * f4 -> <RBRACKET>
    */
   public void visit(NewArray n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> <NEW>
    * f1 -> ID()
    * f2 -> <LPAREN>
    * f3 -> <RPAREN>
    */
   public void visit(NewObject n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> Exp()
    * f1 -> ( ExpRest() )*
    */
   public void visit(ExpList n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <COMMA>
    * f1 -> Exp()
    */
   public void visit(ExpRest n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(ID n) {
      n.f0.accept(this);
   }

}
