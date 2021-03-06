/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of Junit 4 test cases for HL7 Datatypes.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		ADOperationsTest.class, BNOperationsTest.class, EDOperationsTest.class, EIVL_eventOperationsTest.class,
		ENOperationsTest.class, ONOperationsTest.class, PNOperationsTest.class, TNOperationsTest.class,
		STOperationsTest.class })
public class ALLDatatypeOperationsTests {

	/**
	 * @return JUnit3 test
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(ALLDatatypeOperationsTests.class);
	}
} // ALLDatatypeOperationsTests
