//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <INT>
 */
public class IntegerType implements Node {
   public NodeToken f0;

   public IntegerType(NodeToken n0) {
      f0 = n0;
   }

   public IntegerType() {
      f0 = new NodeToken("int");
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

