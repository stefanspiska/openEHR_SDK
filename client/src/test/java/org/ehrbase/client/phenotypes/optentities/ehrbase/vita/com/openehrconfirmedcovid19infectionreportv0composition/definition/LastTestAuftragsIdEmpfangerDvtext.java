package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class LastTestAuftragsIdEmpfangerDvtext implements LastTestAuftragsIdEmpfangerChoice {
  @Path("|value")
  private String auftragsIdEmpfangerValue;

  public void setAuftragsIdEmpfangerValue(String auftragsIdEmpfangerValue) {
     this.auftragsIdEmpfangerValue = auftragsIdEmpfangerValue;
  }

  public String getAuftragsIdEmpfangerValue() {
     return this.auftragsIdEmpfangerValue ;
  }
}
