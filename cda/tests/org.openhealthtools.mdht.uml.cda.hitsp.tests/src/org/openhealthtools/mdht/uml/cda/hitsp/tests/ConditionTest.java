/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Condition</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionConditionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Condition Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#createConditionEntry() <em>Create Condition Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#getConditionEntries() <em>Get Condition Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConditionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConditionHasTreatingProvider() {
		OperationsTestCase<Condition> validateConditionHasTreatingProviderTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasTreatingProvider",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionOperations.validateConditionHasTreatingProvider(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasTreatingProviderTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConditionHasProviderId() {
		OperationsTestCase<Condition> validateConditionHasProviderIdTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasProviderId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ae.getIds().add(ii);
				p2.setAssignedEntity(ae);
				target.getPerformers().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionOperations.validateConditionHasProviderId((Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasProviderIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConditionHasProviderTreatmentTime() {
		OperationsTestCase<Condition> validateConditionHasProviderTreatmentTimeTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasProviderTreatmentTime",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

				Performer2 p2 = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionOperations.validateConditionHasProviderTreatmentTime(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasProviderTreatmentTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConditionTemplateId() {
		OperationsTestCase<Condition> validateConditionTemplateIdTestCase = new OperationsTestCase<Condition>(
			"validateConditionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionOperations.validateConditionTemplateId((Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConditionEntry() {
		OperationsTestCase<Condition> validateConditionConditionEntryTestCase = new OperationsTestCase<Condition>(
			"validateConditionConditionEntry",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

				// ConditionEntry obv = HITSPFactory.eINSTANCE.createConditionEntry().init();

				ProblemEntry obv = IHEFactory.eINSTANCE.createProblemEntry().init();

				target.addObservation(obv);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
					er.setInversionInd(false);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionOperations.validateConditionEntry((Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionConditionEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConditionEntries() {

		Condition target = objectFactory.create();
		target.getConditionEntries();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ConditionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<Condition> {

		public Condition create() {
			return HITSPFactory.eINSTANCE.createCondition();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends ConditionOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ConditionOperations
