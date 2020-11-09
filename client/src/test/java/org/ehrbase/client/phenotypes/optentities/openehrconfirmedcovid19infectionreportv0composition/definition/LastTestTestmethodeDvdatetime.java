package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_DATE_TIME")
public class LastTestTestmethodeDvdatetime implements LastTestTestmethodeChoice {
  @Path("|value")
  private TemporalAccessor testmethodeValue;

  public void setTestmethodeValue(TemporalAccessor testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public TemporalAccessor getTestmethodeValue() {
     return this.testmethodeValue ;
  }
}
