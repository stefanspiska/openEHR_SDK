package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class ConditionScreeningOtherConditionCluster {
  @Path("/items[at0005]/value|defining_code")
  private PresenceDefiningcode2 presenceDefiningcode;

  @Path("/items[at0004]/value|value")
  private String conditionNameValue;

  @Path("/items[at0039]")
  private List<Cluster> additionalDetails;

  public void setPresenceDefiningcode(PresenceDefiningcode2 presenceDefiningcode) {
     this.presenceDefiningcode = presenceDefiningcode;
  }

  public PresenceDefiningcode2 getPresenceDefiningcode() {
     return this.presenceDefiningcode ;
  }

  public void setConditionNameValue(String conditionNameValue) {
     this.conditionNameValue = conditionNameValue;
  }

  public String getConditionNameValue() {
     return this.conditionNameValue ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }
}
