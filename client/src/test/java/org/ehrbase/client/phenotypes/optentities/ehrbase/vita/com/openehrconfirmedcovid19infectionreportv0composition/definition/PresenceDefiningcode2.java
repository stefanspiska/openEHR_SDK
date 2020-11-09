package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningcode2 implements EnumValueSet {
  ABSENT("Absent", "The specific condition is not present.", "local", "at0024"),

  PRESENT("Present", "The specific condition is present.", "local", "at0023"),

  INDETERMINATE("Indeterminate", "It is not possible to know if the condition is present or absent.", "local", "at0027");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningcode2(String value, String description, String terminologyId, String code) {
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
