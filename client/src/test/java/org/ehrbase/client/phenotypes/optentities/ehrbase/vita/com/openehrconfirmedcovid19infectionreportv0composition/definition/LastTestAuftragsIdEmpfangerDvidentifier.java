package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_IDENTIFIER")
public class LastTestAuftragsIdEmpfangerDvidentifier implements LastTestAuftragsIdEmpfangerChoice {
  @Path("")
  private DvIdentifier auftragsIdEmpfanger;

  public void setAuftragsIdEmpfanger(DvIdentifier auftragsIdEmpfanger) {
     this.auftragsIdEmpfanger = auftragsIdEmpfanger;
  }

  public DvIdentifier getAuftragsIdEmpfanger() {
     return this.auftragsIdEmpfanger ;
  }
}
