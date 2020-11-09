package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum Definingcode2 implements EnumValueSet {
  THE_COVID19_TEST_WAS_NEGATIVE("The Covid-19 test was negative.", null, "WHO-COVID-TEST_RESULT", "NEGATIVE"),

  THE_COVID19_TEST_WAS_INCONCLUSIVE("The Covid-19 test was inconclusive.", null, "WHO-COVID-TEST_RESULT", "INCONCLUSIVE"),

  THE_COVID19_TEST_WAS_POSITIVE("The Covid-19 test was positive.", null, "WHO-COVID-TEST_RESULT", "POSITIVE"),

  THE_COVID19_TEST_WAS_UNKNOWN("The Covid-19 test was unknown.", null, "WHO-COVID-TEST_RESULT", "RESULT_UNKNOWN");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  Definingcode2(String value, String description, String terminologyId, String code) {
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
