/* Generated By:JJTree: Do not edit this line. ASTSnmpAccess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSnmpAccess extends SimpleNode {
  public ASTSnmpAccess(int id) {
    super(id);
  }

  public ASTSnmpAccess(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3aa06a83285f5427f8c8a1d41c087af5 (do not edit this line) */
