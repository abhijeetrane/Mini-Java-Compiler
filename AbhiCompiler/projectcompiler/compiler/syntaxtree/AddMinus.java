//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <PLUS>
 *       | <MINUS>
 */
public class AddMinus implements Node {
   public NodeChoice f0;

   public AddMinus(NodeChoice n0) {
      f0 = n0;
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

