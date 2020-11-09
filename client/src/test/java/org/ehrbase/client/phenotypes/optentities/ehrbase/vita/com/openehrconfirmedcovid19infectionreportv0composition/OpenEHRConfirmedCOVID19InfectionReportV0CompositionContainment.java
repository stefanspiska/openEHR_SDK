package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import ehrbase.vita.com.shareddefinition.CategoryDefiningcode;
import ehrbase.vita.com.shareddefinition.Language;
import ehrbase.vita.com.shareddefinition.SettingDefiningcode;
import ehrbase.vita.com.shareddefinition.Territory;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition.*;

public class OpenEHRConfirmedCOVID19InfectionReportV0CompositionContainment extends Containment {
  public SelectAqlField<OpenEHRConfirmedCOVID19InfectionReportV0Composition> OPEN_E_H_R_CONFIRMED_C_O_V_ID19_INFECTION_REPORT_V0_COMPOSITION = new AqlFieldImp<OpenEHRConfirmedCOVID19InfectionReportV0Composition>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "", "OpenEHRConfirmedCOVID19InfectionReportV0Composition", OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, this);

  public ListSelectAqlField<PatientInformationCluster> PATIENT_INFORMATION = new ListAqlFieldImp<PatientInformationCluster>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.person_anonymised_parent.v0 and name/value='Patient information']", "patientInformation", PatientInformationCluster.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<String> STATUS_VALUE = new AqlFieldImp<String>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/other_context[at0001]/items[at0005]/value|value", "statusValue", String.class, this);

  public ListSelectAqlField<ReportingSection> REPORTING = new ListAqlFieldImp<ReportingSection>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Reporting']", "reporting", ReportingSection.class, this);

  public SelectAqlField<String> COUNTRY_CASE_ID_VALUE = new AqlFieldImp<String>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/other_context[at0001]/items[at0002]/value|value", "countryCaseIdValue", String.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/territory", "territory", Territory.class, this);

  public ListSelectAqlField<WhereCaseDiagnosedCluster> WHERE_CASE_DIAGNOSED = new ListAqlFieldImp<WhereCaseDiagnosedCluster>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.address_cc.v0 and name/value='Where case diagnosed']", "whereCaseDiagnosed", WhereCaseDiagnosedCluster.class, this);

  public ListSelectAqlField<ExposureSection> EXPOSURE = new ListAqlFieldImp<ExposureSection>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Exposure']", "exposure", ExposureSection.class, this);

  public ListSelectAqlField<OutcomeSection> OUTCOME = new ListAqlFieldImp<OutcomeSection>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Outcome']", "outcome", OutcomeSection.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<ClinicalStatusSection> CLINICAL_STATUS = new ListAqlFieldImp<ClinicalStatusSection>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Clinical status']", "clinicalStatus", ClinicalStatusSection.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<SettingDefiningcode> SETTING_DEFININGCODE = new AqlFieldImp<SettingDefiningcode>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/setting|defining_code", "settingDefiningcode", SettingDefiningcode.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/location", "location", String.class, this);

  public ListSelectAqlField<UsualPlaceOfResidencyCluster> USUAL_PLACE_OF_RESIDENCY = new ListAqlFieldImp<UsualPlaceOfResidencyCluster>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.address_cc.v0 and name/value='Usual place of residency']", "usualPlaceOfResidency", UsualPlaceOfResidencyCluster.class, this);

  public SelectAqlField<CategoryDefiningcode> CATEGORY_DEFININGCODE = new AqlFieldImp<CategoryDefiningcode>(OpenEHRConfirmedCOVID19InfectionReportV0Composition.class, "/category|defining_code", "categoryDefiningcode", CategoryDefiningcode.class, this);

  private OpenEHRConfirmedCOVID19InfectionReportV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.report.v1");
  }

  public static OpenEHRConfirmedCOVID19InfectionReportV0CompositionContainment getInstance() {
    return new OpenEHRConfirmedCOVID19InfectionReportV0CompositionContainment();
  }
}
