package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.phenotypes.optentities.shareddefinition.MathFunctionDefiningcode;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("INTERVAL_EVENT")
public class TravelEventRecentTravelIntervalEvent implements TravelEventRecentTravelChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0004]/value|defining_code")
  private RecentTravelDefiningcode recentTravelDefiningcode;

  @Path("/math_function|defining_code")
  private MathFunctionDefiningcode mathFunctionDefiningcode;

  @Path("/data[at0003]/items[at0008]")
  private List<TravelEventTripDetailCluster> tripDetail;

  @Path("/width|value")
  private TemporalAmount widthValue;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setRecentTravelDefiningcode(RecentTravelDefiningcode recentTravelDefiningcode) {
     this.recentTravelDefiningcode = recentTravelDefiningcode;
  }

  public RecentTravelDefiningcode getRecentTravelDefiningcode() {
     return this.recentTravelDefiningcode ;
  }

  public void setMathFunctionDefiningcode(MathFunctionDefiningcode mathFunctionDefiningcode) {
     this.mathFunctionDefiningcode = mathFunctionDefiningcode;
  }

  public MathFunctionDefiningcode getMathFunctionDefiningcode() {
     return this.mathFunctionDefiningcode ;
  }

  public void setTripDetail(List<TravelEventTripDetailCluster> tripDetail) {
     this.tripDetail = tripDetail;
  }

  public List<TravelEventTripDetailCluster> getTripDetail() {
     return this.tripDetail ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }
}
