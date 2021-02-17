//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <LT>
 * f1 -> ExpSecond()
 */
public class ExpSecondAdjacent implements Node {
   public NodeToken f0;
   public ExpSecond f1;

   public ExpSecondAdjacent(NodeToken n0, ExpSecond n1) {
      f0 = n0;
      f1 = n1;
   }

   public ExpSecondAdjacent(ExpSecond n0) {
      f0 = new NodeToken("<");
      f1 = n0;
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

