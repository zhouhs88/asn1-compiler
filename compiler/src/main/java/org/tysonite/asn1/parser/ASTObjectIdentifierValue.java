/* Generated By:JJTree: Do not edit this line. ASTObjectIdentifierValue.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.tysonite.asn1.parser;

public
class ASTObjectIdentifierValue extends SimpleNode {
  public ASTObjectIdentifierValue(int id) {
    super(id);
  }

  public ASTObjectIdentifierValue(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2d653c5289f1aacae9eeace6244c4401 (do not edit this line) */