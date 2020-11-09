package org.ehrbase.client.openehrclient.defaultrestclient;

import com.nedap.archie.rm.datavalues.DvCodedText;
import com.nedap.archie.rm.datavalues.DvText;
import com.nedap.archie.rm.datavalues.quantity.DvInterval;
import com.nedap.archie.rm.datavalues.quantity.datetime.DvDateTime;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartySelf;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition.*;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.CategoryDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.SettingDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Territory;
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
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

@Category(Integration.class)
public class PhenoTypeAqlTestIT {

    private  OpenEhrClient openEhrClient;
    private String REST_URI = "http://localhost:8080/ehrbase/rest/openehr/v1/";
    private DvCodedText nullMode = null;
    private DvInterval<DvDateTime> nullTime;

    @Before
    public void setupBeforeTest() throws URISyntaxException {
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
    public void runsPhenotypeAqlQuery(){
        final UUID ehrId =
            openEhrClient
                .ehrEndpoint()
                .createEhr();

        final OpenEHRConfirmedCOVID19InfectionReportV0Composition mergedEntity =
            openEhrClient
                .compositionEndpoint(ehrId)
                .mergeCompositionEntity(buildCovid19InfectionReport());

        String aql = "SELECT e/ehr_id/value FROM EHR e[ehr_id/value = $ehr_id] " +
                    "CONTAINS COMPOSITION c [openEHR-EHR-COMPOSITION.report.v1] " +
                    "CONTAINS OBSERVATION o [openEHR-EHR-OBSERVATION.laboratory_test_result.v1]";

        final NativeQuery<Record1<UUID>> query = Query.buildNativeQuery(aql, UUID.class);

        final List<Record1<UUID>> queryResults =
            openEhrClient
                .aqlEndpoint()
                .execute(query, new ParameterValue("ehr_id", ehrId));

        assertNotNull(queryResults);
    }

    private OpenEHRConfirmedCOVID19InfectionReportV0Composition buildCovid19InfectionReport() {
        OpenEHRConfirmedCOVID19InfectionReportV0Composition c = new OpenEHRConfirmedCOVID19InfectionReportV0Composition();
        c.setStartTimeValue(OffsetDateTime.of(2019, 04, 03, 22, 00, 00, 00, ZoneOffset.UTC));
        c.setEndTimeValue(OffsetDateTime.now());
        c.setLanguage(Language.DE);
        c.setTerritory(Territory.DE);
        c.setCategoryDefiningcode(CategoryDefiningcode.EVENT);
        c.setSettingDefiningcode(SettingDefiningcode.OTHER_CARE);
        c.setComposer(new PartyIdentified(null, "Test party identified", null));
        c.setParticipations(new ArrayList<>());
        c.getParticipations()
            .add(
                new Participation(
                    new PartyIdentified(null, "Test participating party", null),
                    new DvText("Participant func1"),
                    nullMode,
                    nullTime));

        c.setReporting(new ArrayList<>());
        c.getReporting().add(buildReportingSection());
        return c;
    }


    private ReportingSection buildReportingSection() {
        ReportingSection rs = new ReportingSection();
        rs.setFirstTest(new ArrayList<>());
        rs.getFirstTest().add(buildFirstTestObservation());
        return rs;
    }

    private FirstTestObservation buildFirstTestObservation() {
        FirstTestObservation fto = new FirstTestObservation();
        fto.setFirstTest(new ArrayList<>());
        fto
            .getFirstTest()
            .add(buildFirstTest());

        fto.setOriginValue(OffsetDateTime.of(2019, 04, 03, 22, 00, 00, 00, ZoneOffset.UTC));
        fto.setSubject(new PartySelf());
        fto.setLanguage(Language.DE);
        return fto;

    }

    private FirstTestFirstTestChoice buildFirstTest() {
        FirstTestFirstTestPointEvent pointEvent = new FirstTestFirstTestPointEvent();
        pointEvent.setTimeValue(OffsetDateTime.now());
        pointEvent.setLabortestBezeichnungDefiningcode(LabortestBezeichnungDefiningcode.N2019_NCOV_NOVEL_CORONAVIRUS_SEROLOGY);
        return pointEvent;
    }
}
