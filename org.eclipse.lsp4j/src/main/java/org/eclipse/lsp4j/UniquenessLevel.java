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
 * Moniker uniqueness level to define scope of the moniker.
 */
public enum UniquenessLevel {
	
	/**
	 * The moniker is only unique inside a document
	 */
	document("document"),

	/**
	 * The moniker is unique inside a project for which a dump got created
	 */
	project("project"),

	/**
	 * The moniker is unique inside the group to which a project belongs
	 */
	group("group"),

	/**
	 * The moniker is unique inside the moniker scheme.
	 */
	scheme("scheme"),

	/**
	 * The moniker is globally unique
	 */
	global("global");
	
	private final String value;
	
	UniquenessLevel(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static UniquenessLevel forValue(String value) {
		for (UniquenessLevel current : values()) {
			if(current.getValue().equals(value)) {
				return current;
			}				
		}
		return null;
	}

}
