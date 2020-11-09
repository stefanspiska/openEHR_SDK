package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PregnancyGestationDefiningcode implements EnumValueSet {
  THIRD_TRIMESTER("Third trimester", "After week 28.", "local", "at0038"),

  SECOND_TRIMESTER("Second trimester", "Between week 13 and week 28.", "local", "at0037"),

  FIRST_TRIMESTER("First trimester", "Between first day of last period and the end of week 12.", "local", "at0036");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PregnancyGestationDefiningcode(String value, String description, String terminologyId,
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
