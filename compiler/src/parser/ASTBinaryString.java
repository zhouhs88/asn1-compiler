/* Generated By:JJTree: Do not edit this line. ASTBinaryString.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTBinaryString extends SimpleNode {
  public ASTBinaryString(int id) {
    super(id);
  }

  public ASTBinaryString(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=bfba3766f9b4d0e61d5a77c387cf8622 (do not edit this line) */
