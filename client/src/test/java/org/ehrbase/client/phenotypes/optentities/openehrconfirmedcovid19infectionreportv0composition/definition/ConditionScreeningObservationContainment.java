package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class ConditionScreeningObservationContainment extends Containment {
  public SelectAqlField<ConditionScreeningObservation> CONDITION_SCREENING_OBSERVATION = new AqlFieldImp<ConditionScreeningObservation>(ConditionScreeningObservation.class, "", "ConditionScreeningObservation", ConditionScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ConditionScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ConditionScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ConditionScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<ConditionScreeningAtTestingChoice> AT_TESTING = new ListAqlFieldImp<ConditionScreeningAtTestingChoice>(ConditionScreeningObservation.class, "/data[at0001]/events[at0002]", "atTesting", ConditionScreeningAtTestingChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ConditionScreeningObservation.class, "/language", "language", Language.class, this);

  private ConditionScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.condition_screening.v0");
  }

  public static ConditionScreeningObservationContainment getInstance() {
    return new ConditionScreeningObservationContainment();
  }
}
