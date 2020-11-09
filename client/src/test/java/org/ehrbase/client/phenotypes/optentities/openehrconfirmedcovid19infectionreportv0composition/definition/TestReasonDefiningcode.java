package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum TestReasonDefiningcode implements EnumValueSet {
  DETECTED_AT_POINT_OF_ENTRY("Detected at point of entry.", null, "WHO-COVID-TEST_REASON", "POE_DETECTION"),

  ROUTINE_RESPIRATORY_DISEASE_SURVEILLANCE_SYSTEMS_E_G_INFLUENZA("Routine respiratory disease surveillance systems (e.g. influenza).", null, "WHO-COVID-TEST_REASON", "SURVEILLANCE"),

  UNKNOWN("Unknown.", null, "WHO-COVID-TEST_REASON", "UNKNOWN"),

  CONTACT_OF_A_CASE("Contact of a case.", null, "WHO-COVID-TEST_REASON", "CASE_CONTACT"),

  SEEKING_HEALTHCARE_DUE_TO_SUSPICION_OF_COVID19("Seeking Healthcare due to suspicion of COVID-19.", null, "WHO-COVID-TEST_REASON", "SEEKING_HC"),

  REPATRIATION("Repatriation.", null, "WHO-COVID-TEST_REASON", "REPATRIATION");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  TestReasonDefiningcode(String value, String description, String terminologyId, String code) {
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
