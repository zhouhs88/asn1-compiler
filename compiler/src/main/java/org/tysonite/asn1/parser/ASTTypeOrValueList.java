/* Generated By:JJTree: Do not edit this line. ASTTypeOrValueList.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTTypeOrValueList extends SimpleNode {
  public ASTTypeOrValueList(int id) {
    super(id);
  }

  public ASTTypeOrValueList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8d29d6bfd4958276a1af9f1886cece37 (do not edit this line) */