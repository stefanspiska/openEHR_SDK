package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.Long;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_COUNT")
public class LastTestTestmethodeDvcount implements LastTestTestmethodeChoice {
  @Path("|magnitude")
  private Long testmethodeMagnitude;

  public void setTestmethodeMagnitude(Long testmethodeMagnitude) {
     this.testmethodeMagnitude = testmethodeMagnitude;
  }

  public Long getTestmethodeMagnitude() {
     return this.testmethodeMagnitude ;
  }
}
