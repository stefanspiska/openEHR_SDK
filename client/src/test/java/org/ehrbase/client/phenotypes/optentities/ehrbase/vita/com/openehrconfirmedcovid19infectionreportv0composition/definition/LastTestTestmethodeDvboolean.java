package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.Boolean;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_BOOLEAN")
public class LastTestTestmethodeDvboolean implements LastTestTestmethodeChoice {
  @Path("|value")
  private Boolean testmethodeValue;

  public void setTestmethodeValue(Boolean testmethodeValue) {
     this.testmethodeValue = testmethodeValue;
  }

  public Boolean isTestmethodeValue() {
     return this.testmethodeValue ;
  }
}
