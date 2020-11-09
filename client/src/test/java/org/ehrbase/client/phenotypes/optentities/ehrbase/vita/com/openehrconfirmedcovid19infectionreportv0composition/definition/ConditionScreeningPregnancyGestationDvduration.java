package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAmount;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_DURATION")
public class ConditionScreeningPregnancyGestationDvduration implements ConditionScreeningPregnancyGestationChoice {
  @Path("|value")
  private TemporalAmount pregnancyGestationValue;

  public void setPregnancyGestationValue(TemporalAmount pregnancyGestationValue) {
     this.pregnancyGestationValue = pregnancyGestationValue;
  }

  public TemporalAmount getPregnancyGestationValue() {
     return this.pregnancyGestationValue ;
  }
}
