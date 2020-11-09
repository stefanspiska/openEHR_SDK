package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_IDENTIFIER")
public class InfectiousExposureInvestigationCaseIdentifierDvidentifier implements InfectiousExposureInvestigationCaseIdentifierChoice {
  @Path("")
  private DvIdentifier caseIdentifier;

  public void setCaseIdentifier(DvIdentifier caseIdentifier) {
     this.caseIdentifier = caseIdentifier;
  }

  public DvIdentifier getCaseIdentifier() {
     return this.caseIdentifier ;
  }
}
