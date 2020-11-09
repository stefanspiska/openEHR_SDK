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

public class PostTestProcedureScreeningObservationContainment extends Containment {
  public SelectAqlField<PostTestProcedureScreeningObservation> POST_TEST_PROCEDURE_SCREENING_OBSERVATION = new AqlFieldImp<PostTestProcedureScreeningObservation>(PostTestProcedureScreeningObservation.class, "", "PostTestProcedureScreeningObservation", PostTestProcedureScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PostTestProcedureScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PostTestProcedureScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(PostTestProcedureScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<PostTestProcedureScreeningPostTestingChoice> POST_TESTING = new ListAqlFieldImp<PostTestProcedureScreeningPostTestingChoice>(PostTestProcedureScreeningObservation.class, "/data[at0001]/events[at0002]", "postTesting", PostTestProcedureScreeningPostTestingChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PostTestProcedureScreeningObservation.class, "/language", "language", Language.class, this);

  private PostTestProcedureScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.procedure_screening.v0");
  }

  public static PostTestProcedureScreeningObservationContainment getInstance() {
    return new PostTestProcedureScreeningObservationContainment();
  }
}
