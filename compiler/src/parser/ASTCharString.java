/* Generated By:JJTree: Do not edit this line. ASTCharString.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTCharString extends SimpleNode {

  public ASTCharString(int id) {
    super(id);
  }

  public ASTCharString(AsnParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=007a6c9075e9c5a2edd3ed155c2cced7 (do not edit this line) */
