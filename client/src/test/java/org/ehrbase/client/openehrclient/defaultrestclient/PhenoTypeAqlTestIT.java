package org.ehrbase.client.openehrclient.defaultrestclient;

import org.ehrbase.client.Integration;
import org.ehrbase.client.aql.parameter.ParameterValue;
import org.ehrbase.client.aql.query.NativeQuery;
import org.ehrbase.client.aql.query.Query;
import org.ehrbase.client.aql.record.Record1;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.ehrbase.client.openehrclient.OpenEhrClientConfig;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.OpenEHRConfirmedCOVID19InfectionReportV0Composition;
import org.ehrbase.client.templateprovider.PhenotypeDataTemplateProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

import static org.ehrbase.client.openehrclient.defaultrestclient.ConfirmedCovid19InfectionControlBuilder.buildConfirmedCovid19InfReport;
import static org.junit.Assert.assertNotNull;

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
    public void runsConfirmedCovid19InfectionReportQuery(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildConfirmedCovid19InfReport());

        //this will work, i.e. server side fails if we don't add a second column in the SELECT clause
//        String aql = "SELECT e/ehr_id/value, c/archetype_node_id " +
        String aql = "SELECT e/ehr_id/value " +
                    "FROM EHR e[ehr_id/value = $ehr_id] " +
                    "CONTAINS COMPOSITION c[openEHR-EHR-COMPOSITION.report.v1] " +
                    "CONTAINS OBSERVATION o [openEHR-EHR-OBSERVATION.laboratory_test_result.v1]";

        final NativeQuery<Record1<UUID>> query =
            Query
                .buildNativeQuery(aql, UUID.class);

        final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }
}
