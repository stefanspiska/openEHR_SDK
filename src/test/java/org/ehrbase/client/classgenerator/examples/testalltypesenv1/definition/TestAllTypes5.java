package org.ehrbase.client.classgenerator.examples.testalltypesenv1.definition;

import com.nedap.archie.rm.datastructures.ItemStructure;
import com.nedap.archie.rm.support.identification.PartyRef;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.examples.shareddefinition.Language;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;

@Entity
@Archetype("openEHR-EHR-INSTRUCTION.test_all_types.v1")
public class TestAllTypes5 {
    @Path("/narrative|value")
    private String narrativeValue;

    @Path("/language")
    private Language language;

    @Path("/activities[at0001]/description")
    private ItemStructure description;

    @Path("/activities[at0001]/description[at0002]/items[at0003]/value|value")
    private Temporal partialDateValue;

    @Path("/subject|external_ref")
    private PartyRef subjectExternalref;

    @Path("/activities[at0001]/action_archetype_id")
    private String currentActivity;

    @Path("/activities[at0001]/description[at0002]/items[at0004]/value|value")
    private TemporalAccessor partialDatetimeValue;

    public void setNarrativeValue(String narrativeValue) {
        this.narrativeValue = narrativeValue;
    }

    public String getNarrativeValue() {
        return this.narrativeValue;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setDescription(ItemStructure description) {
        this.description = description;
    }

    public ItemStructure getDescription() {
        return this.description;
    }

    public void setPartialDateValue(Temporal partialDateValue) {
        this.partialDateValue = partialDateValue;
    }

    public Temporal getPartialDateValue() {
        return this.partialDateValue;
    }

    public void setSubjectExternalref(PartyRef subjectExternalref) {
        this.subjectExternalref = subjectExternalref;
    }

    public PartyRef getSubjectExternalref() {
        return this.subjectExternalref;
    }

    public void setCurrentActivity(String currentActivity) {
        this.currentActivity = currentActivity;
    }

    public String getCurrentActivity() {
        return this.currentActivity;
    }

    public void setPartialDatetimeValue(TemporalAccessor partialDatetimeValue) {
        this.partialDatetimeValue = partialDatetimeValue;
    }

    public TemporalAccessor getPartialDatetimeValue() {
        return this.partialDatetimeValue;
    }
}
