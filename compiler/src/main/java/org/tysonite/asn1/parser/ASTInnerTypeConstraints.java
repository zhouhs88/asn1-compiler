/* Generated By:JJTree: Do not edit this line. ASTInnerTypeConstraints.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTInnerTypeConstraints extends SimpleNode {
  public ASTInnerTypeConstraints(int id) {
    super(id);
  }

  public ASTInnerTypeConstraints(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6895a08ea86453e70eba4ee9de8171b3 (do not edit this line) */
