/* Generated By:JJTree: Do not edit this line. ASTSymbolList.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTSymbolList extends SimpleNode {
  public ASTSymbolList(int id) {
    super(id);
  }

  public ASTSymbolList(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b8e187f3bc01584eb5e5c8fa69aa1f28 (do not edit this line) */
