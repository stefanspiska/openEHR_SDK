package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ActionedDefiningcode implements EnumValueSet {
  INDETERMINATE("Indeterminate", "It is not possible to know if the management activity was carried out.", "local", "at0027"),

  NOT_ACTIONED("Not actioned", "The specific management activity was not carried out.", "local", "at0024"),

  ACTIONED("Actioned", "The specific management activity was carried out.", "local", "at0023");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ActionedDefiningcode(String value, String description, String terminologyId, String code) {
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
