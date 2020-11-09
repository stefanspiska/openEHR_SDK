package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum BirthSexDefiningcode implements EnumValueSet {
  FEMALE("Female", "The sex / gnder is female.", "local", "at0010"),

  NOT_KNOWN("Not known", "The sex/ gender is unknown.", "local", "at0012"),

  MALE("Male", "The sex / gender is male.", "local", "at0009");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  BirthSexDefiningcode(String value, String description, String terminologyId, String code) {
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
