package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class PostTestProcedureScreeningSpecificProcedureCluster {
  @Path("/items[at0005]/value|defining_code")
  private PerformedDefiningcode performedDefiningcode;

  @Path("/items[at0006]/value|value")
  private TemporalAccessor dateValue;

  @Path("/items[at0004]/value|value")
  private String procedureNameValue;

  @Path("/items[at0035]/value|value")
  private String commentValue;

  @Path("/items[at0036]")
  private List<Cluster> additionalDetails;

  public void setPerformedDefiningcode(PerformedDefiningcode performedDefiningcode) {
     this.performedDefiningcode = performedDefiningcode;
  }

  public PerformedDefiningcode getPerformedDefiningcode() {
     return this.performedDefiningcode ;
  }

  public void setDateValue(TemporalAccessor dateValue) {
     this.dateValue = dateValue;
  }

  public TemporalAccessor getDateValue() {
     return this.dateValue ;
  }

  public void setProcedureNameValue(String procedureNameValue) {
     this.procedureNameValue = procedureNameValue;
  }

  public String getProcedureNameValue() {
     return this.procedureNameValue ;
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
