package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class ExposureSectionContainment extends Containment {
  public SelectAqlField<ExposureSection> EXPOSURE_SECTION = new AqlFieldImp<ExposureSection>(ExposureSection.class, "", "ExposureSection", ExposureSection.class, this);

  public ListSelectAqlField<TravelEventObservation> TRAVEL_EVENT = new ListAqlFieldImp<TravelEventObservation>(ExposureSection.class, "/items[openEHR-EHR-OBSERVATION.travel_event.v0]", "travelEvent", TravelEventObservation.class, this);

  public ListSelectAqlField<OccupationEvaluation> OCCUPATION = new ListAqlFieldImp<OccupationEvaluation>(ExposureSection.class, "/items[openEHR-EHR-EVALUATION.occupation_summary.v1 and name/value='Occupation']", "occupation", OccupationEvaluation.class, this);

  public ListSelectAqlField<InfectiousExposureInvestigationEvaluation> INFECTIOUS_EXPOSURE_INVESTIGATION = new ListAqlFieldImp<InfectiousExposureInvestigationEvaluation>(ExposureSection.class, "/items[openEHR-EHR-EVALUATION.infectious_exposure.v0]", "infectiousExposureInvestigation", InfectiousExposureInvestigationEvaluation.class, this);

  private ExposureSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static ExposureSectionContainment getInstance() {
    return new ExposureSectionContainment();
  }
}
