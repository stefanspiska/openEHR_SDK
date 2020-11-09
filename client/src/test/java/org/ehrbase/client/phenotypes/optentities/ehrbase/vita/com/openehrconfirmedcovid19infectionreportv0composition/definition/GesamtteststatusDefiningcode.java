package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum GesamtteststatusDefiningcode implements EnumValueSet {
  ABGEANDERT("Abgeändert", "Das Ergebnis wurde nach der Finalisierung modifiziert und ist vollständig von dem verantwortlichen Untersucher verifiziert. Die Ergebnisdaten wurden geändert.", "local", "at0040"),

  KORRIGIERT("Korrigiert", "Das Ergebnis wurde nach der Finalisierung modifiziert und ist vollständig vom verantwortlichen Untersucher verifiziert. Dies ist eine Unterkategorie von \"Abgeändert\".", "local", "at0115"),

  VORLAUFIG("Vorläufig", "Es sind erste, bestätigte Ergebnisse verfügbar, aber nicht alle Ergebnisse sind final. Dies ist eine Unterkategorie von \"Teilweise\".", "local", "at0120"),

  REGISTRIERT("Registriert", "Der Labortest wurde im Laborinformationssystem registriert, aber es ist derzeit noch nichts verfügbar.", "local", "at0107"),

  TEILWEISE("Teilweise", "Das Testergebnis ist als ein Teilergebnis (z.B. Initial, vorübergehend oder vorläufig) bestätigt: Daten im Testergebnis können unvollständig oder nicht verifiziert sein.", "local", "at0037"),

  FINAL("Final", "Das Testergebnis ist vollständig und durch eine autorisierte Person bestätigt.", "local", "at0038"),

  ABGEBROCHEN("Abgebrochen", "Das Ergebnis ist nicht verfügbar, weil der Test nicht gestartet oder nicht abgeschlossen wurde (manchmal auch als \"gescheitert\" bezeichnet).", "local", "at0074"),

  HINZUGEFUGT("Hinzugefügt", "Nach der endgültigen Fassung wurde der Bericht durch Hinzufügen neuer Inhalte aktualisiert. Der bestehende Inhalt bleibt unverändert. Dies ist eine Unterkategorie von \"Abgeändert\".", "local", "at0119"),

  IRRTUMLICH_EINGEGEBEN("Irrtümlich eingegeben", "Das Testergebnis wurde nach der vorherigen Endfreigabe zurückgezogen.", "local", "at0116");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  GesamtteststatusDefiningcode(String value, String description, String terminologyId,
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
