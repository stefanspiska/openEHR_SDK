package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class InfectiousExposureInvestigationSpecificExposureDetailsCluster {
  @Path("/items[at0006]/value|value")
  private String descriptionOfExposureValue;

  @Path("/items[at0021]/value|value")
  private String activityDescriptionValue;

  @Path("/items[at0024]/value|value")
  private String exposureCategoryValue;

  @Path("/items[at0008]/value|value")
  private String physicalLocationCategoryValue;

  @Path("/items[at0004]/value|value")
  private TemporalAccessor dateOfNotificationReportValue;

  @Path("/items[at0022]")
  private List<Cluster> personalProtectiveEquipment;

  @Path("/items[at0009]")
  private List<InfectiousExposureInvestigationSpecificPhysicalLocationElement> specificPhysicalLocation;

  @Path("/items[at0027]/value|defining_code")
  private ConfirmedExposureDefiningcode confirmedExposureDefiningcode;

  @Path("/items[at0026]")
  private List<Cluster> structuredLocationDetails;

  @Path("/items[at0015]")
  private List<Cluster> sourceIndividualDetails;

  @Path("/items[at0025]/value")
  @Choice
  private InfectiousExposureInvestigationCaseIdentifierChoice caseIdentifier;

  @Path("/items[at0020]/value|value")
  private String activityCategoryValue;

  @Path("/items[at0012]/value|value")
  private String proximityOfContactValue;

  @Path("/items[at0016]")
  private List<Cluster> contributoryFactors;

  @Path("/items[at0019]")
  private List<Cluster> anatomicalLocationDetails;

  @Path("/items[at0011]/value")
  @Choice
  private InfectiousExposureInvestigationDurationOfExposureChoice durationOfExposure;

  @Path("/items[at0007]")
  @Choice
  private List<InfectiousExposureInvestigationDateTimeOfFirstExposureChoice> dateTimeOfFirstExposure;

  public void setDescriptionOfExposureValue(String descriptionOfExposureValue) {
     this.descriptionOfExposureValue = descriptionOfExposureValue;
  }

  public String getDescriptionOfExposureValue() {
     return this.descriptionOfExposureValue ;
  }

  public void setActivityDescriptionValue(String activityDescriptionValue) {
     this.activityDescriptionValue = activityDescriptionValue;
  }

  public String getActivityDescriptionValue() {
     return this.activityDescriptionValue ;
  }

  public void setExposureCategoryValue(String exposureCategoryValue) {
     this.exposureCategoryValue = exposureCategoryValue;
  }

  public String getExposureCategoryValue() {
     return this.exposureCategoryValue ;
  }

  public void setPhysicalLocationCategoryValue(String physicalLocationCategoryValue) {
     this.physicalLocationCategoryValue = physicalLocationCategoryValue;
  }

  public String getPhysicalLocationCategoryValue() {
     return this.physicalLocationCategoryValue ;
  }

  public void setDateOfNotificationReportValue(TemporalAccessor dateOfNotificationReportValue) {
     this.dateOfNotificationReportValue = dateOfNotificationReportValue;
  }

  public TemporalAccessor getDateOfNotificationReportValue() {
     return this.dateOfNotificationReportValue ;
  }

  public void setPersonalProtectiveEquipment(List<Cluster> personalProtectiveEquipment) {
     this.personalProtectiveEquipment = personalProtectiveEquipment;
  }

  public List<Cluster> getPersonalProtectiveEquipment() {
     return this.personalProtectiveEquipment ;
  }

  public void setSpecificPhysicalLocation(
      List<InfectiousExposureInvestigationSpecificPhysicalLocationElement> specificPhysicalLocation) {
     this.specificPhysicalLocation = specificPhysicalLocation;
  }

  public List<InfectiousExposureInvestigationSpecificPhysicalLocationElement> getSpecificPhysicalLocation(
      ) {
     return this.specificPhysicalLocation ;
  }

  public void setConfirmedExposureDefiningcode(
      ConfirmedExposureDefiningcode confirmedExposureDefiningcode) {
     this.confirmedExposureDefiningcode = confirmedExposureDefiningcode;
  }

  public ConfirmedExposureDefiningcode getConfirmedExposureDefiningcode() {
     return this.confirmedExposureDefiningcode ;
  }

  public void setStructuredLocationDetails(List<Cluster> structuredLocationDetails) {
     this.structuredLocationDetails = structuredLocationDetails;
  }

  public List<Cluster> getStructuredLocationDetails() {
     return this.structuredLocationDetails ;
  }

  public void setSourceIndividualDetails(List<Cluster> sourceIndividualDetails) {
     this.sourceIndividualDetails = sourceIndividualDetails;
  }

  public List<Cluster> getSourceIndividualDetails() {
     return this.sourceIndividualDetails ;
  }

  public void setCaseIdentifier(
      InfectiousExposureInvestigationCaseIdentifierChoice caseIdentifier) {
     this.caseIdentifier = caseIdentifier;
  }

  public InfectiousExposureInvestigationCaseIdentifierChoice getCaseIdentifier() {
     return this.caseIdentifier ;
  }

  public void setActivityCategoryValue(String activityCategoryValue) {
     this.activityCategoryValue = activityCategoryValue;
  }

  public String getActivityCategoryValue() {
     return this.activityCategoryValue ;
  }

  public void setProximityOfContactValue(String proximityOfContactValue) {
     this.proximityOfContactValue = proximityOfContactValue;
  }

  public String getProximityOfContactValue() {
     return this.proximityOfContactValue ;
  }

  public void setContributoryFactors(List<Cluster> contributoryFactors) {
     this.contributoryFactors = contributoryFactors;
  }

  public List<Cluster> getContributoryFactors() {
     return this.contributoryFactors ;
  }

  public void setAnatomicalLocationDetails(List<Cluster> anatomicalLocationDetails) {
     this.anatomicalLocationDetails = anatomicalLocationDetails;
  }

  public List<Cluster> getAnatomicalLocationDetails() {
     return this.anatomicalLocationDetails ;
  }

  public void setDurationOfExposure(
      InfectiousExposureInvestigationDurationOfExposureChoice durationOfExposure) {
     this.durationOfExposure = durationOfExposure;
  }

  public InfectiousExposureInvestigationDurationOfExposureChoice getDurationOfExposure() {
     return this.durationOfExposure ;
  }

  public void setDateTimeOfFirstExposure(
      List<InfectiousExposureInvestigationDateTimeOfFirstExposureChoice> dateTimeOfFirstExposure) {
     this.dateTimeOfFirstExposure = dateTimeOfFirstExposure;
  }

  public List<InfectiousExposureInvestigationDateTimeOfFirstExposureChoice> getDateTimeOfFirstExposure(
      ) {
     return this.dateTimeOfFirstExposure ;
  }
}
