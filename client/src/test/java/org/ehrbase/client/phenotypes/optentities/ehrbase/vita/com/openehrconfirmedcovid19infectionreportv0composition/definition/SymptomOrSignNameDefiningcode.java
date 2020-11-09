package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SymptomOrSignNameDefiningcode implements EnumValueSet {
  INFLUENZA_LIKE_SYMPTOMS("Influenza-like symptoms", null, "SNOMED-CT", "315642008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SymptomOrSignNameDefiningcode(String value, String description, String terminologyId,
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
