package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class OutcomeSectionContainment extends Containment {
  public SelectAqlField<OutcomeSection> OUTCOME_SECTION = new AqlFieldImp<OutcomeSection>(OutcomeSection.class, "", "OutcomeSection", OutcomeSection.class, this);

  public ListSelectAqlField<PostTestManagementTreatmentScreeningObservation> POST_TEST_MANAGEMENT_TREATMENT_SCREENING = new ListAqlFieldImp<PostTestManagementTreatmentScreeningObservation>(OutcomeSection.class, "/items[openEHR-EHR-OBSERVATION.management_screening.v0 and name/value='Post test management/treatment screening']", "postTestManagementTreatmentScreening", PostTestManagementTreatmentScreeningObservation.class, this);

  public ListSelectAqlField<PostTestSymptomSignScreeningObservation> POST_TEST_SYMPTOM_SIGN_SCREENING = new ListAqlFieldImp<PostTestSymptomSignScreeningObservation>(OutcomeSection.class, "/items[openEHR-EHR-OBSERVATION.symptom_sign_screening.v0 and name/value='Post test symptom/sign screening']", "postTestSymptomSignScreening", PostTestSymptomSignScreeningObservation.class, this);

  public ListSelectAqlField<PostTestProcedureScreeningObservation> POST_TEST_PROCEDURE_SCREENING = new ListAqlFieldImp<PostTestProcedureScreeningObservation>(OutcomeSection.class, "/items[openEHR-EHR-OBSERVATION.procedure_screening.v0 and name/value='Post test procedure screening']", "postTestProcedureScreening", PostTestProcedureScreeningObservation.class, this);

  public ListSelectAqlField<EpisodeOfCareInstitutionAdminEntry> EPISODE_OF_CARE_INSTITUTION = new ListAqlFieldImp<EpisodeOfCareInstitutionAdminEntry>(OutcomeSection.class, "/items[openEHR-EHR-ADMIN_ENTRY.episode_institution.v0]", "episodeOfCareInstitution", EpisodeOfCareInstitutionAdminEntry.class, this);

  public ListSelectAqlField<LastTestObservation> LAST_TEST = new ListAqlFieldImp<LastTestObservation>(OutcomeSection.class, "/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1 and name/value='Last test']", "lastTest", LastTestObservation.class, this);

  private OutcomeSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static OutcomeSectionContainment getInstance() {
    return new OutcomeSectionContainment();
  }
}
