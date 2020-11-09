package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.util.List;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
public class LastTestDetailsDerTestanforderungCluster {
  @Path("/items[at0063]/value")
  @Choice
  private LastTestAuftragsIdEmpfangerChoice auftragsIdEmpfanger;

  @Path("/items[at0062]/value")
  @Choice
  private LastTestAuftragsIdDesAnforderndenEinsendendenSystemsChoice auftragsIdDesAnforderndenEinsendendenSystems;

  @Path("/items[at0035]")
  private List<Cluster> verteilerliste;

  @Path("/items[at0106]")
  private List<LastTestOriginalerNameDerAngefordertenTestungElement> originalerNameDerAngefordertenTestung;

  @Path("/items[at0090]")
  private Cluster einsender;

  public void setAuftragsIdEmpfanger(LastTestAuftragsIdEmpfangerChoice auftragsIdEmpfanger) {
     this.auftragsIdEmpfanger = auftragsIdEmpfanger;
  }

  public LastTestAuftragsIdEmpfangerChoice getAuftragsIdEmpfanger() {
     return this.auftragsIdEmpfanger ;
  }

  public void setAuftragsIdDesAnforderndenEinsendendenSystems(
      LastTestAuftragsIdDesAnforderndenEinsendendenSystemsChoice auftragsIdDesAnforderndenEinsendendenSystems) {
     this.auftragsIdDesAnforderndenEinsendendenSystems = auftragsIdDesAnforderndenEinsendendenSystems;
  }

  public LastTestAuftragsIdDesAnforderndenEinsendendenSystemsChoice getAuftragsIdDesAnforderndenEinsendendenSystems(
      ) {
     return this.auftragsIdDesAnforderndenEinsendendenSystems ;
  }

  public void setVerteilerliste(List<Cluster> verteilerliste) {
     this.verteilerliste = verteilerliste;
  }

  public List<Cluster> getVerteilerliste() {
     return this.verteilerliste ;
  }

  public void setOriginalerNameDerAngefordertenTestung(
      List<LastTestOriginalerNameDerAngefordertenTestungElement> originalerNameDerAngefordertenTestung) {
     this.originalerNameDerAngefordertenTestung = originalerNameDerAngefordertenTestung;
  }

  public List<LastTestOriginalerNameDerAngefordertenTestungElement> getOriginalerNameDerAngefordertenTestung(
      ) {
     return this.originalerNameDerAngefordertenTestung ;
  }

  public void setEinsender(Cluster einsender) {
     this.einsender = einsender;
  }

  public Cluster getEinsender() {
     return this.einsender ;
  }
}
