//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
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
public class MethodDecl implements Node {
   public NodeToken f0;
   public Type f1;
   public ID f2;
   public NodeToken f3;
   public NodeListOptional f4;
   public NodeToken f5;
   public NodeToken f6;
   public NodeListOptional f7;
   public NodeListOptional f8;
   public NodeToken f9;
   public Exp f10;
   public NodeToken f11;
   public NodeToken f12;

   public MethodDecl(NodeToken n0, Type n1, ID n2, NodeToken n3, NodeListOptional n4, NodeToken n5, NodeToken n6, NodeListOptional n7, NodeListOptional n8, NodeToken n9, Exp n10, NodeToken n11, NodeToken n12) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
      f8 = n8;
      f9 = n9;
      f10 = n10;
      f11 = n11;
      f12 = n12;
   }

   public MethodDecl(Type n0, ID n1, NodeListOptional n2, NodeListOptional n3, NodeListOptional n4, Exp n5) {
      f0 = new NodeToken("public");
      f1 = n0;
      f2 = n1;
      f3 = new NodeToken("(");
      f4 = n2;
      f5 = new NodeToken(")");
      f6 = new NodeToken("{");
      f7 = n3;
      f8 = n4;
      f9 = new NodeToken("return");
      f10 = n5;
      f11 = new NodeToken(";");
      f12 = new NodeToken("}");
   }
   public Type accept(visitor.TypeVisitor v) {
    return v.visit(this);
 }
   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

