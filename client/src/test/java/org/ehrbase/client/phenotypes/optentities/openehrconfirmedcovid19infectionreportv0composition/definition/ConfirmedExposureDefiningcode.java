package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ConfirmedExposureDefiningcode implements EnumValueSet {
  NOT_CONFIRMED("Not confirmed", "Exposured has not been confirmed.", "local", "at0029"),

  CONFIRMED("Confirmed", "Exposure has been confirmed.", "local", "at0028");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ConfirmedExposureDefiningcode(String value, String description, String terminologyId,
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
