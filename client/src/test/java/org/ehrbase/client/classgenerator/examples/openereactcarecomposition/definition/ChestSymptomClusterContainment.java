package org.ehrbase.client.classgenerator.examples.openereactcarecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datatypes.CodePhrase;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;

public class ChestSymptomClusterContainment extends Containment {
  public SelectAqlField<ChestSymptomCluster> CHEST_SYMPTOM_CLUSTER = new AqlFieldImp<ChestSymptomCluster>(ChestSymptomCluster.class, "", "ChestSymptomCluster", ChestSymptomCluster.class, this);

  public SelectAqlField<CodePhrase> SYMPTOM_SIGN_NAME_DEFINING_CODE = new AqlFieldImp<CodePhrase>(ChestSymptomCluster.class, "/items[at0001.1]/value|defining_code", "symptomSignNameDefiningCode", CodePhrase.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(ChestSymptomCluster.class, "/items[at0147]", "structuredBodySite", Cluster.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ChestSymptomCluster.class, "/items[at0153]", "specificDetails", Cluster.class, this);

  public ListSelectAqlField<Cluster> PREVIOUS_EPISODES = new ListAqlFieldImp<Cluster>(ChestSymptomCluster.class, "/items[at0146]", "previousEpisodes", Cluster.class, this);

  public ListSelectAqlField<Cluster> ASSOCIATED_SYMPTOM_SIGN = new ListAqlFieldImp<Cluster>(ChestSymptomCluster.class, "/items[at0063]", "associatedSymptomSign", Cluster.class, this);

  public SelectAqlField<PresenceDefiningCode> PRESENCE_DEFINING_CODE = new AqlFieldImp<PresenceDefiningCode>(ChestSymptomCluster.class, "/items[at0.1]/value|defining_code", "presenceDefiningCode", PresenceDefiningCode.class, this);

  private ChestSymptomClusterContainment() {
    super("openEHR-EHR-CLUSTER.symptom_sign-cvid.v0");
  }

  public static ChestSymptomClusterContainment getInstance() {
    return new ChestSymptomClusterContainment();
  }
}
