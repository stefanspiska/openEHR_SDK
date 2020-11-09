package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class TravelEventTripDetailCluster {
  @Path("/items[at0022]/value|value")
  private String descriptionValue;

  @Path("/items[at0010]")
  private List<TravelEventTravelDestinationCluster> travelDestination;

  @Path("/items[at0009]/value|value")
  private TemporalAccessor dateOfDepartureValue;

  @Path("/items[at0025]")
  private List<Cluster> additionalTripDetails;

  @Path("/items[at0020]/value|value")
  private String commentValue;

  @Path("/items[at0018]")
  private List<TravelEventReturnTransportElement> returnTransport;

  @Path("/items[at0019]/value|value")
  private TemporalAccessor dateOfReturnValue;

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setTravelDestination(List<TravelEventTravelDestinationCluster> travelDestination) {
     this.travelDestination = travelDestination;
  }

  public List<TravelEventTravelDestinationCluster> getTravelDestination() {
     return this.travelDestination ;
  }

  public void setDateOfDepartureValue(TemporalAccessor dateOfDepartureValue) {
     this.dateOfDepartureValue = dateOfDepartureValue;
  }

  public TemporalAccessor getDateOfDepartureValue() {
     return this.dateOfDepartureValue ;
  }

  public void setAdditionalTripDetails(List<Cluster> additionalTripDetails) {
     this.additionalTripDetails = additionalTripDetails;
  }

  public List<Cluster> getAdditionalTripDetails() {
     return this.additionalTripDetails ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setReturnTransport(List<TravelEventReturnTransportElement> returnTransport) {
     this.returnTransport = returnTransport;
  }

  public List<TravelEventReturnTransportElement> getReturnTransport() {
     return this.returnTransport ;
  }

  public void setDateOfReturnValue(TemporalAccessor dateOfReturnValue) {
     this.dateOfReturnValue = dateOfReturnValue;
  }

  public TemporalAccessor getDateOfReturnValue() {
     return this.dateOfReturnValue ;
  }
}
