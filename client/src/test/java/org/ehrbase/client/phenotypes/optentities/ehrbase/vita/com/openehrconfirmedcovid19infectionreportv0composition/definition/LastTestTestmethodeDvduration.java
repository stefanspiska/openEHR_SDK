package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAmount;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_DURATION")
public class LastTestTestmethodeDvduration implements LastTestTestmethodeChoice {
  @Path("|value")
  private TemporalAmount testmethodeValue;

  public void setTestmethodeValue(TemporalAmount testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public TemporalAmount getTestmethodeValue() {
     return this.testmethodeValue ;
  }
}
