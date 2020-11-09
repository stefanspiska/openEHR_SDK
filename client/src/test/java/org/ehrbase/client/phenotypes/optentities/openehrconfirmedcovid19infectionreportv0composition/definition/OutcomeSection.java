package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
public class OutcomeSection {
  @Path("/items[openEHR-EHR-OBSERVATION.management_screening.v0 and name/value='Post test management/treatment screening']")
  private List<PostTestManagementTreatmentScreeningObservation> postTestManagementTreatmentScreening;

  @Path("/items[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0 and name/value='Post test symptom/sign screening']")
  private List<PostTestSymptomSignScreeningObservation> postTestSymptomSignScreening;

  @Path("/items[openEHR-EHR-OBSERVATION.procedure_screening.v0 and name/value='Post test procedure screening']")
  private List<PostTestProcedureScreeningObservation> postTestProcedureScreening;

  @Path("/items[openEHR-EHR-ADMIN_ENTRY.episode_institution.v0]")
  private List<EpisodeOfCareInstitutionAdminEntry> episodeOfCareInstitution;

  @Path("/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1 and name/value='Last test']")
  private List<LastTestObservation> lastTest;

  public void setPostTestManagementTreatmentScreening(
      List<PostTestManagementTreatmentScreeningObservation> postTestManagementTreatmentScreening) {
     this.postTestManagementTreatmentScreening = postTestManagementTreatmentScreening;
  }

  public List<PostTestManagementTreatmentScreeningObservation> getPostTestManagementTreatmentScreening(
      ) {
     return this.postTestManagementTreatmentScreening ;
  }

  public void setPostTestSymptomSignScreening(
      List<PostTestSymptomSignScreeningObservation> postTestSymptomSignScreening) {
     this.postTestSymptomSignScreening = postTestSymptomSignScreening;
  }

  public List<PostTestSymptomSignScreeningObservation> getPostTestSymptomSignScreening() {
     return this.postTestSymptomSignScreening ;
  }

  public void setPostTestProcedureScreening(
      List<PostTestProcedureScreeningObservation> postTestProcedureScreening) {
     this.postTestProcedureScreening = postTestProcedureScreening;
  }

  public List<PostTestProcedureScreeningObservation> getPostTestProcedureScreening() {
     return this.postTestProcedureScreening ;
  }

  public void setEpisodeOfCareInstitution(
      List<EpisodeOfCareInstitutionAdminEntry> episodeOfCareInstitution) {
     this.episodeOfCareInstitution = episodeOfCareInstitution;
  }

  public List<EpisodeOfCareInstitutionAdminEntry> getEpisodeOfCareInstitution() {
     return this.episodeOfCareInstitution ;
  }

  public void setLastTest(List<LastTestObservation> lastTest) {
     this.lastTest = lastTest;
  }

  public List<LastTestObservation> getLastTest() {
     return this.lastTest ;
  }
}
