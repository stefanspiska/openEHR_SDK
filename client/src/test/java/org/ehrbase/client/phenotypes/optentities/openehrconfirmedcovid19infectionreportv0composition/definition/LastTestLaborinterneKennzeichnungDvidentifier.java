package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_IDENTIFIER")
public class LastTestLaborinterneKennzeichnungDvidentifier implements LastTestLaborinterneKennzeichnungChoice {
  @Path("")
  private DvIdentifier laborinterneKennzeichnung;

  public void setLaborinterneKennzeichnung(DvIdentifier laborinterneKennzeichnung) {
     this.laborinterneKennzeichnung = laborinterneKennzeichnung;
  }

  public DvIdentifier getLaborinterneKennzeichnung() {
     return this.laborinterneKennzeichnung ;
  }
}
