// This is a generated file. Not intended for manual editing.
package com.phodal.charj.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CharjStructDeclaration extends CharjPsiCompositeElement {

  @Nullable
  CharjFunctionDefineName getFunctionDefineName();

  @NotNull
  List<CharjMemberDeclaration> getMemberDeclarationList();

  @NotNull
  CharjStructNameDeclaration getStructNameDeclaration();

}
