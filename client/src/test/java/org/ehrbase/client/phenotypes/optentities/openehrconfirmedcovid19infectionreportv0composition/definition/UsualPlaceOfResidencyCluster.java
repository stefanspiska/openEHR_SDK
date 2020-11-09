package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.address_cc.v0")
public class UsualPlaceOfResidencyCluster {
  @Path("/items[at0001]/value|defining_code")
  private UseDefiningcode2 useDefiningcode;

  @Path("/items[at0015]/value|value")
  private String countryValue;

  public void setUseDefiningcode(UseDefiningcode2 useDefiningcode) {
     this.useDefiningcode = useDefiningcode;
  }

  public UseDefiningcode2 getUseDefiningcode() {
     return this.useDefiningcode ;
  }

  public void setCountryValue(String countryValue) {
     this.countryValue = countryValue;
  }

  public String getCountryValue() {
     return this.countryValue ;
  }
}
