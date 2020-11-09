package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class FirstTestTestdiagnoseElement {
  @Path("/value|defining_code")
  private Definingcode definingcode;

  public void setDefiningcode(Definingcode definingcode) {
     this.definingcode = definingcode;
  }

  public Definingcode getDefiningcode() {
     return this.definingcode ;
  }
}
