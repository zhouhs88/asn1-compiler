/* Generated By:JJTree: Do not edit this line. ASTBooleanValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTBooleanValue extends SimpleNode {
  public ASTBooleanValue(int id) {
    super(id);
  }

  public ASTBooleanValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3da793437a8aa5fe8f7eef4fa2a17c6e (do not edit this line) */