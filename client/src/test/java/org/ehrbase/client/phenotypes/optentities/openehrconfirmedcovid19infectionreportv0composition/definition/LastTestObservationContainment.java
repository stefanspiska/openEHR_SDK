package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class LastTestObservationContainment extends Containment {
  public SelectAqlField<LastTestObservation> LAST_TEST_OBSERVATION = new AqlFieldImp<LastTestObservation>(LastTestObservation.class, "", "LastTestObservation", LastTestObservation.class, this);

  public SelectAqlField<LastTestLaborinterneKennzeichnungChoice> LABORINTERNE_KENNZEICHNUNG = new AqlFieldImp<LastTestLaborinterneKennzeichnungChoice>(LastTestObservation.class, "/protocol[at0004]/items[at0068]/value", "laborinterneKennzeichnung", LastTestLaborinterneKennzeichnungChoice.class, this);

  public ListSelectAqlField<Cluster> TEST_DETAILS = new ListAqlFieldImp<Cluster>(LastTestObservation.class, "/protocol[at0004]/items[at0110]", "testDetails", Cluster.class, this);

  public ListSelectAqlField<LastTestDetailsDerTestanforderungCluster> DETAILS_DER_TESTANFORDERUNG = new ListAqlFieldImp<LastTestDetailsDerTestanforderungCluster>(LastTestObservation.class, "/protocol[at0004]/items[at0094]", "detailsDerTestanforderung", LastTestDetailsDerTestanforderungCluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(LastTestObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<LastTestTestmethodeChoice> TESTMETHODE = new AqlFieldImp<LastTestTestmethodeChoice>(LastTestObservation.class, "/protocol[at0004]/items[at0121]/value", "testmethode", LastTestTestmethodeChoice.class, this);

  public ListSelectAqlField<Cluster> ERWEITERUNG = new ListAqlFieldImp<Cluster>(LastTestObservation.class, "/protocol[at0004]/items[at0117]", "erweiterung", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(LastTestObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(LastTestObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<LastTestLastTestChoice> LAST_TEST = new ListAqlFieldImp<LastTestLastTestChoice>(LastTestObservation.class, "/data[at0001]/events[at0002]", "lastTest", LastTestLastTestChoice.class, this);

  public SelectAqlField<Boolean> POINT_OF_CARE_TEST_VALUE = new AqlFieldImp<Boolean>(LastTestObservation.class, "/protocol[at0004]/items[at0111]/value|value", "pointOfCareTestValue", Boolean.class, this);

  public SelectAqlField<Cluster> LABOR_WELCHES_DEN_UNTERSUCHUNGSAUFTRAG_ANNIMMT = new AqlFieldImp<Cluster>(LastTestObservation.class, "/protocol[at0004]/items[at0017]", "laborWelchesDenUntersuchungsauftragAnnimmt", Cluster.class, this);

  private LastTestObservationContainment() {
    super("openEHR-EHR-OBSERVATION.laboratory_test_result.v1");
  }

  public static LastTestObservationContainment getInstance() {
    return new LastTestObservationContainment();
  }
}
