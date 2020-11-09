package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.MathFunctionDefiningcode;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("INTERVAL_EVENT")
public class ConditionScreeningAtTestingIntervalEvent implements ConditionScreeningAtTestingChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/width|value")
  private TemporalAmount widthValue;

  @Path("/data[at0003]/items[at0034]/value|defining_code")
  private ScreeningPurposeDefiningcode screeningPurposeDefiningcode;

  @Path("/data[at0003]/items[at0026]")
  private List<Cluster> additionalDetails;

  @Path("/math_function|defining_code")
  private MathFunctionDefiningcode mathFunctionDefiningcode;

  @Path("/data[at0003]/items[at0022]")
  private List<ConditionScreeningOtherConditionCluster> otherCondition;

  @Path("/data[at0003]/items[at0028]/value|defining_code")
  private PresenceOfAnyConditionsDefiningcode presenceOfAnyConditionsDefiningcode;

  @Path("/data[at0003]/items[at0029]/value")
  @Choice
  private ConditionScreeningPregnancyGestationChoice2 pregnancyGestation;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setScreeningPurposeDefiningcode(
      ScreeningPurposeDefiningcode screeningPurposeDefiningcode) {
     this.screeningPurposeDefiningcode = screeningPurposeDefiningcode;
  }

  public ScreeningPurposeDefiningcode getScreeningPurposeDefiningcode() {
     return this.screeningPurposeDefiningcode ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setMathFunctionDefiningcode(MathFunctionDefiningcode mathFunctionDefiningcode) {
     this.mathFunctionDefiningcode = mathFunctionDefiningcode;
  }

  public MathFunctionDefiningcode getMathFunctionDefiningcode() {
     return this.mathFunctionDefiningcode ;
  }

  public void setOtherCondition(List<ConditionScreeningOtherConditionCluster> otherCondition) {
     this.otherCondition = otherCondition;
  }

  public List<ConditionScreeningOtherConditionCluster> getOtherCondition() {
     return this.otherCondition ;
  }

  public void setPresenceOfAnyConditionsDefiningcode(
      PresenceOfAnyConditionsDefiningcode presenceOfAnyConditionsDefiningcode) {
     this.presenceOfAnyConditionsDefiningcode = presenceOfAnyConditionsDefiningcode;
  }

  public PresenceOfAnyConditionsDefiningcode getPresenceOfAnyConditionsDefiningcode() {
     return this.presenceOfAnyConditionsDefiningcode ;
  }

  public void setPregnancyGestation(
      ConditionScreeningPregnancyGestationChoice2 pregnancyGestation) {
     this.pregnancyGestation = pregnancyGestation;
  }

  public ConditionScreeningPregnancyGestationChoice2 getPregnancyGestation() {
     return this.pregnancyGestation ;
  }
}
