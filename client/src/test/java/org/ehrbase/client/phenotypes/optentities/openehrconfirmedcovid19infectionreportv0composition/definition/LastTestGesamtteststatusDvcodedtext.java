package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_CODED_TEXT")
public class LastTestGesamtteststatusDvcodedtext implements LastTestGesamtteststatusChoice {
  @Path("|defining_code")
  private GesamtteststatusDefiningcode gesamtteststatusDefiningcode;

  public void setGesamtteststatusDefiningcode(
      GesamtteststatusDefiningcode gesamtteststatusDefiningcode) {
     this.gesamtteststatusDefiningcode = gesamtteststatusDefiningcode;
  }

  public GesamtteststatusDefiningcode getGesamtteststatusDefiningcode() {
     return this.gesamtteststatusDefiningcode ;
  }
}
