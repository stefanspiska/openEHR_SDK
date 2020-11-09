package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.encapsulated.DvMultimedia;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_MULTIMEDIA")
public class LastTestTestmethodeDvmultimedia implements LastTestTestmethodeChoice {
  @Path("")
  private DvMultimedia testmethode;

  public void setTestmethode(DvMultimedia testmethode) {
     this.testmethode = testmethode;
  }

  public DvMultimedia getTestmethode() {
     return this.testmethode ;
  }
}
