package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("ELEMENT")
public class InfectiousExposureInvestigationDateTimeOfFirstExposureElement implements InfectiousExposureInvestigationDateTimeOfFirstExposureChoice {
  @Path("/value|value")
  private TemporalAccessor value;

  public void setValue(TemporalAccessor value) {
     this.value = value;
  }

  public TemporalAccessor getValue() {
     return this.value ;
  }
}
