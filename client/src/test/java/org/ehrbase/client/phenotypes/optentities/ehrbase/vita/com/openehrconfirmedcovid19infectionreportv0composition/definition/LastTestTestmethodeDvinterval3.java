package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.quantity.DvInterval;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_INTERVAL")
public class LastTestTestmethodeDvinterval3 implements LastTestTestmethodeChoice {
  @Path("")
  private DvInterval testmethode;

  public void setTestmethode(DvInterval testmethode) {
     this.testmethode = testmethode;
  }

  public DvInterval getTestmethode() {
     return this.testmethode ;
  }
}
