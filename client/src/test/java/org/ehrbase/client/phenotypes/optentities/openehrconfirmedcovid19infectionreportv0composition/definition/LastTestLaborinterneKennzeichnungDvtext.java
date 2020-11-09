package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class LastTestLaborinterneKennzeichnungDvtext implements LastTestLaborinterneKennzeichnungChoice {
  @Path("|value")
  private String laborinterneKennzeichnungValue;

  public void setLaborinterneKennzeichnungValue(String laborinterneKennzeichnungValue) {
     this.laborinterneKennzeichnungValue = laborinterneKennzeichnungValue;
  }

  public String getLaborinterneKennzeichnungValue() {
     return this.laborinterneKennzeichnungValue ;
  }
}
