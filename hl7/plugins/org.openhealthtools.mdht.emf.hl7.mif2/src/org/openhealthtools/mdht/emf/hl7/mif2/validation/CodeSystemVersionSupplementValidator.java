/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedConceptRelationship;
import org.openhealthtools.mdht.emf.hl7.mif2.SupportedProperty;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemVersionSupplement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CodeSystemVersionSupplementValidator {
	boolean validate();

	boolean validateSupplementalSupportedConceptRelationship(EList<SupportedConceptRelationship> value);

	boolean validateSupplementalSupportedConceptProperty(EList<SupportedProperty> value);

	boolean validateSupplementalSupportedCodeProperty(EList<SupportedProperty> value);

	boolean validateConceptSupplement(EList<ConceptSupplement> value);

	boolean validateAppliesToReleaseDate(XMLGregorianCalendar value);

	boolean validateSortKey(String value);
}
