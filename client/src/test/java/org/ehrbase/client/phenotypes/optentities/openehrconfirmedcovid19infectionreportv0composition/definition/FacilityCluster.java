package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.organisation_cc.v0")
public class FacilityCluster {
  @Path("/items[at0014]")
  private List<Cluster> telecom;

  @Path("/items[at0012]/value|value")
  private String facilityNameValue;

  @Path("/items[at0017]")
  private List<Cluster> partOf;

  @Path("/items[at0016]")
  private List<Cluster> contact;

  @Path("/items[openEHR-EHR-CLUSTER.address_cc.v0]")
  private List<AddressCluster> address;

  @Path("/items[at0018]")
  private List<Cluster> identifier;

  public void setTelecom(List<Cluster> telecom) {
     this.telecom = telecom;
  }

  public List<Cluster> getTelecom() {
     return this.telecom ;
  }

  public void setFacilityNameValue(String facilityNameValue) {
     this.facilityNameValue = facilityNameValue;
  }

  public String getFacilityNameValue() {
     return this.facilityNameValue ;
  }

  public void setPartOf(List<Cluster> partOf) {
     this.partOf = partOf;
  }

  public List<Cluster> getPartOf() {
     return this.partOf ;
  }

  public void setContact(List<Cluster> contact) {
     this.contact = contact;
  }

  public List<Cluster> getContact() {
     return this.contact ;
  }

  public void setAddress(List<AddressCluster> address) {
     this.address = address;
  }

  public List<AddressCluster> getAddress() {
     return this.address ;
  }

  public void setIdentifier(List<Cluster> identifier) {
     this.identifier = identifier;
  }

  public List<Cluster> getIdentifier() {
     return this.identifier ;
  }
}
