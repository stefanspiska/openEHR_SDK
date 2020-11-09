package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class LastTestTestdiagnoseElement {
  @Path("/value|defining_code")
  private Definingcode2 definingcode;

  public void setDefiningcode(Definingcode2 definingcode) {
     this.definingcode = definingcode;
  }

  public Definingcode2 getDefiningcode() {
     return this.definingcode ;
  }
}
