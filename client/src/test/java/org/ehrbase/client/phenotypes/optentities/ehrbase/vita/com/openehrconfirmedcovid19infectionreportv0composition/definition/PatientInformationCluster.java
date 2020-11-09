package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAmount;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-CLUSTER.person_anonymised_parent.v0")
public class PatientInformationCluster {
  @Path("/items[at0008]/value|value")
  private TemporalAmount ageValue;

  @Path("/items[at0002]/value|defining_code")
  private BirthSexDefiningcode birthSexDefiningcode;

  public void setAgeValue(TemporalAmount ageValue) {
     this.ageValue = ageValue;
  }

  public TemporalAmount getAgeValue() {
     return this.ageValue ;
  }

  public void setBirthSexDefiningcode(BirthSexDefiningcode birthSexDefiningcode) {
     this.birthSexDefiningcode = birthSexDefiningcode;
  }

  public BirthSexDefiningcode getBirthSexDefiningcode() {
     return this.birthSexDefiningcode ;
  }
}
