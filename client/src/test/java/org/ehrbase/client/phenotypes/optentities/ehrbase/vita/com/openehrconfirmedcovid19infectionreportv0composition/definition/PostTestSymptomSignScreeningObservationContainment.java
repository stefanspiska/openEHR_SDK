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

public class PostTestSymptomSignScreeningObservationContainment extends Containment {
  public SelectAqlField<PostTestSymptomSignScreeningObservation> POST_TEST_SYMPTOM_SIGN_SCREENING_OBSERVATION = new AqlFieldImp<PostTestSymptomSignScreeningObservation>(PostTestSymptomSignScreeningObservation.class, "", "PostTestSymptomSignScreeningObservation", PostTestSymptomSignScreeningObservation.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PostTestSymptomSignScreeningObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PostTestSymptomSignScreeningObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(PostTestSymptomSignScreeningObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<PostTestSymptomSignScreeningPostTestingChoice> POST_TESTING = new ListAqlFieldImp<PostTestSymptomSignScreeningPostTestingChoice>(PostTestSymptomSignScreeningObservation.class, "/data[at0001]/events[at0002]", "postTesting", PostTestSymptomSignScreeningPostTestingChoice.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PostTestSymptomSignScreeningObservation.class, "/language", "language", Language.class, this);

  private PostTestSymptomSignScreeningObservationContainment() {
    super("openEHR-EHR-OBSERVATION.symptom_sign_screening.v0");
  }

  public static PostTestSymptomSignScreeningObservationContainment getInstance() {
    return new PostTestSymptomSignScreeningObservationContainment();
  }
}
