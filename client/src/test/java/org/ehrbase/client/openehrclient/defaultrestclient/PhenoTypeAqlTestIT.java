package org.ehrbase.client.openehrclient.defaultrestclient;

import static org.ehrbase.client.openehrclient.defaultrestclient.ConfirmedCovid19InfectionControlBuilder.buildConfirmedCovid19InfReport;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import org.ehrbase.client.Integration;
import org.ehrbase.client.aql.parameter.ParameterValue;
import org.ehrbase.client.aql.query.NativeQuery;
import org.ehrbase.client.aql.query.Query;
import org.ehrbase.client.aql.record.Record1;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.OpenEHRConfirmedCOVID19InfectionReportV0Composition;
import org.ehrbase.client.templateprovider.PhenotypeDataTemplateProvider;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Integration.class)
public class PhenoTypeAqlTestIT {
    private  OpenEhrClient openEhrClient;
    private String REST_URI = "http://localhost:8080/ehrbase/rest/openehr/v1/";

    @Before
    public void setupBeforeTest() throws URISyntaxException {
        //Ensure opt for the template is known to EhrBase
        PhenotypeDataTemplateProvider tprovider = new PhenotypeDataTemplateProvider();
        DefaultRestClient client =
            new DefaultRestClient(
                new OpenEhrClientConfig(new URI(REST_URI)),
                tprovider,
                false,// true means use proxy listening at localhost:8888
                "localhost",
                8888);
        tprovider
            .listTemplateIds()
            .stream()
            .forEach(tid -> client.templateEndpoint().ensureExistence(tid));

        openEhrClient = client;
    }

    @Test
    public void runsAqlQueryWithWhitespaceInQueryText(){
        final UUID ehrId = callCreateEhrEndpoint();

        callCreateCompositionEndpoint(ehrId);

        String aql = "SELECT e/ehr_id/value, c/archetype_node_id " +
            "FROM EHR \te[ehr_id/value = $ehr_id] \n" +
            "CONTAINS\n\n COMPOSITION c[openEHR-EHR-COMPOSITION.report.v1] \r" +
            "CONTAINS OBSERVATION o [        \r\nopenEHR-EHR-OBSERVATION.laboratory_test_result.v1]";

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
        assertEquals(1, queryResults.size());
        assertTrue(queryResults.get(0).value1() instanceof UUID);
    }

    @Test
    public void runsConfirmedCovid19InfectionReportQuery(){
        final UUID ehrId = callCreateEhrEndpoint();

        callCreateCompositionEndpoint(ehrId);

        //this will work, i.e. server side fails if we don't add a second column in the SELECT clause
        String aql = "SELECT e/ehr_id/value, c/archetype_node_id " +
      //  String aql = "SELECT e/ehr_id/value " +
                    "FROM EHR e[ehr_id/value = $ehr_id] " +
                    "CONTAINS COMPOSITION c[openEHR-EHR-COMPOSITION.report.v1] " +
                    "CONTAINS OBSERVATION o [openEHR-EHR-OBSERVATION.laboratory_test_result.v1]";

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsHydroxychloroquineAloneTreatmentQueryLaneEtAl(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        //this will work, i.e. server side fails if we don't add a second column in the SELECT clause
        String aql = "select\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains INSTRUCTION a_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"where a_a/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02'";

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    
    /**
     * 
     */
    @Test
    @Ignore("test fails doe to the lack of support for versioned objects in AQL.")
    public void runsAdultsInHipersensitiveDrugTreatmentQueryUsingVerionedObjectsMoralesElAl(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        //this will work, i.e. server side fails if we don't add a second column in the SELECT clause
        String aql = "select distinct e/ehr_id/value\n" + 
        		"from EHR e contains\n" + 
        		"VERSIONED_OBJECT vo contains\n" + 
        		"VERSION a[all_versions]\n" + 
        		"contains COMPOSITION c\n" + 
        		"contains (\n" + 
        		"CLUSTER a_a[openEHR-EHR-CLUSTER.person_birth_data_iso.v0] and\n" + 
        		"INSTRUCTION a_b[openEHR-EHR-INSTRUCTION.medication_order.v1])\n" + 
        		"where\n" + 
        		"a_a/items[at0001]/value<2002 and\n" + 
        		"a_b/activities[at0001]/description[at0002]/items[at0070]/value/value matches {TERMINOLOGY('expand','http://hl7.org/fhir/4.0', 'url=http://snomed.info/sct?fhir_vs=isa/50697003')} and\n" + 
        		"a/commit_audit/time_committed/value>'2018-11-01' and\n" + 
        		"a/commit_audit/time_committed/value>'2020-01-31'";

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsConfirmedCovid19ForCurrentDate(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id/value, a/archetype_node_id\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains OBSERVATION a_a[openEHR-EHR-OBSERVATION.management_screening.v0]" + 
        		"where a_a/data[at0001]/events[at0002]/data[at0003]/items[at0022]/items[at0004]/value=$icu_code\n" + 
        		"and a/context/start_time/value = $curent_date";


        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$curent_date", "2020-11-08T17:49:15+00:00"), new ParameterValue<>("$icu_code", "sample_icu_code"));

        assertNotNull(queryResults);
    }
    
    /*********************************************Lane et al.*************************************************************/
    
    @Test
    public void runsTreatmentWithHydroxicloroquineLaneEtAl(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains INSTRUCTION a_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"where a_a/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02'";


        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    
    @Test
    public void runsTreatmentWithHydroxicloroquineAndAzithromyzinLaneEtAl(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains INSTRUCTION a_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"where\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02' and\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value='J01FA10'";


        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("MIN not supported")
    public void runsDefinitionOfIndexEventLaneEtAl(){
    	//In the HCQ versus SSZ study, the index event was defined as the first recorded dispensing or prescription of the drug in a patient’s history.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select\n" + 
        		"    MIN(a_b/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value)\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains (\n" + 
        		"    EVALUATION a_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1] and\n" + 
        		"    INSTRUCTION a_b[openEHR-EHR-INSTRUCTION.medication_order.v1])\n" + 
        		"where\n" + 
        		"    a_a/data[at0001]/items[at0002]/value/value='RA01. 0' and\n" + 
        		"    a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02' and\n" + 
        		"    a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='A07EC01'";


        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("MIN not supported")
    public void runsDefinitionOfIndexEvent2LaneEtAlIncludingRAdiagnosis(){
    	//In the HCQ versus SSZ study, the index event was defined as the first recorded dispensing or prescription of the drug in a patient’s history.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

		/*
		 * String aql = "select\n" +
		 * "    MIN(a_b/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value)\n"
		 * + "from EHR e\n" + "contains COMPOSITION a\n" + "contains (\n" +
		 * "    EVALUATION a_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1] and\n" +
		 * "    INSTRUCTION a_b[openEHR-EHR-INSTRUCTION.medication_order.v1])\n" +
		 * "where\n" + "    a_a/data[at0001]/items[at0002]/value/value='RA01. 0' and\n"
		 * +
		 * "    a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02' and\n"
		 * +
		 * "    a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='A07EC01'"
		 * ;
		 */
        
        String aql ="select\n" + 
        		"MIN(a_b/activities[at0001]/description[at0002]/items[at0129]/items[at0155]/value/value)\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains (\n" + 
        		"EVALUATION a_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1] and\n" + 
        		"INSTRUCTION a_b[openEHR-EHR-INSTRUCTION.medication_order.v1])\n" + 
        		"where\n" + 
        		"a_a/data[at0001]/items[at0002]/value/value='M06.9' and\n" + 
        		"a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02' and\n" + 
        		"a_b/activities[at0001]/description[at0002]/items[at0070]/value/value='A07EC01' and\n" + 
        		"a_a/data[at0001]/items[at0003]/value/value<=a_b/activities[at0001]/description[at0002]/items[at0129]/items[at0155]/value/value\n" + 
        		"\n" + 
        		"";


        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("substraction of periods not supported")
    public void runsQueryContinousObservationofAtLeast1YearBeforeIndexEvent(){
    	//In the HCQ versus SSZ study, the index event was defined as the first recorded dispensing or prescription of the drug in a patient’s history.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id/value, a/uid/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"where e/time_created/value <= ($index_date_2 - P1Y)";//the index event is relative to each patient, thus this subtraction is needed.

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date_2", DateTime.now().toString()));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsQueryHasReumatoidArthritisAnyTimeBeforeIndexEvent(){
    	//In the HCQ versus SSZ study, the index event was defined as the first recorded dispensing or prescription of the drug in a patient’s history.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id, a/uid/value \n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains EVALUATION a_b[openEHR-EHR-EVALUATION.problem_diagnosis.v1]\n" + 
        		"where\n" + 
        		" a_b/data[at0001]/items[at0002]/value/value='M06.9' and \n" + 
        		"a_b/data[at0001]/items[at0003]/value/value <= '$index_date' and \n" + 
        		" e/ehr_id = '$ehr_id'";//the index event is relative to each patient, thus this subtraction is needed.

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date","2020-11-08T17:49:15+00:00"), new ParameterValue("$ehr_id", "2247ea3e-4a93-4fc9-ade0-3b4ee0c12970"));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("substraction of periods not supported")
    public void runsQueryContinousObservationFor1YearBeforeIndexEvent(){
    	//--continuous observation of at least 365 days prior and 0 days after event index date.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select ehr_status/uid/value \n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"where time_created/value <= ($IndexDate - P1Y)"
        		+ 
        		" e/ehr_id = '$ehr_id'";
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date","2020-11-08T17:49:15+00:00"), new ParameterValue("$ehr_id", "2247ea3e-4a93-4fc9-ade0-3b4ee0c12970"));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("substraction of periods not supported")
    public void runsQueryAllow90daysBetweenDrugExposures(){
    	//--continuous observation of at least 365 days prior and 0 days after event index date.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select\n" + 
        		"    a1/uid/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a1[openEHR-EHR-COMPOSITION.medication_list.v0] contains INSTRUCTION a1_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"contains COMPOSITION a2[openEHR-EHR-COMPOSITION.medication_list.v0] contains INSTRUCTION a2_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"contains COMPOSITION a3[openEHR-EHR-COMPOSITION.medication_list.v0] contains INSTRUCTION a3_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"where a1_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value <= a2_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value\n" + 
        		"and not a3_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value <= a2_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value\n" + 
        		"and not a3_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value >= a1_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value\n" + 
        		"and not (a2_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value - a1_a/activities[at0001]/description[at0002]/items[at0113]/items[at0012]/value/value) > P90D\n" + 
        		"";
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date","2020-11-08T17:49:15+00:00"), new ParameterValue("$ehr_id", "2247ea3e-4a93-4fc9-ade0-3b4ee0c12970"));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("substraction of periods not supported")
    public void runsQueryAtLeastOneExposureHydroxychIn30DaysBeforeIndexEvent(){
    	//--at least 1 occurrence of a drug exposure of [OHDSI Covid19] Azithromycin3 where event starts between 30 days Before and 0 days After index start date.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains INSTRUCTION a_a[openEHR-EHR-INSTRUCTION.medication_order.v1]\n" + 
        		"where\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0070]/value/value='P01BA02' and\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0129]/items[at0155]/value>=($index_date - P30D) and\n" + 
        		"    a_a/activities[at0001]/description[at0002]/items[at0129]/items[at0161]/value<=$index_date";
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date","2020-11-08T17:49:15+00:00"), new ParameterValue("$ehr_id", "2247ea3e-4a93-4fc9-ade0-3b4ee0c12970"));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsQueryDiagnosisLabCovidLeeEtAl(){
    	//--patient older than 65 years old. Lab confirmed COVID diagnosis between 1/1/2020 and 10/4/2020.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains (\n" + 
        		"    OBSERVATION a_a[openEHR-EHR-OBSERVATION.lab_test-result.v1] and\n" + 
        		"    CLUSTER a_b[openEHR-EHR-CLUSTER.person_birth_data_iso.v0])\n" + 
        		"where\n" + 
        		"    a/name/value='95941-1' and\n" + 
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0073]/value/defining_code/code_string='LA6576-8' and\n" + 
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0095]/items[at0096]/items[at0111]/value>='2020-01-01' and\n" + 
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0095]/items[at0096]/items[at0111]/value<='2020-04-01'";
        //" and ($today - a_b/items[at0001]/value/value) >= P65Y"; this line is needed to specify the age but the functionality is not supported.
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query);//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("Substraction of periods not allowed.")
    public void runsQueryDiagnosisLabCovidWithAgeLeeEtAl(){
    	//--patient older than 65 years old. Lab confirmed COVID diagnosis between 1/1/2020 and 10/4/2020.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select min(b_a/data[at0001]/items[at0077]/value/value)\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a[openEHR-EHR-COMPOSITION.problem_list.v1]\n" + 
        		"contains EVALUATION b_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1]\n" + 
        		"where\n" + 
        		"    a/name/value='Problem list' and\n" + 
        		"    b_a/data[at0001]/items[at0002]/value/value='U07.1'\n" + 
        		"and e/ehr_id/value='2247ea3e-4a93-4fc9-ade0-3b4ee0c12970'";
        
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$today",DateTime.now().toString()));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    @Ignore("min is not supported")
    public void runsQueryIndexEventForSpecifiedEhrLeeEtAl(){
    	//Select first  Lab confirmed COVID diagnosis for a specified ehr_id.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select min(b_a/data[at0001]/items[at0077]/value/value)\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a[openEHR-EHR-COMPOSITION.problem_list.v1]\n" + 
        		"contains EVALUATION b_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1]\n" + 
        		"where\n" + 
        		"    a/name/value='Problem list' and\n" + 
        		"    b_a/data[at0001]/items[at0002]/value/value='U07.1'\n" + 
        		"and e/ehr_id/value='2247ea3e-4a93-4fc9-ade0-3b4ee0c12970'";
        
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query);//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }

    @Test
    public void runsQueryConfirmedCovidLabAnalysis(){
    	//Select first  Lab confirmed COVID diagnosis for a specified ehr_id.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains OBSERVATION a_a[openEHR-EHR-OBSERVATION.lab_test-result.v1]\n" + 
        		"where\n" + 
        		"    a/name/value='95941-1' and\n" + //covid lab test in LOINC
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0073]/value/defining_code/code_string='LA6576-8' and\n" + //covid positive lab result in LOINC
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0095]/items[at0096]/items[at0111]/value>='2020-01-01' and\n" + 
        		"    a_a/data[at0001]/events[at0002]/data[at0003]/items[at0095]/items[at0096]/items[at0111]/value<='2020-04-01'";
        
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query);//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsQueryPatients1YearBeforeIndexDate(){
    	//continuously observed in the database at least 1 year prior to their index date.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select e/ehr_id, a/uid/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"where e/time_created<'2019-01-01'";
        
        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        System.out.println("the query is: "+aql);
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query);//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        assertNotNull(queryResults);
    }
    
    @Test
    public void runsQueryPatientsWithMentalDisorderDiagnosisIn6MonthsPriorIndexDate(){
    	//--Patients were classified into two groups: a mental disorder and a nonmental disorder group, depending on whether they received a psychiatric illness diagnosis within 6 months before the index date.
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        String aql = "select a_a/data[at0001]/items[at0002]/value/value\n" + 
        		"from EHR e\n" + 
        		"contains COMPOSITION a\n" + 
        		"contains EVALUATION a_a[openEHR-EHR-EVALUATION.problem_diagnosis.v1]\n" + 
        		"where a_a/data[at0001]/items[at0002]/value/value='F99' and "+
        		"content[openEHR-EHR-SECTION.problems_issues_rcp.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]/data[at0001]/items[at0077]/value/value <= $index_date and \n" + 
        		"content[openEHR-EHR-SECTION.problems_issues_rcp.v1]/items[openEHR-EHR-EVALUATION.problem_diagnosis.v1]/data[at0001]/items[at0077]/value/value >= $index_date_sub_6month\n";
       
        
        final NativeQuery<Record1<UUID>> query =
                Query
                    .buildNativeQuery(aql, UUID.class);
        
        @SuppressWarnings("rawtypes")
		final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("$index_date",DateTime.parse("2020-06-01")), new ParameterValue("$index_date_sub_6month",DateTime.parse("2020-01-01"))));//a prior query should determine the index_date_2 but we will use current time for testing purposes.

        System.out.println("the query is: "+aql);
        assertNotNull(queryResults);
    }
    
    private void callCreateCompositionEndpoint(UUID ehrId) {
        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());
    }

    private UUID callCreateEhrEndpoint() {
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();
        return ehrId;
    }
    
    /**
     * References
[1]       Mo H, Thompson WK, Rasmussen LV, Pacheco JA, Jiang G, Kiefer R, et al. Desiderata for computable representations of electronic health records-driven phenotype algorithms. J Am Med Inform Assoc 2015;22:1220–30. https://doi.org/10.1093/jamia/ocv112.

[2]       Newton KM, Peissig PL, Kho AN, Bielinski SJ, Berg RL, Choudhary V, et al. Validation of electronic medical record-based phenotyping algorithms: results and lessons learned from the eMERGE network. J Am Med Inform Assoc JAMIA 2013;20:e147–54. https://doi.org/10.1136/amiajnl-2012-000896.

[3]       Rasmussen LV, Kiefer RC, Mo H, Speltz P, Thompson WK, Jiang G, et al. A Modular Architecture for Electronic Health Record-Driven Phenotyping. AMIA Jt Summits Transl Sci Proc AMIA Jt Summits Transl Sci 2015;2015:147–51.

[4]       Albers DJ, Elhadad N, Claassen J, Perotte R, Goldstein A, Hripcsak G. Estimating summary statistics for electronic health record laboratory data for use in high-throughput phenotyping algorithms. J Biomed Inform 2018;78:87–101. https://doi.org/10.1016/j.jbi.2018.01.004.

[5]       Denaxas S, Gonzalez-Izquierdo A, Direk K, Fitzpatrick NK, Fatemifar G, Banerjee A, et al. UK phenomics platform for developing and validating electronic health record phenotypes: CALIBER. J Am Med Inform Assoc JAMIA 2019;26:1545–59. https://doi.org/10.1093/jamia/ocz105.
     */
}
