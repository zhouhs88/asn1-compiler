/* Generated By:JJTree: Do not edit this line. ASTSnmpReferPart.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSnmpReferPart extends SimpleNode {
  public ASTSnmpReferPart(int id) {
    super(id);
  }

  public ASTSnmpReferPart(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=03c243658d0502aed450bcf6f4e6fa9a (do not edit this line) */
