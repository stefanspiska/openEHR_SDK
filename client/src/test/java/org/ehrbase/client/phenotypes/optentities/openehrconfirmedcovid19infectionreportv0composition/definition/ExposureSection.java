package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
public class ExposureSection {
  @Path("/items[openEHR-EHR-OBSERVATION.travel_event.v0]")
  private List<TravelEventObservation> travelEvent;

  @Path("/items[openEHR-EHR-EVALUATION.occupation_summary.v1 and name/value='Occupation']")
  private List<OccupationEvaluation> occupation;

  @Path("/items[openEHR-EHR-EVALUATION.infectious_exposure.v0]")
  private List<InfectiousExposureInvestigationEvaluation> infectiousExposureInvestigation;

  public void setTravelEvent(List<TravelEventObservation> travelEvent) {
     this.travelEvent = travelEvent;
  }

  public List<TravelEventObservation> getTravelEvent() {
     return this.travelEvent ;
  }

  public void setOccupation(List<OccupationEvaluation> occupation) {
     this.occupation = occupation;
  }

  public List<OccupationEvaluation> getOccupation() {
     return this.occupation ;
  }

  public void setInfectiousExposureInvestigation(
      List<InfectiousExposureInvestigationEvaluation> infectiousExposureInvestigation) {
     this.infectiousExposureInvestigation = infectiousExposureInvestigation;
  }

  public List<InfectiousExposureInvestigationEvaluation> getInfectiousExposureInvestigation() {
     return this.infectiousExposureInvestigation ;
  }
}
