/* Generated By:JJTree: Do not edit this line. ASTDefinedMacroName.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTDefinedMacroName extends SimpleNode {
  public ASTDefinedMacroName(int id) {
    super(id);
  }

  public ASTDefinedMacroName(AsnParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AsnParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6d8a973337dc80aa65efd885f53d2aea (do not edit this line) */
