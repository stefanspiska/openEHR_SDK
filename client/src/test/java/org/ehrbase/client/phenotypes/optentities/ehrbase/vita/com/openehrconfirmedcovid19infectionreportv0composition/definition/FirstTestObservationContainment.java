package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import ehrbase.vita.com.shareddefinition.Language;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class FirstTestObservationContainment extends Containment {
  public SelectAqlField<FirstTestObservation> FIRST_TEST_OBSERVATION = new AqlFieldImp<FirstTestObservation>(FirstTestObservation.class, "", "FirstTestObservation", FirstTestObservation.class, this);

  public ListSelectAqlField<Cluster> TEST_DETAILS = new ListAqlFieldImp<Cluster>(FirstTestObservation.class, "/protocol[at0004]/items[at0110]", "testDetails", Cluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(FirstTestObservation.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(FirstTestObservation.class, "/protocol[at0004]/items[at0117]", "erweiterung", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(FirstTestObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(FirstTestObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<FirstTestFirstTestChoice> FIRST_TEST = new ListAqlFieldImp<FirstTestFirstTestChoice>(FirstTestObservation.class, "/data[at0001]/events[at0002]", "firstTest", FirstTestFirstTestChoice.class, this);

  public SelectAqlField<Cluster> LABOR_WELCHES_DEN_UNTERSUCHUNGSAUFTRAG_ANNIMMT = new AqlFieldImp<Cluster>(FirstTestObservation.class, "/protocol[at0004]/items[at0017]", "laborWelchesDenUntersuchungsauftragAnnimmt", Cluster.class, this);

  private FirstTestObservationContainment() {
    super("openEHR-EHR-OBSERVATION.laboratory_test_result.v1");
  }

  public static FirstTestObservationContainment getInstance() {
    return new FirstTestObservationContainment();
  }
}
