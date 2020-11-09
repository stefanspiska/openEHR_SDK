package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_TEXT")
public class InfectiousExposureInvestigationCaseIdentifierDvtext implements InfectiousExposureInvestigationCaseIdentifierChoice {
  @Path("|value")
  private String caseIdentifierValue;

  public void setCaseIdentifierValue(String caseIdentifierValue) {
     this.caseIdentifierValue = caseIdentifierValue;
  }

  public String getCaseIdentifierValue() {
     return this.caseIdentifierValue ;
  }
}
