package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceOfAnyConditionsDefiningcode implements EnumValueSet {
  PRESENT("Present", "Conditions are present.", "local", "at0031"),

  ABSENT("Absent", "Conditions are not present.", "local", "at0032"),

  INDETERMINATE("Indeterminate", "It is not possible to know if any conditions are present or absent.", "local", "at0033");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceOfAnyConditionsDefiningcode(String value, String description, String terminologyId,
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
