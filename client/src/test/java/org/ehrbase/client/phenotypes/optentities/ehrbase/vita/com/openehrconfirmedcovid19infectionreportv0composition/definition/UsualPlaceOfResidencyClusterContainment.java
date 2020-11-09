package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class UsualPlaceOfResidencyClusterContainment extends Containment {
  public SelectAqlField<UsualPlaceOfResidencyCluster> USUAL_PLACE_OF_RESIDENCY_CLUSTER = new AqlFieldImp<UsualPlaceOfResidencyCluster>(UsualPlaceOfResidencyCluster.class, "", "UsualPlaceOfResidencyCluster", UsualPlaceOfResidencyCluster.class, this);

  public SelectAqlField<UseDefiningcode2> USE_DEFININGCODE = new AqlFieldImp<UseDefiningcode2>(UsualPlaceOfResidencyCluster.class, "/items[at0001]/value|defining_code", "useDefiningcode", UseDefiningcode2.class, this);

  public SelectAqlField<String> COUNTRY_VALUE = new AqlFieldImp<String>(UsualPlaceOfResidencyCluster.class, "/items[at0015]/value|value", "countryValue", String.class, this);

  private UsualPlaceOfResidencyClusterContainment() {
    super("openEHR-EHR-CLUSTER.address_cc.v0");
  }

  public static UsualPlaceOfResidencyClusterContainment getInstance() {
    return new UsualPlaceOfResidencyClusterContainment();
  }
}
