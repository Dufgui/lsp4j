/******************************************************************************
 * Copyright (c) 2016 Guillaume Dufour and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 ******************************************************************************/
package org.eclipse.lsp4j;

/**
 * The moniker kind.
 */
public enum MonikerKind {
	/**
	 * The moniker represent a symbol that is imported into a project
	 */
	importKind("import"),

	/**
	 * The moniker represents a symbol that is exported from a project
	 */
	exportKind("export"),

	/**
	 * The moniker represents a symbol that is local to a project (e.g. a local
	 * variable of a function, a class not visible outside the project, ...)
	 */
	localKind("local");
	
	private final String value;
	
	MonikerKind(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static MonikerKind forValue(String value) {
		for (MonikerKind current : values()) {
			if(current.getValue().equals(value)) {
				return current;
			}				
		}
		return null;
	}

}
