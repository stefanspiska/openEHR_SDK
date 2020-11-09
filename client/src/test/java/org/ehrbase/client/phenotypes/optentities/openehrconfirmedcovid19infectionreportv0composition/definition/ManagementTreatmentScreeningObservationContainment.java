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

public class ManagementTreatmentScreeningObservationContainment extends Containment {
  public SelectAqlField<ManagementTreatmentScreeningObservation> MANAGEMENT_TREATMENT_SCREENING_OBSERVATION = new AqlFieldImp<ManagementTreatmentScreeningObservation>(ManagementTreatmentScreeningObservation.class, "", "ManagementTreatmentScreeningObservation", ManagementTreatmentScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ManagementTreatmentScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ManagementTreatmentScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ManagementTreatmentScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<ManagementTreatmentScreeningAtTestingChoice> AT_TESTING = new ListAqlFieldImp<ManagementTreatmentScreeningAtTestingChoice>(ManagementTreatmentScreeningObservation.class, "/data[at0001]/events[at0002]", "atTesting", ManagementTreatmentScreeningAtTestingChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ManagementTreatmentScreeningObservation.class, "/language", "language", Language.class, this);

  private ManagementTreatmentScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.management_screening.v0");
  }

  public static ManagementTreatmentScreeningObservationContainment getInstance() {
    return new ManagementTreatmentScreeningObservationContainment();
  }
}
