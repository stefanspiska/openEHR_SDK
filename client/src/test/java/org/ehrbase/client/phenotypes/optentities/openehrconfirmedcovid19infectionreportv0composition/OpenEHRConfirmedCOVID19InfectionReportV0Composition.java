package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition.*;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.CategoryDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.SettingDefiningcode;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Territory;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.openehrclient.VersionUid;


@Entity
@Archetype("openEHR-EHR-COMPOSITION.report.v1")
@Template("openEHR confirmed COVID-19 infection report.v0")
public class OpenEHRConfirmedCOVID19InfectionReportV0Composition {
  @Id
  private VersionUid versionUid;

  @Path("/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.person_anonymised_parent.v0 and name/value='Patient information']")
  private List<PatientInformationCluster> patientInformation;

  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  @Path("/context/participations")
  private List<Participation> participations;

  @Path("/language")
  private Language language;

  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  @Path("/context/other_context[at0001]/items[at0005]/value|value")
  private String statusValue;

  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Reporting']")
  private List<ReportingSection> reporting;

  @Path("/context/other_context[at0001]/items[at0002]/value|value")
  private String countryCaseIdValue;

  @Path("/territory")
  private Territory territory;

  @Path("/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.address_cc.v0 and name/value='Where case diagnosed']")
  private List<WhereCaseDiagnosedCluster> whereCaseDiagnosed;

  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Exposure']")
  private List<ExposureSection> exposure;

  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Outcome']")
  private List<OutcomeSection> outcome;

  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Clinical status']")
  private List<ClinicalStatusSection> clinicalStatus;

  @Path("/composer")
  private PartyProxy composer;

  @Path("/context/setting|defining_code")
  private SettingDefiningcode settingDefiningcode;

  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  @Path("/context/location")
  private String location;

  @Path("/context/other_context[at0001]/items[openEHR-EHR-CLUSTER.address_cc.v0 and name/value='Usual place of residency']")
  private List<UsualPlaceOfResidencyCluster> usualPlaceOfResidency;

  @Path("/category|defining_code")
  private CategoryDefiningcode categoryDefiningcode;

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }

  public void setPatientInformation(List<PatientInformationCluster> patientInformation) {
     this.patientInformation = patientInformation;
  }

  public List<PatientInformationCluster> getPatientInformation() {
     return this.patientInformation ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setStatusValue(String statusValue) {
     this.statusValue = statusValue;
  }

  public String getStatusValue() {
     return this.statusValue ;
  }

  public void setReporting(List<ReportingSection> reporting) {
     this.reporting = reporting;
  }

  public List<ReportingSection> getReporting() {
     return this.reporting ;
  }

  public void setCountryCaseIdValue(String countryCaseIdValue) {
     this.countryCaseIdValue = countryCaseIdValue;
  }

  public String getCountryCaseIdValue() {
     return this.countryCaseIdValue ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public void setWhereCaseDiagnosed(List<WhereCaseDiagnosedCluster> whereCaseDiagnosed) {
     this.whereCaseDiagnosed = whereCaseDiagnosed;
  }

  public List<WhereCaseDiagnosedCluster> getWhereCaseDiagnosed() {
     return this.whereCaseDiagnosed ;
  }

  public void setExposure(List<ExposureSection> exposure) {
     this.exposure = exposure;
  }

  public List<ExposureSection> getExposure() {
     return this.exposure ;
  }

  public void setOutcome(List<OutcomeSection> outcome) {
     this.outcome = outcome;
  }

  public List<OutcomeSection> getOutcome() {
     return this.outcome ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setClinicalStatus(List<ClinicalStatusSection> clinicalStatus) {
     this.clinicalStatus = clinicalStatus;
  }

  public List<ClinicalStatusSection> getClinicalStatus() {
     return this.clinicalStatus ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setSettingDefiningcode(SettingDefiningcode settingDefiningcode) {
     this.settingDefiningcode = settingDefiningcode;
  }

  public SettingDefiningcode getSettingDefiningcode() {
     return this.settingDefiningcode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setUsualPlaceOfResidency(List<UsualPlaceOfResidencyCluster> usualPlaceOfResidency) {
     this.usualPlaceOfResidency = usualPlaceOfResidency;
  }

  public List<UsualPlaceOfResidencyCluster> getUsualPlaceOfResidency() {
     return this.usualPlaceOfResidency ;
  }

  public void setCategoryDefiningcode(CategoryDefiningcode categoryDefiningcode) {
     this.categoryDefiningcode = categoryDefiningcode;
  }

  public CategoryDefiningcode getCategoryDefiningcode() {
     return this.categoryDefiningcode ;
  }
}
