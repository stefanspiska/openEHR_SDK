package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class TravelEventTravelDestinationCluster {
  @Path("/items[at0014]/value|value")
  private TemporalAccessor dateOfEntryValue;

  @Path("/items[at0024]")
  private List<Cluster> additionalDestinationDetails;

  @Path("/items[at0012]/value|value")
  private String stateRegionValue;

  @Path("/items[at0011]/value|value")
  private String countryValue;

  @Path("/items[at0013]/value|value")
  private String cityValue;

  @Path("/items[at0015]/value|value")
  private TemporalAccessor dateOfExitValue;

  @Path("/items[at0016]/value|value")
  private String descriptionValue;

  @Path("/items[at0017]/value|value")
  private String commentValue;

  public void setDateOfEntryValue(TemporalAccessor dateOfEntryValue) {
     this.dateOfEntryValue = dateOfEntryValue;
  }

  public TemporalAccessor getDateOfEntryValue() {
     return this.dateOfEntryValue ;
  }

  public void setAdditionalDestinationDetails(List<Cluster> additionalDestinationDetails) {
     this.additionalDestinationDetails = additionalDestinationDetails;
  }

  public List<Cluster> getAdditionalDestinationDetails() {
     return this.additionalDestinationDetails ;
  }

  public void setStateRegionValue(String stateRegionValue) {
     this.stateRegionValue = stateRegionValue;
  }

  public String getStateRegionValue() {
     return this.stateRegionValue ;
  }

  public void setCountryValue(String countryValue) {
     this.countryValue = countryValue;
  }

  public String getCountryValue() {
     return this.countryValue ;
  }

  public void setCityValue(String cityValue) {
     this.cityValue = cityValue;
  }

  public String getCityValue() {
     return this.cityValue ;
  }

  public void setDateOfExitValue(TemporalAccessor dateOfExitValue) {
     this.dateOfExitValue = dateOfExitValue;
  }

  public TemporalAccessor getDateOfExitValue() {
     return this.dateOfExitValue ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }
}
