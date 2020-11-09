package org.ehrbase.test_data.operationaltemplate;

import java.io.InputStream;
import java.util.Arrays;

public enum PhenotypeOpt {
    CONFIRMED_COVID19_INFECTION_REPORT("Confirmed Covid 19 infection report",
                                       "Confirmed_Covid19_Inf_Rep.opt",
                                       "openEHR confirmed COVID-19 infection report.v0");
    private final String filename;
    private final String templateId;
    private final String description;

    PhenotypeOpt(String description, String filename, String templateId){
        this.filename = filename;
        this.templateId = templateId;
        this.description = description;
    }

    public InputStream getStream(){
        return getClass().getResourceAsStream("/operationaltemplate/" + filename);
    }

    public static PhenotypeOpt findByTemplateId(String templateId) {
        return Arrays.stream(PhenotypeOpt.values())
                    .filter(opt -> opt.getTemplateId().equals(templateId))
                    .findAny()
                    .orElse(null);
    }

    public String getTemplateId() {
        return templateId;
    }
}
