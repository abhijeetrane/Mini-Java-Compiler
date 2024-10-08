//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <LPAREN>
 * f1 -> Exp()
 * f2 -> <RPAREN>
 */
public class ParenExp implements Node {
   public NodeToken f0;
   public Exp f1;
   public NodeToken f2;

   public ParenExp(NodeToken n0, Exp n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public ParenExp(Exp n0) {
      f0 = new NodeToken("(");
      f1 = n0;
      f2 = new NodeToken(")");
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

