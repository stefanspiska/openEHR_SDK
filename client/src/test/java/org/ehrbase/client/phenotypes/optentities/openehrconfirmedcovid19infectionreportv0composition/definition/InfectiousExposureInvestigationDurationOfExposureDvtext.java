package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class InfectiousExposureInvestigationDurationOfExposureDvtext implements InfectiousExposureInvestigationDurationOfExposureChoice {
  @Path("|value")
  private String durationOfExposureValue;

  public void setDurationOfExposureValue(String durationOfExposureValue) {
     this.durationOfExposureValue = durationOfExposureValue;
  }

  public String getDurationOfExposureValue() {
     return this.durationOfExposureValue ;
  }
}
