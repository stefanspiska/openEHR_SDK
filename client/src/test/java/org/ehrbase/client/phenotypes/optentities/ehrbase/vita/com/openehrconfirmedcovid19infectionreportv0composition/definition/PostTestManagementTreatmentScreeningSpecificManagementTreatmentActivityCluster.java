package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class PostTestManagementTreatmentScreeningSpecificManagementTreatmentActivityCluster {
  @Path("/items[at0005]/value|defining_code")
  private ActionedDefiningcode actionedDefiningcode;

  @Path("/items[at0006]/value|value")
  private TemporalAccessor dateFirstAdmittedValue;

  @Path("/items[at0004]/value|value")
  private String activityNameValue;

  @Path("/items[at0035]/value|value")
  private String commentValue;

  @Path("/items[at0036]")
  private List<Cluster> additionalDetails;

  public void setActionedDefiningcode(ActionedDefiningcode actionedDefiningcode) {
     this.actionedDefiningcode = actionedDefiningcode;
  }

  public ActionedDefiningcode getActionedDefiningcode() {
     return this.actionedDefiningcode ;
  }

  public void setDateFirstAdmittedValue(TemporalAccessor dateFirstAdmittedValue) {
     this.dateFirstAdmittedValue = dateFirstAdmittedValue;
  }

  public TemporalAccessor getDateFirstAdmittedValue() {
     return this.dateFirstAdmittedValue ;
  }

  public void setActivityNameValue(String activityNameValue) {
     this.activityNameValue = activityNameValue;
  }

  public String getActivityNameValue() {
     return this.activityNameValue ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }
}
