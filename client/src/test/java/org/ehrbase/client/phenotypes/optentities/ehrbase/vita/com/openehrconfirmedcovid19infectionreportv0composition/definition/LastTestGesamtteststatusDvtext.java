package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class LastTestGesamtteststatusDvtext implements LastTestGesamtteststatusChoice {
  @Path("|value")
  private String gesamtteststatusValue;

  public void setGesamtteststatusValue(String gesamtteststatusValue) {
     this.gesamtteststatusValue = gesamtteststatusValue;
  }

  public String getGesamtteststatusValue() {
     return this.gesamtteststatusValue ;
  }
}
