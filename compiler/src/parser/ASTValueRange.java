/* Generated By:JJTree: Do not edit this line. ASTValueRange.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public class ASTValueRange extends SimpleNode {

   private boolean isMin = false;
   private boolean isMax = false;

   public ASTValueRange(int id) {
      super(id);
   }

   public ASTValueRange(AsnParser p, int id) {
      super(p, id);
   }

   public void setMinFlag(boolean min) {
      isMin = min;
   }

   public void setMaxFlag(boolean max) {
      isMax = max;
   }

   public boolean isMinFlag() {
      return this.isMin;
   }

   public boolean isMaxFlag() {
      return this.isMax;
   }

   /** Accept the visitor. **/
   public Object jjtAccept(AsnParserVisitor visitor, Object data) {
      return visitor.visit(this, data);
   }
}
/* JavaCC - OriginalChecksum=ab80dfc20d734a4276a2be726b6a3465 (do not edit this line) */
