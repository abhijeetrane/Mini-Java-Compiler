//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> ID()
 * f1 -> <LBRACKET>
 * f2 -> Exp()
 * f3 -> <RBRACKET>
 * f4 -> <ASSIGN>
 * f5 -> Exp()
 * f6 -> <SEMICOLON>
 */
public class ArrayAssign implements Node {
   public ID f0;
   public NodeToken f1;
   public Exp f2;
   public NodeToken f3;
   public NodeToken f4;
   public Exp f5;
   public NodeToken f6;

   public ArrayAssign(ID n0, NodeToken n1, Exp n2, NodeToken n3, NodeToken n4, Exp n5, NodeToken n6) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
   }

   public ArrayAssign(ID n0, Exp n1, Exp n2) {
      f0 = n0;
      f1 = new NodeToken("[");
      f2 = n1;
      f3 = new NodeToken("]");
      f4 = new NodeToken("=");
      f5 = n2;
      f6 = new NodeToken(";");
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

