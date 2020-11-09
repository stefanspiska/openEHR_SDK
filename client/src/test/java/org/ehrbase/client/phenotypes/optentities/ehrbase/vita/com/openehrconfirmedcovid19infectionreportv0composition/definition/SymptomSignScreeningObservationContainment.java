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

public class SymptomSignScreeningObservationContainment extends Containment {
  public SelectAqlField<SymptomSignScreeningObservation> SYMPTOM_SIGN_SCREENING_OBSERVATION = new AqlFieldImp<SymptomSignScreeningObservation>(SymptomSignScreeningObservation.class, "", "SymptomSignScreeningObservation", SymptomSignScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(SymptomSignScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(SymptomSignScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(SymptomSignScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<SymptomSignScreeningAtTestChoice> AT_TEST = new ListAqlFieldImp<SymptomSignScreeningAtTestChoice>(SymptomSignScreeningObservation.class, "/data[at0001]/events[at0002]", "atTest", SymptomSignScreeningAtTestChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SymptomSignScreeningObservation.class, "/language", "language", Language.class, this);

  private SymptomSignScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.symptom_sign_screening.v0");
  }

  public static SymptomSignScreeningObservationContainment getInstance() {
    return new SymptomSignScreeningObservationContainment();
  }
}
