/* Generated By:JJTree: Do not edit this line. ASTSnmpIndexPart.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSnmpIndexPart extends SimpleNode {
  public ASTSnmpIndexPart(int id) {
    super(id);
  }

  public ASTSnmpIndexPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b57144e98cbe689eb1d01fd5afdc1802 (do not edit this line) */
