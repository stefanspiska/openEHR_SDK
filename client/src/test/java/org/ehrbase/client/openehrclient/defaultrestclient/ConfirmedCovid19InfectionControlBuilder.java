package org.ehrbase.client.openehrclient.defaultrestclient;

import com.nedap.archie.rm.datavalues.DvCodedText;
import com.nedap.archie.rm.datavalues.DvText;
import com.nedap.archie.rm.datavalues.quantity.DvInterval;
import com.nedap.archie.rm.datavalues.quantity.datetime.DvDateTime;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartySelf;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.OpenEHRConfirmedCOVID19InfectionReportV0Composition;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition.*;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.CategoryDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.SettingDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Territory;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class ConfirmedCovid19InfectionControlBuilder {
    private static DvCodedText nullMode = null;
    private static DvInterval<DvDateTime> nullTime = null;

    public static OpenEHRConfirmedCOVID19InfectionReportV0Composition buildConfirmedCovid19InfReport(){
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

    private static ReportingSection buildReportingSection() {
        ReportingSection rs = new ReportingSection();
        rs.setFirstTest(new ArrayList<>());
        rs.getFirstTest().add(buildFirstTestObservation());
        return rs;
    }

    private static FirstTestObservation buildFirstTestObservation() {
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

    private static FirstTestFirstTestChoice buildFirstTest() {
        FirstTestFirstTestPointEvent pointEvent = new FirstTestFirstTestPointEvent();
        pointEvent.setTimeValue(OffsetDateTime.now());
        pointEvent.setLabortestBezeichnungDefiningcode(LabortestBezeichnungDefiningcode.N2019_NCOV_NOVEL_CORONAVIRUS_SEROLOGY);
        return pointEvent;
    }
}
