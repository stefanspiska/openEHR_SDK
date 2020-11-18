package org.ehrbase.test_data.operationaltemplate;

import java.io.InputStream;
import java.util.Arrays;

public enum PhenotypeOpt {
    CONFIRMED_COVID19_INFECTION_REPORT("Confirmed Covid 19 infection report",
                                       "Confirmed_Covid19_Inf_Rep.opt",
                                       "openEHR confirmed COVID-19 infection report.v0"),
	
	GECCO_PERSONENDATEN("GECCO personal data for patient.",
            "GECCO_Personendaten.opt",
            "GECCO_Personendaten"),
	
	GECCO_ATEMFREQUENZ("Respitatory frequenz parameters.",
            "Atemfrequenz.opt",
            "Atemfrequenz"),
	
	GECCO_BEFUND_DER_BLUTGASANALYSE("Respitatory frequenz parameters.",
            "Befund der Blutgasanalyse.opt",
            "Befund der Blutgasanalyse"),
	
	GECCO_DIAGNOSE("Diagnose.",
            "GECCO_Diagnose.opt",
            "GECCO_Diagnose"),
	
	GECCO_BEATMUNGSWERTE("Respitatory frequenz parameters.",
            "Beatmungswerte.opt",
            "Beatmungswerte");
	
	private final String description;
	private final String filename;
	private final String templateId;
    
    

    PhenotypeOpt(String description, String filename, String templateId){
        this.filename = filename;
        this.templateId = templateId;
        this.description = description;
    }

    public InputStream getStream(){
        return getClass().getResourceAsStream("/operationaltemplate/gecco11112020/opt/" + filename);
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
