package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("POINT_EVENT")
public class ConditionScreeningAtTestingPointEvent implements ConditionScreeningAtTestingChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0034]/value|defining_code")
  private ScreeningPurposeDefiningcode screeningPurposeDefiningcode;

  @Path("/data[at0003]/items[at0026]")
  private List<Cluster> additionalDetails;

  @Path("/data[at0003]/items[at0022]")
  private List<ConditionScreeningOtherConditionCluster> otherCondition;

  @Path("/data[at0003]/items[at0028]/value|defining_code")
  private PresenceOfAnyConditionsDefiningcode presenceOfAnyConditionsDefiningcode;

  @Path("/data[at0003]/items[at0029]/value")
  @Choice
  private ConditionScreeningPregnancyGestationChoice pregnancyGestation;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
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

  public void setPregnancyGestation(ConditionScreeningPregnancyGestationChoice pregnancyGestation) {
     this.pregnancyGestation = pregnancyGestation;
  }

  public ConditionScreeningPregnancyGestationChoice getPregnancyGestation() {
     return this.pregnancyGestation ;
  }
}
