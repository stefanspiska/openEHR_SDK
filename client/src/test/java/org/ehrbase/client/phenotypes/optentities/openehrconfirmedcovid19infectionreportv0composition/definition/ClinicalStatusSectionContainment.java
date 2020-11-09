package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class ClinicalStatusSectionContainment extends Containment {
  public SelectAqlField<ClinicalStatusSection> CLINICAL_STATUS_SECTION = new AqlFieldImp<ClinicalStatusSection>(ClinicalStatusSection.class, "", "ClinicalStatusSection", ClinicalStatusSection.class, this);

  public ListSelectAqlField<SymptomSignScreeningObservation> SYMPTOM_SIGN_SCREENING = new ListAqlFieldImp<SymptomSignScreeningObservation>(ClinicalStatusSection.class, "/items[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0 and name/value='Symptom/sign screening']", "symptomSignScreening", SymptomSignScreeningObservation.class, this);

  public ListSelectAqlField<ConditionScreeningObservation> CONDITION_SCREENING = new ListAqlFieldImp<ConditionScreeningObservation>(ClinicalStatusSection.class, "/items[openEHR-EHR-OBSERVATION.condition_screening.v0 and name/value='Condition screening']", "conditionScreening", ConditionScreeningObservation.class, this);

  public ListSelectAqlField<ManagementTreatmentScreeningObservation> MANAGEMENT_TREATMENT_SCREENING = new ListAqlFieldImp<ManagementTreatmentScreeningObservation>(ClinicalStatusSection.class, "/items[openEHR-EHR-OBSERVATION.management_screening.v0 and name/value='Management/treatment screening']", "managementTreatmentScreening", ManagementTreatmentScreeningObservation.class, this);

  public ListSelectAqlField<StoryHistoryObservation> STORY_HISTORY = new ListAqlFieldImp<StoryHistoryObservation>(ClinicalStatusSection.class, "/items[openEHR-EHR-OBSERVATION.story.v1]", "storyHistory", StoryHistoryObservation.class, this);

  public ListSelectAqlField<ProcedureScreeningObservation> PROCEDURE_SCREENING = new ListAqlFieldImp<ProcedureScreeningObservation>(ClinicalStatusSection.class, "/items[openEHR-EHR-OBSERVATION.procedure_screening.v0 and name/value='Procedure screening']", "procedureScreening", ProcedureScreeningObservation.class, this);

  private ClinicalStatusSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static ClinicalStatusSectionContainment getInstance() {
    return new ClinicalStatusSectionContainment();
  }
}
