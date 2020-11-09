package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.lang.Long;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class InfectiousExposureInvestigationEvaluationContainment extends Containment {
  public SelectAqlField<InfectiousExposureInvestigationEvaluation> INFECTIOUS_EXPOSURE_INVESTIGATION_EVALUATION = new AqlFieldImp<InfectiousExposureInvestigationEvaluation>(InfectiousExposureInvestigationEvaluation.class, "", "InfectiousExposureInvestigationEvaluation", InfectiousExposureInvestigationEvaluation.class, this);

  public SelectAqlField<Long> TOTAL_NUMBER_OF_CONTACTS_MAGNITUDE = new AqlFieldImp<Long>(InfectiousExposureInvestigationEvaluation.class, "/data[at0001]/items[at0030]/value|magnitude", "totalNumberOfContactsMagnitude", Long.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(InfectiousExposureInvestigationEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<InfectiousAgentDefiningcode> INFECTIOUS_AGENT_DEFININGCODE = new AqlFieldImp<InfectiousAgentDefiningcode>(InfectiousExposureInvestigationEvaluation.class, "/data[at0001]/items[at0002]/value|defining_code", "infectiousAgentDefiningcode", InfectiousAgentDefiningcode.class, this);

  public ListSelectAqlField<Cluster> EXPOSED_INDIVIDUAL_DETAILS = new ListAqlFieldImp<Cluster>(InfectiousExposureInvestigationEvaluation.class, "/data[at0001]/items[at0017]", "exposedIndividualDetails", Cluster.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(InfectiousExposureInvestigationEvaluation.class, "/language", "language", Language.class, this);

  public ListSelectAqlField<InfectiousExposureInvestigationSpecificExposureDetailsCluster> SPECIFIC_EXPOSURE_DETAILS = new ListAqlFieldImp<InfectiousExposureInvestigationSpecificExposureDetailsCluster>(InfectiousExposureInvestigationEvaluation.class, "/data[at0001]/items[at0005]", "specificExposureDetails", InfectiousExposureInvestigationSpecificExposureDetailsCluster.class, this);

  private InfectiousExposureInvestigationEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.infectious_exposure.v0");
  }

  public static InfectiousExposureInvestigationEvaluationContainment getInstance() {
    return new InfectiousExposureInvestigationEvaluationContainment();
  }
}
