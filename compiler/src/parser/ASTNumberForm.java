/* Generated By:JJTree: Do not edit this line. ASTNumberForm.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTNumberForm extends SimpleNode {
  public ASTNumberForm(int id) {
    super(id);
  }

  public ASTNumberForm(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d5a804366d52c132c2cb87f42c4c54d6 (do not edit this line) */
