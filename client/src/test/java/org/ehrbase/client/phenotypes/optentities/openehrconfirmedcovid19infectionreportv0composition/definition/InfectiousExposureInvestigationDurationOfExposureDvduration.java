package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAmount;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_DURATION")
public class InfectiousExposureInvestigationDurationOfExposureDvduration implements InfectiousExposureInvestigationDurationOfExposureChoice {
  @Path("|value")
  private TemporalAmount durationOfExposureValue;

  public void setDurationOfExposureValue(TemporalAmount durationOfExposureValue) {
     this.durationOfExposureValue = durationOfExposureValue;
  }

  public TemporalAmount getDurationOfExposureValue() {
     return this.durationOfExposureValue ;
  }
}
