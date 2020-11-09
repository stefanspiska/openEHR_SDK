package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.laboratory_test_result.v1")
public class LastTestObservation {
  @Path("/protocol[at0004]/items[at0068]/value")
  @Choice
  private LastTestLaborinterneKennzeichnungChoice laborinterneKennzeichnung;

  @Path("/protocol[at0004]/items[at0110]")
  private List<Cluster> testDetails;

  @Path("/protocol[at0004]/items[at0094]")
  private List<LastTestDetailsDerTestanforderungCluster> detailsDerTestanforderung;

  @Path("/language")
  private Language language;

  @Path("/protocol[at0004]/items[at0121]/value")
  @Choice
  private LastTestTestmethodeChoice testmethode;

  @Path("/protocol[at0004]/items[at0117]")
  private List<Cluster> erweiterung;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<LastTestLastTestChoice> lastTest;

  @Path("/protocol[at0004]/items[at0111]/value|value")
  private Boolean pointOfCareTestValue;

  @Path("/protocol[at0004]/items[at0017]")
  private Cluster laborWelchesDenUntersuchungsauftragAnnimmt;

  public void setLaborinterneKennzeichnung(
      LastTestLaborinterneKennzeichnungChoice laborinterneKennzeichnung) {
     this.laborinterneKennzeichnung = laborinterneKennzeichnung;
  }

  public LastTestLaborinterneKennzeichnungChoice getLaborinterneKennzeichnung() {
     return this.laborinterneKennzeichnung ;
  }

  public void setTestDetails(List<Cluster> testDetails) {
     this.testDetails = testDetails;
  }

  public List<Cluster> getTestDetails() {
     return this.testDetails ;
  }

  public void setDetailsDerTestanforderung(
      List<LastTestDetailsDerTestanforderungCluster> detailsDerTestanforderung) {
     this.detailsDerTestanforderung = detailsDerTestanforderung;
  }

  public List<LastTestDetailsDerTestanforderungCluster> getDetailsDerTestanforderung() {
     return this.detailsDerTestanforderung ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setTestmethode(LastTestTestmethodeChoice testmethode) {
     this.testmethode = testmethode;
  }

  public LastTestTestmethodeChoice getTestmethode() {
     return this.testmethode ;
  }

  public void setErweiterung(List<Cluster> erweiterung) {
     this.erweiterung = erweiterung;
  }

  public List<Cluster> getErweiterung() {
     return this.erweiterung ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setLastTest(List<LastTestLastTestChoice> lastTest) {
     this.lastTest = lastTest;
  }

  public List<LastTestLastTestChoice> getLastTest() {
     return this.lastTest ;
  }

  public void setPointOfCareTestValue(Boolean pointOfCareTestValue) {
     this.pointOfCareTestValue = pointOfCareTestValue;
  }

  public Boolean isPointOfCareTestValue() {
     return this.pointOfCareTestValue ;
  }

  public void setLaborWelchesDenUntersuchungsauftragAnnimmt(
      Cluster laborWelchesDenUntersuchungsauftragAnnimmt) {
     this.laborWelchesDenUntersuchungsauftragAnnimmt = laborWelchesDenUntersuchungsauftragAnnimmt;
  }

  public Cluster getLaborWelchesDenUntersuchungsauftragAnnimmt() {
     return this.laborWelchesDenUntersuchungsauftragAnnimmt ;
  }
}
