package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import ehrbase.vita.com.shareddefinition.Language;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;

@Entity
@Archetype("openEHR-EHR-ADMIN_ENTRY.episode_institution.v0")
public class EpisodeOfCareInstitutionAdminEntry {
  @Path("/data[at0001]/items[at0004]/value|value")
  private TemporalAccessor admissionDateValue;

  @Path("/subject")
  private PartyProxy subject;

  @Path("/data[at0001]/items[at0002]/value|value")
  private TemporalAccessor dateOfReleaseOrDeathValue;

  @Path("/data[at0001]/items[at0006]/value|value")
  private String outcomeValue;

  @Path("/language")
  private Language language;

  public void setAdmissionDateValue(TemporalAccessor admissionDateValue) {
     this.admissionDateValue = admissionDateValue;
  }

  public TemporalAccessor getAdmissionDateValue() {
     return this.admissionDateValue ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setDateOfReleaseOrDeathValue(TemporalAccessor dateOfReleaseOrDeathValue) {
     this.dateOfReleaseOrDeathValue = dateOfReleaseOrDeathValue;
  }

  public TemporalAccessor getDateOfReleaseOrDeathValue() {
     return this.dateOfReleaseOrDeathValue ;
  }

  public void setOutcomeValue(String outcomeValue) {
     this.outcomeValue = outcomeValue;
  }

  public String getOutcomeValue() {
     return this.outcomeValue ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }
}
