package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum LabortestBezeichnungDefiningcode implements EnumValueSet {
  N2019_NCOV_NOVEL_CORONAVIRUS_SEROLOGY("2019-nCoV (novel coronavirus) serology", null, "SNOMED-CT", "1240741000000103");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  LabortestBezeichnungDefiningcode(String value, String description, String terminologyId,
      String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
