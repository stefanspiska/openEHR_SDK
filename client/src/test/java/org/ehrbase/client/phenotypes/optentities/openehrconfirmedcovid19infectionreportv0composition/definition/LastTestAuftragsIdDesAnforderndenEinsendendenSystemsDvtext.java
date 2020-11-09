package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class LastTestAuftragsIdDesAnforderndenEinsendendenSystemsDvtext implements LastTestAuftragsIdDesAnforderndenEinsendendenSystemsChoice {
  @Path("|value")
  private String auftragsIdDesAnforderndenEinsendendenSystemsValue;

  public void setAuftragsIdDesAnforderndenEinsendendenSystemsValue(
      String auftragsIdDesAnforderndenEinsendendenSystemsValue) {
     this.auftragsIdDesAnforderndenEinsendendenSystemsValue = auftragsIdDesAnforderndenEinsendendenSystemsValue;
  }

  public String getAuftragsIdDesAnforderndenEinsendendenSystemsValue() {
     return this.auftragsIdDesAnforderndenEinsendendenSystemsValue ;
  }
}
