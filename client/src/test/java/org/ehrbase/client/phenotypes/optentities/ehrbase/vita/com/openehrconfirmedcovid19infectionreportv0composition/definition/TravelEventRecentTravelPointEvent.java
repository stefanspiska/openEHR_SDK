package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("POINT_EVENT")
public class TravelEventRecentTravelPointEvent implements TravelEventRecentTravelChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0008]")
  private List<TravelEventTripDetailCluster> tripDetail;

  @Path("/data[at0003]/items[at0004]/value|defining_code")
  private RecentTravelDefiningcode recentTravelDefiningcode;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setTripDetail(List<TravelEventTripDetailCluster> tripDetail) {
     this.tripDetail = tripDetail;
  }

  public List<TravelEventTripDetailCluster> getTripDetail() {
     return this.tripDetail ;
  }

  public void setRecentTravelDefiningcode(RecentTravelDefiningcode recentTravelDefiningcode) {
     this.recentTravelDefiningcode = recentTravelDefiningcode;
  }

  public RecentTravelDefiningcode getRecentTravelDefiningcode() {
     return this.recentTravelDefiningcode ;
  }
}
