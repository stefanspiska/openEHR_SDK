package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.util.List;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-SECTION.adhoc.v1")
public class ReportingSection {
  @Path("/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1 and name/value='First test']")
  private List<FirstTestObservation> firstTest;

  public void setFirstTest(List<FirstTestObservation> firstTest) {
     this.firstTest = firstTest;
  }

  public List<FirstTestObservation> getFirstTest() {
     return this.firstTest ;
  }
}
