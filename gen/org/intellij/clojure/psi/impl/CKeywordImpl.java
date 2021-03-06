// This is a generated file. Not intended for manual editing.
package org.intellij.clojure.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.clojure.psi.ClojureTypes.*;
import org.intellij.clojure.psi.*;
import org.intellij.clojure.psi.stubs.CKeywordStub;
import org.intellij.clojure.psi.stubs.CKeywordElementType;

public class CKeywordImpl extends CKeywordBase implements CKeyword {

  public CKeywordImpl(CKeywordStub stub, CKeywordElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public CKeywordImpl(CKeywordStub stub) {
    super(stub);
  }

  public CKeywordImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ClojureVisitor visitor) {
    visitor.visitKeyword(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ClojureVisitor) accept((ClojureVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CSymbol getSymbol() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, CSymbol.class));
  }

  @NotNull
  public String getName() {
    return ClojurePsiImplUtil.getName(this);
  }

  @NotNull
  public String getNamespace() {
    return ClojurePsiImplUtil.getNamespace(this);
  }

  public int getTextOffset() {
    return ClojurePsiImplUtil.getTextOffset(this);
  }

}
