package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
public class ClinicalStatusSection {
  @Path("/items[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0 and name/value='Symptom/sign screening']")
  private List<SymptomSignScreeningObservation> symptomSignScreening;

  @Path("/items[openEHR-EHR-OBSERVATION.condition_screening.v0 and name/value='Condition screening']")
  private List<ConditionScreeningObservation> conditionScreening;

  @Path("/items[openEHR-EHR-OBSERVATION.management_screening.v0 and name/value='Management/treatment screening']")
  private List<ManagementTreatmentScreeningObservation> managementTreatmentScreening;

  @Path("/items[openEHR-EHR-OBSERVATION.story.v1]")
  private List<StoryHistoryObservation> storyHistory;

  @Path("/items[openEHR-EHR-OBSERVATION.procedure_screening.v0 and name/value='Procedure screening']")
  private List<ProcedureScreeningObservation> procedureScreening;

  public void setSymptomSignScreening(List<SymptomSignScreeningObservation> symptomSignScreening) {
     this.symptomSignScreening = symptomSignScreening;
  }

  public List<SymptomSignScreeningObservation> getSymptomSignScreening() {
     return this.symptomSignScreening ;
  }

  public void setConditionScreening(List<ConditionScreeningObservation> conditionScreening) {
     this.conditionScreening = conditionScreening;
  }

  public List<ConditionScreeningObservation> getConditionScreening() {
     return this.conditionScreening ;
  }

  public void setManagementTreatmentScreening(
      List<ManagementTreatmentScreeningObservation> managementTreatmentScreening) {
     this.managementTreatmentScreening = managementTreatmentScreening;
  }

  public List<ManagementTreatmentScreeningObservation> getManagementTreatmentScreening() {
     return this.managementTreatmentScreening ;
  }

  public void setStoryHistory(List<StoryHistoryObservation> storyHistory) {
     this.storyHistory = storyHistory;
  }

  public List<StoryHistoryObservation> getStoryHistory() {
     return this.storyHistory ;
  }

  public void setProcedureScreening(List<ProcedureScreeningObservation> procedureScreening) {
     this.procedureScreening = procedureScreening;
  }

  public List<ProcedureScreeningObservation> getProcedureScreening() {
     return this.procedureScreening ;
  }
}
