package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.Temporal;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_DATE")
public class LastTestTestmethodeDvdate implements LastTestTestmethodeChoice {
  @Path("|value")
  private Temporal testmethodeValue;

  public void setTestmethodeValue(Temporal testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public Temporal getTestmethodeValue() {
     return this.testmethodeValue ;
  }
}
