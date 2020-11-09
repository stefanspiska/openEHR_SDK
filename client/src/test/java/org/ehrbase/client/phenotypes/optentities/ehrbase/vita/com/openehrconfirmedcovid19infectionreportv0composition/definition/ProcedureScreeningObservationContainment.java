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

public class ProcedureScreeningObservationContainment extends Containment {
  public SelectAqlField<ProcedureScreeningObservation> PROCEDURE_SCREENING_OBSERVATION = new AqlFieldImp<ProcedureScreeningObservation>(ProcedureScreeningObservation.class, "", "ProcedureScreeningObservation", ProcedureScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProcedureScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProcedureScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ProcedureScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<ProcedureScreeningAtTestingChoice> AT_TESTING = new ListAqlFieldImp<ProcedureScreeningAtTestingChoice>(ProcedureScreeningObservation.class, "/data[at0001]/events[at0002]", "atTesting", ProcedureScreeningAtTestingChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProcedureScreeningObservation.class, "/language", "language", Language.class, this);

  private ProcedureScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.procedure_screening.v0");
  }

  public static ProcedureScreeningObservationContainment getInstance() {
    return new ProcedureScreeningObservationContainment();
  }
}
