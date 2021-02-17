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
public class ObjectDepthFirst implements ObjectVisitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public Object visit(NodeList n, Object argu) {
      Object _ret=null;
      int _count=0;
      for ( Enumeration e = n.elements(); e.hasMoreElements(); ) {
         ((Node)e.nextElement()).accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public Object visit(NodeListOptional n, Object argu) {
      if ( n.present() ) {
         Object _ret=null;
         int _count=0;
         for ( Enumeration e = n.elements(); e.hasMoreElements(); ) {
            ((Node)e.nextElement()).accept(this,argu);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public Object visit(NodeOptional n, Object argu) {
      if ( n.present() )
         return n.node.accept(this,argu);
      else
         return null;
   }

   public Object visit(NodeSequence n, Object argu) {
      Object _ret=null;
      int _count=0;
      for ( Enumeration e = n.elements(); e.hasMoreElements(); ) {
         ((Node)e.nextElement()).accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public Object visit(NodeToken n, Object argu) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( ClassDecl() )*
    * f2 -> <EOF>
    */
   public Object visit(Program n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
      n.f16.accept(this, argu);
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
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
    * f0 -> Type()
    * f1 -> ID()
    * f2 -> <SEMICOLON>
    */
   public Object visit(VarDecl n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> ID()
    * f2 -> ( FormalRest() )*
    */
   public Object visit(FormalList n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <COMMA>
    * f1 -> Type()
    * f2 -> ID()
    */
   public Object visit(FormalRest n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> StatementList()
    * f2 -> "}"
    */
   public Object visit(Block n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ( Statement() )*
    */
   public Object visit(StatementList n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <WHILE>
    * f1 -> <LPAREN>
    * f2 -> Exp()
    * f3 -> <RPAREN>
    * f4 -> Statement()
    */
   public Object visit(WhileStatement n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ID()
    * f1 -> <ASSIGN>
    * f2 -> Exp()
    * f3 -> <SEMICOLON>
    */
   public Object visit(Assign n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      return _ret;
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
   public Object visit(ArrayAssign n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ExpFirst()
    * f1 -> ( ExpFirstAdjacent() )*
    */
   public Object visit(Exp n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
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
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <LT>
    * f1 -> ExpSecond()
    */
   public Object visit(ExpSecondAdjacent n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Term()
    * f1 -> ( TermAdjacent() )*
    */
   public Object visit(ExpSecond n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ( <NOT> )+
    * f1 -> Elements()
    */
   public Object visit(Not n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> TerminalExp()
    * f1 -> ( PostExp() )*
    */
   public Object visit(Elements n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ArrayLookup()
    *       | Call()
    *       | ArrayLength()
    */
   public Object visit(PostExp n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <LBRACKET>
    * f1 -> Exp()
    * f2 -> <RBRACKET>
    */
   public Object visit(ArrayLookup n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <DOT>
    * f1 -> <LENGTH>
    */
   public Object visit(ArrayLength n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
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
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public Object visit(IntegerLiteral n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <TRUE>
    */
   public Object visit(True n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <FALSE>
    */
   public Object visit(False n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public Object visit(IdentifierExp n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <THIS>
    */
   public Object visit(This n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <LPAREN>
    * f1 -> Exp()
    * f2 -> <RPAREN>
    */
   public Object visit(ParenExp n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <NEW>
    * f1 -> <INT>
    * f2 -> <LBRACKET>
    * f3 -> Exp()
    * f4 -> <RBRACKET>
    */
   public Object visit(NewArray n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <NEW>
    * f1 -> ID()
    * f2 -> <LPAREN>
    * f3 -> <RPAREN>
    */
   public Object visit(NewObject n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Exp()
    * f1 -> ( ExpRest() )*
    */
   public Object visit(ExpList n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <COMMA>
    * f1 -> Exp()
    */
   public Object visit(ExpRest n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public Object visit(ID n, Object argu) {
      Object _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

}
