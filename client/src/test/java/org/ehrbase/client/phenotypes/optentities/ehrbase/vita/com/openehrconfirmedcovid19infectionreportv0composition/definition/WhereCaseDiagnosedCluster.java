package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.address_cc.v0")
public class WhereCaseDiagnosedCluster {
  @Path("/items[at0001]/value|defining_code")
  private UseDefiningcode useDefiningcode;

  @Path("/items[at0013]/value|value")
  private String adminLevel1ProvinceValue;

  @Path("/items[at0015]/value|value")
  private String countryValue;

  public void setUseDefiningcode(UseDefiningcode useDefiningcode) {
     this.useDefiningcode = useDefiningcode;
  }

  public UseDefiningcode getUseDefiningcode() {
     return this.useDefiningcode ;
  }

  public void setAdminLevel1ProvinceValue(String adminLevel1ProvinceValue) {
     this.adminLevel1ProvinceValue = adminLevel1ProvinceValue;
  }

  public String getAdminLevel1ProvinceValue() {
     return this.adminLevel1ProvinceValue ;
  }

  public void setCountryValue(String countryValue) {
     this.countryValue = countryValue;
  }

  public String getCountryValue() {
     return this.countryValue ;
  }
}
