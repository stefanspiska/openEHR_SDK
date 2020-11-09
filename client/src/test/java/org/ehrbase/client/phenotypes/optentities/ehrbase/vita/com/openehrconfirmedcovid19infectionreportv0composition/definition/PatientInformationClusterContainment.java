package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.time.temporal.TemporalAmount;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class PatientInformationClusterContainment extends Containment {
  public SelectAqlField<PatientInformationCluster> PATIENT_INFORMATION_CLUSTER = new AqlFieldImp<PatientInformationCluster>(PatientInformationCluster.class, "", "PatientInformationCluster", PatientInformationCluster.class, this);

  public SelectAqlField<TemporalAmount> AGE_VALUE = new AqlFieldImp<TemporalAmount>(PatientInformationCluster.class, "/items[at0008]/value|value", "ageValue", TemporalAmount.class, this);

  public SelectAqlField<BirthSexDefiningcode> BIRTH_SEX_DEFININGCODE = new AqlFieldImp<BirthSexDefiningcode>(PatientInformationCluster.class, "/items[at0002]/value|defining_code", "birthSexDefiningcode", BirthSexDefiningcode.class, this);

  private PatientInformationClusterContainment() {
    super("openEHR-EHR-CLUSTER.person_anonymised_parent.v0");
  }

  public static PatientInformationClusterContainment getInstance() {
    return new PatientInformationClusterContainment();
  }
}
