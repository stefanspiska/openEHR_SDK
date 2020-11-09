package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import ehrbase.vita.com.shareddefinition.Language;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class OccupationEvaluationContainment extends Containment {
  public SelectAqlField<OccupationEvaluation> OCCUPATION_EVALUATION = new AqlFieldImp<OccupationEvaluation>(OccupationEvaluation.class, "", "OccupationEvaluation", OccupationEvaluation.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(OccupationEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(OccupationEvaluation.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<OccupationRecordCluster> OCCUPATION_RECORD = new ListAqlFieldImp<OccupationRecordCluster>(OccupationEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.occupation_record.v1]", "occupationRecord", OccupationRecordCluster.class, this);

  public ListSelectAqlField<Cluster> ADDITIONAL_DETAILS = new ListAqlFieldImp<Cluster>(OccupationEvaluation.class, "/data[at0001]/items[at0005]", "additionalDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(OccupationEvaluation.class, "/protocol[at0007]/items[at0008]", "extension", Cluster.class, this);

  private OccupationEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.occupation_summary.v1");
  }

  public static OccupationEvaluationContainment getInstance() {
    return new OccupationEvaluationContainment();
  }
}
