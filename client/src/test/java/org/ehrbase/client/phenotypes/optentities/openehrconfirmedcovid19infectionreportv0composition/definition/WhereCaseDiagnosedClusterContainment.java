package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class WhereCaseDiagnosedClusterContainment extends Containment {
  public SelectAqlField<WhereCaseDiagnosedCluster> WHERE_CASE_DIAGNOSED_CLUSTER = new AqlFieldImp<WhereCaseDiagnosedCluster>(WhereCaseDiagnosedCluster.class, "", "WhereCaseDiagnosedCluster", WhereCaseDiagnosedCluster.class, this);

  public SelectAqlField<UseDefiningcode> USE_DEFININGCODE = new AqlFieldImp<UseDefiningcode>(WhereCaseDiagnosedCluster.class, "/items[at0001]/value|defining_code", "useDefiningcode", UseDefiningcode.class, this);

  public SelectAqlField<String> ADMIN_LEVEL1_PROVINCE_VALUE = new AqlFieldImp<String>(WhereCaseDiagnosedCluster.class, "/items[at0013]/value|value", "adminLevel1ProvinceValue", String.class, this);

  public SelectAqlField<String> COUNTRY_VALUE = new AqlFieldImp<String>(WhereCaseDiagnosedCluster.class, "/items[at0015]/value|value", "countryValue", String.class, this);

  private WhereCaseDiagnosedClusterContainment() {
    super("openEHR-EHR-CLUSTER.address_cc.v0");
  }

  public static WhereCaseDiagnosedClusterContainment getInstance() {
    return new WhereCaseDiagnosedClusterContainment();
  }
}
