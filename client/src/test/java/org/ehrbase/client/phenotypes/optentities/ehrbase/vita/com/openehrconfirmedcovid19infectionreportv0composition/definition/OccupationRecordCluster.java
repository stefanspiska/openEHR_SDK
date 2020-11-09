package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.occupation_record.v1")
public class OccupationRecordCluster {
  @Path("/items[at0005]/value|value")
  private String jobTitleRoleValue;

  @Path("/items[openEHR-EHR-CLUSTER.organisation_cc.v0 and name/value='Facility']")
  private List<FacilityCluster> facility;

  @Path("/items[at0018]")
  private List<Cluster> additionalDetails;

  public void setJobTitleRoleValue(String jobTitleRoleValue) {
     this.jobTitleRoleValue = jobTitleRoleValue;
  }

  public String getJobTitleRoleValue() {
     return this.jobTitleRoleValue ;
  }

  public void setFacility(List<FacilityCluster> facility) {
     this.facility = facility;
  }

  public List<FacilityCluster> getFacility() {
     return this.facility ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }
}
