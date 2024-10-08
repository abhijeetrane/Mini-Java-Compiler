//
// Generated by JTB 1.2.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> MainClass()
 * f1 -> ( ClassDecl() )*
 * f2 -> <EOF>
 */
public class Program implements Node {
   public MainClass f0;
   public NodeListOptional f1;
   public NodeToken f2;

   public Program(MainClass n0, NodeListOptional n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public Program(MainClass n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken("");
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

