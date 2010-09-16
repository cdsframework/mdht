/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.builder.examples;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

import org.openhealthtools.mdht.builder.ccd.DocumentBuilder.AdvanceDirectivesSectionBuilder;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.C32DocumentBuilder;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * C32Example is an example implementation of the MDHT
 * DocumentBuilder based on the GOF BuilderPattern. see
 * http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example uses C32DocumentBuilder which creates the minimum structures to create valid (no errors) C32 V2.5
 * 
 */
public class C32AdvanceDirectiveExample {


	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		DocumentBuilder exampleHITSPC32 = new C32DocumentBuilder() {

			@Override
			public AdvanceDirectivesSectionBuilder getAdvanceDirectivesSectionBuilder() {
				return new AdvanceDirectivesSectionBuilder ()
				{



					
					
					
					@Override
					public ArrayBuilder<Observation> getObservationBuilder() {
						return new ArrayBuilder<Observation>()
						{

							@Override
							public ArrayList<Observation> construct() {
								ArrayList<Observation> observations = new ArrayList<Observation> ();

								AdvanceDirectiveObservation observation = CCDFactory.eINSTANCE.createAdvanceDirectiveObservation().init();
								
								/*
								 * TODO Add this template to HITSP
								 */
								
								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.12"));
								
								observation.setText(DatatypesFactory.eINSTANCE.createED("Required Text"));
					
								observation.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

								observation.setCode(BuilderUtil.buildSNOMEDCT("304251008", "Resuscitation"));
								
								observation.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Required Text"));
								
								IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

								IVXB_TS l = DatatypesFactory.eINSTANCE.createIVXB_TS();
								l.setNullFlavor(NullFlavor.UNK);

								IVXB_TS h = DatatypesFactory.eINSTANCE.createIVXB_TS();
								h.setNullFlavor(NullFlavor.UNK);
								
								ts.setLow(l);
								
								ts.setHigh(h);

								observation.setEffectiveTime(ts);
								
								Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();								

								participant.setTypeCode(ParticipationType.CST);
								
								ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
								
								role.setClassCode(RoleClassRoot.AGNT);
								
								PlayingEntity entity = CDAFactory.eINSTANCE.createPlayingEntity();
								
								PN pn = DatatypesFactory.eINSTANCE.createPN();
								
								
								entity.getNames().add(pn);
								
								role.setPlayingEntity(entity );
								
								participant.setParticipantRole(role );
								
								observation.getParticipants().add(participant);
								
								AdvanceDirectiveStatusObservation statusObservation = CCDFactory.eINSTANCE.createAdvanceDirectiveStatusObservation().init();

								statusObservation.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));
								
								statusObservation.getValues().add(DatatypesFactory.eINSTANCE.createCE());
								
								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
								
								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
								
								entryRelationship.setObservation(statusObservation);
								
								observation.getEntryRelationships().add(entryRelationship);
								
								observations.add(observation);

								return observations;
							}
							
						};
					}
					
					
				};
				
			}



		};

		try {
			
			System.out.println(java.util.UUID.randomUUID().toString());
			

			System.out.println("Start");
			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();
			CDAUtil.save(clinicalDocument, new FileOutputStream("/home/eclipse/heliosworkspaceG/org.openhealthtools.mdht.cda.builder/resource/ExampleC32ADS.xml"));
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
