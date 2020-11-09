package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_IDENTIFIER")
public class LastTestTestmethodeDvidentifier implements LastTestTestmethodeChoice {
  @Path("")
  private DvIdentifier testmethode;

  public void setTestmethode(DvIdentifier testmethode) {
     this.testmethode = testmethode;
  }

  public DvIdentifier getTestmethode() {
     return this.testmethode ;
  }
}
