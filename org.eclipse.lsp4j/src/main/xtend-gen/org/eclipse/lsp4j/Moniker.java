/**
 * Copyright (c) 2016-2018 TypeFox and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import org.eclipse.lsp4j.MonikerKind;
import org.eclipse.lsp4j.UniquenessLevel;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Moniker definition to match LSIF 0.5 moniker definition.
 * 
 * Since 3.16.0
 */
@Beta
@SuppressWarnings("all")
public class Moniker {
  /**
   * The scheme of the moniker. For example tsc or .Net
   */
  @NonNull
  private String scheme;
  
  /**
   * The identifier of the moniker. The value is opaque in LSIF however
   * schema owners are allowed to define the structure if they want.
   */
  @NonNull
  private String identifier;
  
  /**
   * The scope in which the moniker is unique
   */
  @NonNull
  private UniquenessLevel unique;
  
  /**
   * The moniker kind if known.
   */
  @NonNull
  private MonikerKind kind;
  
  /**
   * The scheme of the moniker. For example tsc or .Net
   */
  @Pure
  @NonNull
  public String getScheme() {
    return this.scheme;
  }
  
  /**
   * The scheme of the moniker. For example tsc or .Net
   */
  public void setScheme(@NonNull final String scheme) {
    this.scheme = Preconditions.checkNotNull(scheme, "scheme");
  }
  
  /**
   * The identifier of the moniker. The value is opaque in LSIF however
   * schema owners are allowed to define the structure if they want.
   */
  @Pure
  @NonNull
  public String getIdentifier() {
    return this.identifier;
  }
  
  /**
   * The identifier of the moniker. The value is opaque in LSIF however
   * schema owners are allowed to define the structure if they want.
   */
  public void setIdentifier(@NonNull final String identifier) {
    this.identifier = Preconditions.checkNotNull(identifier, "identifier");
  }
  
  /**
   * The scope in which the moniker is unique
   */
  @Pure
  @NonNull
  public UniquenessLevel getUnique() {
    return this.unique;
  }
  
  /**
   * The scope in which the moniker is unique
   */
  public void setUnique(@NonNull final UniquenessLevel unique) {
    this.unique = Preconditions.checkNotNull(unique, "unique");
  }
  
  /**
   * The moniker kind if known.
   */
  @Pure
  @NonNull
  public MonikerKind getKind() {
    return this.kind;
  }
  
  /**
   * The moniker kind if known.
   */
  public void setKind(@NonNull final MonikerKind kind) {
    this.kind = Preconditions.checkNotNull(kind, "kind");
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("scheme", this.scheme);
    b.add("identifier", this.identifier);
    b.add("unique", this.unique);
    b.add("kind", this.kind);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Moniker other = (Moniker) obj;
    if (this.scheme == null) {
      if (other.scheme != null)
        return false;
    } else if (!this.scheme.equals(other.scheme))
      return false;
    if (this.identifier == null) {
      if (other.identifier != null)
        return false;
    } else if (!this.identifier.equals(other.identifier))
      return false;
    if (this.unique == null) {
      if (other.unique != null)
        return false;
    } else if (!this.unique.equals(other.unique))
      return false;
    if (this.kind == null) {
      if (other.kind != null)
        return false;
    } else if (!this.kind.equals(other.kind))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.scheme== null) ? 0 : this.scheme.hashCode());
    result = prime * result + ((this.identifier== null) ? 0 : this.identifier.hashCode());
    result = prime * result + ((this.unique== null) ? 0 : this.unique.hashCode());
    return prime * result + ((this.kind== null) ? 0 : this.kind.hashCode());
  }
}
