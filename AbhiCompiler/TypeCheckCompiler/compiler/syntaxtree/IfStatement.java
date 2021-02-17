//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> <IF>
 * f1 -> <LPAREN>
 * f2 -> Exp()
 * f3 -> <RPAREN>
 * f4 -> Statement()
 * f5 -> <ELSE>
 * f6 -> Statement()
 */
public class IfStatement implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Exp f2;
   public NodeToken f3;
   public Statement f4;
   public NodeToken f5;
   public Statement f6;

   public IfStatement(NodeToken n0, NodeToken n1, Exp n2, NodeToken n3, Statement n4, NodeToken n5, Statement n6) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
   }

   public IfStatement(Exp n0, Statement n1, Statement n2) {
      f0 = new NodeToken("if");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken(")");
      f4 = n1;
      f5 = new NodeToken("else");
      f6 = n2;
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

