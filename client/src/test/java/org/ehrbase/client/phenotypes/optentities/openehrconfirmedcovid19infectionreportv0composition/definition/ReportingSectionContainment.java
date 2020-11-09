package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class ReportingSectionContainment extends Containment {
  public SelectAqlField<ReportingSection> REPORTING_SECTION = new AqlFieldImp<ReportingSection>(ReportingSection.class, "", "ReportingSection", ReportingSection.class, this);

  public ListSelectAqlField<FirstTestObservation> FIRST_TEST = new ListAqlFieldImp<FirstTestObservation>(ReportingSection.class, "/items[openEHR-EHR-OBSERVATION.laboratory_test_result.v1 and name/value='First test']", "firstTest", FirstTestObservation.class, this);

  private ReportingSectionContainment() {
    super("openEHR-EHR-SECTION.adhoc.v1");
  }

  public static ReportingSectionContainment getInstance() {
    return new ReportingSectionContainment();
  }
}
