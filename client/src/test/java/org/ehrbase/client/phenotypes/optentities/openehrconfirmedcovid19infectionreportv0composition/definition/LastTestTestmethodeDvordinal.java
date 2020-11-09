package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.quantity.DvOrdinal;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_ORDINAL")
public class LastTestTestmethodeDvordinal implements LastTestTestmethodeChoice {
  @Path("")
  private DvOrdinal testmethode;

  public void setTestmethode(DvOrdinal testmethode) {
     this.testmethode = testmethode;
  }

  public DvOrdinal getTestmethode() {
     return this.testmethode ;
  }
}
