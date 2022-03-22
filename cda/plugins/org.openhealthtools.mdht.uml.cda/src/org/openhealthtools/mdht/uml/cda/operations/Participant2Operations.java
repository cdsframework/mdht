/** *****************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ****************************************************************************** */
package org.openhealthtools.mdht.uml.cda.operations;

import org.openhealthtools.mdht.uml.cda.util.LazyInitializer;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to
 * '<em><b>Participant2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.Participant2#validateContextControlCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Participant2Operations extends ParticipationOperations {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    protected Participant2Operations() {
		super();
	}

    /**
	 * The cached OCL expression body for the '{@link #validateContextControlCode(Participant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateContextControlCode(Participant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static final String VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isContextControlCodeDefined() implies self.contextControlCode=vocab::ContextControl::OP";

	/**
	 * The cached OCL invariant for the '{@link #validateContextControlCode(Participant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Context Control Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 * @see #validateContextControlCode(Participant2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 */
	protected static final LazyInitializer<Constraint> VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV =
			new LazyInitializer<Constraint>()
			{
				@Override
				protected Constraint initialize()
				{
					OCL.Helper helper = EOCL_ENV.createOCLHelper();
					helper.setContext(CDAPackage.Literals.PARTICIPANT2);
					try
					{
						return helper.createInvariant(VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
					}
					catch (ParserException pe)
					{
						throw new UnsupportedOperationException(pe.getLocalizedMessage());
					}
				}
			};
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param participant2 The receiving '<em><b>Participant2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
    public static boolean validateContextControlCode(Participant2 participant2, DiagnosticChain diagnostics,
            Map<Object, Object> context)
	{
		if (!EOCL_ENV.createQuery(VALIDATE_CONTEXT_CONTROL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(participant2))
		{
			if (diagnostics != null)
			{
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, CDAValidator.DIAGNOSTIC_SOURCE,
						CDAValidator.PARTICIPANT2__CONTEXT_CONTROL_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
								new Object[] { "validateContextControlCode",
										org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(participant2, context) }),
						new Object[] { participant2 }));
			}
			return false;
		}
		return true;
	}

} // Participant2Operations
