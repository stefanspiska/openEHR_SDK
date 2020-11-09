package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.encapsulated.DvParsable;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_PARSABLE")
public class LastTestTestmethodeDvparsable implements LastTestTestmethodeChoice {
  @Path("")
  private DvParsable testmethode;

  public void setTestmethode(DvParsable testmethode) {
     this.testmethode = testmethode;
  }

  public DvParsable getTestmethode() {
     return this.testmethode ;
  }
}
