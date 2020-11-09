package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.Double;
import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_QUANTITY")
public class LastTestTestmethodeDvquantity implements LastTestTestmethodeChoice {
  @Path("|magnitude")
  private Double testmethodeMagnitude;

  @Path("|units")
  private String testmethodeUnits;

  public void setTestmethodeMagnitude(Double testmethodeMagnitude) {
     this.testmethodeMagnitude = testmethodeMagnitude;
  }

  public Double getTestmethodeMagnitude() {
     return this.testmethodeMagnitude ;
  }

  public void setTestmethodeUnits(String testmethodeUnits) {
     this.testmethodeUnits = testmethodeUnits;
  }

  public String getTestmethodeUnits() {
     return this.testmethodeUnits ;
  }
}
