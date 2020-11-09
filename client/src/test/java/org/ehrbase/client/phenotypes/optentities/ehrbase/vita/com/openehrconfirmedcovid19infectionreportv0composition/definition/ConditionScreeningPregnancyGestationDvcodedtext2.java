package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_CODED_TEXT")
public class ConditionScreeningPregnancyGestationDvcodedtext2 implements ConditionScreeningPregnancyGestationChoice2 {
  @Path("|defining_code")
  private PregnancyGestationDefiningcode pregnancyGestationDefiningcode;

  public void setPregnancyGestationDefiningcode(
      PregnancyGestationDefiningcode pregnancyGestationDefiningcode) {
     this.pregnancyGestationDefiningcode = pregnancyGestationDefiningcode;
  }

  public PregnancyGestationDefiningcode getPregnancyGestationDefiningcode() {
     return this.pregnancyGestationDefiningcode ;
  }
}
