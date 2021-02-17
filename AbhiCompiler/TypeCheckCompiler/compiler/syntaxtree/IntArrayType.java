//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <INT>
 * f1 -> <LBRACKET>
 * f2 -> <RBRACKET>
 */
public class IntArrayType implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;

   public IntArrayType(NodeToken n0, NodeToken n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public IntArrayType() {
      f0 = new NodeToken("int");
      f1 = new NodeToken("[");
      f2 = new NodeToken("]");
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

