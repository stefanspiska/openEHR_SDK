package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class LastTestTestmethodeDvtext implements LastTestTestmethodeChoice {
  @Path("|value")
  private String testmethodeValue;

  public void setTestmethodeValue(String testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public String getTestmethodeValue() {
     return this.testmethodeValue ;
  }
}
