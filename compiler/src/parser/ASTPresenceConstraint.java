/* Generated By:JJTree: Do not edit this line. ASTPresenceConstraint.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTPresenceConstraint extends SimpleNode {
  public ASTPresenceConstraint(int id) {
    super(id);
  }

  public ASTPresenceConstraint(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=7bae538d783cf7341256272e8ec85814 (do not edit this line) */