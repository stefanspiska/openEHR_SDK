package org.ehrbase.client.phenotypes.optentities.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.phenotypes.optentities.shareddefinition.Language;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;

public class EpisodeOfCareInstitutionAdminEntryContainment extends Containment {
  public SelectAqlField<EpisodeOfCareInstitutionAdminEntry> EPISODE_OF_CARE_INSTITUTION_ADMIN_ENTRY = new AqlFieldImp<EpisodeOfCareInstitutionAdminEntry>(EpisodeOfCareInstitutionAdminEntry.class, "", "EpisodeOfCareInstitutionAdminEntry", EpisodeOfCareInstitutionAdminEntry.class, this);

  public SelectAqlField<TemporalAccessor> ADMISSION_DATE_VALUE = new AqlFieldImp<TemporalAccessor>(EpisodeOfCareInstitutionAdminEntry.class, "/data[at0001]/items[at0004]/value|value", "admissionDateValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(EpisodeOfCareInstitutionAdminEntry.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<TemporalAccessor> DATE_OF_RELEASE_OR_DEATH_VALUE = new AqlFieldImp<TemporalAccessor>(EpisodeOfCareInstitutionAdminEntry.class, "/data[at0001]/items[at0002]/value|value", "dateOfReleaseOrDeathValue", TemporalAccessor.class, this);

  public SelectAqlField<String> OUTCOME_VALUE = new AqlFieldImp<String>(EpisodeOfCareInstitutionAdminEntry.class, "/data[at0001]/items[at0006]/value|value", "outcomeValue", String.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(EpisodeOfCareInstitutionAdminEntry.class, "/language", "language", Language.class, this);

  private EpisodeOfCareInstitutionAdminEntryContainment() {
    super("openEHR-EHR-ADMIN_ENTRY.episode_institution.v0");
  }

  public static EpisodeOfCareInstitutionAdminEntryContainment getInstance() {
    return new EpisodeOfCareInstitutionAdminEntryContainment();
  }
}
