/* Generated By:JJTree: Do not edit this line. ASTTypeOrValue.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTTypeOrValue extends SimpleNode {
  public ASTTypeOrValue(int id) {
    super(id);
  }

  public ASTTypeOrValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4bce57c1e889af26e39d1a2b5788e0a7 (do not edit this line) */
