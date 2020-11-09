package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.lang.Long;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-EVALUATION.infectious_exposure.v0")
public class InfectiousExposureInvestigationEvaluation {
  @Path("/data[at0001]/items[at0030]/value|magnitude")
  private Long totalNumberOfContactsMagnitude;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/items[at0002]/value|defining_code")
  private InfectiousAgentDefiningcode infectiousAgentDefiningcode;

  @Path("/data[at0001]/items[at0017]")
  private List<Cluster> exposedIndividualDetails;

  @Path("/language")
  private Language language;

  @Path("/data[at0001]/items[at0005]")
  private List<InfectiousExposureInvestigationSpecificExposureDetailsCluster> specificExposureDetails;

  public void setTotalNumberOfContactsMagnitude(Long totalNumberOfContactsMagnitude) {
     this.totalNumberOfContactsMagnitude = totalNumberOfContactsMagnitude;
  }

  public Long getTotalNumberOfContactsMagnitude() {
     return this.totalNumberOfContactsMagnitude ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setInfectiousAgentDefiningcode(
      InfectiousAgentDefiningcode infectiousAgentDefiningcode) {
     this.infectiousAgentDefiningcode = infectiousAgentDefiningcode;
  }

  public InfectiousAgentDefiningcode getInfectiousAgentDefiningcode() {
     return this.infectiousAgentDefiningcode ;
  }

  public void setExposedIndividualDetails(List<Cluster> exposedIndividualDetails) {
     this.exposedIndividualDetails = exposedIndividualDetails;
  }

  public List<Cluster> getExposedIndividualDetails() {
     return this.exposedIndividualDetails ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setSpecificExposureDetails(
      List<InfectiousExposureInvestigationSpecificExposureDetailsCluster> specificExposureDetails) {
     this.specificExposureDetails = specificExposureDetails;
  }

  public List<InfectiousExposureInvestigationSpecificExposureDetailsCluster> getSpecificExposureDetails(
      ) {
     return this.specificExposureDetails ;
  }
}
