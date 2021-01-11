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
            "Beatmungswerte"),
	
	SMICS_PATIENTENAUFENHALT("Zur Repräsentation der Patientenaufenthalte im Krankenhaus. Ein Abteilungsfall kann mehrere Aufenthaltsorte eines Patienten speichern. Jeder Aufenthaltsort wird in einer Composition gespeichert. Bitte die entsprechende Kennung des zugehörigen Abteilungsfalls und Versorgungsfalls hinterlegen.",
            "Patientenaufenthalt11012021.opt",
            "Patientenaufenthalt"),
	
	SMICS_VIROLOGISCHER_BEFUND("Zur Repräsentation der Patientenaufenthalte im Krankenhaus. Ein Abteilungsfall kann mehrere Aufenthaltsorte eines Patienten speichern. Jeder Aufenthaltsort wird in einer Composition gespeichert. Bitte die entsprechende Kennung des zugehörigen Abteilungsfalls und Versorgungsfalls hinterlegen.",
            "Virologischer_BefundSMICS.opt",
            "Virologischer Befund"),
	
	SMICS_KENNZEICHNUNG_ERREGERNACHWEIS("Kennzeichnung Erregernachweis SARS-CoV-2",
            "Kennzeichnung_ErregernachweisSARS-CoV-2.opt",
            "Kennzeichnung Erregernachweis SARS-CoV-2"),
	
	SMICS_DIAGNOSTIC_RESULT("Das Template dient dazu einen virologischen Befund strukturiert wiederzugeben.",
            "DiagnosticResultSMICS.opt",
            "Virologischer Befund");
	
	private final String description;
	private final String filename;
	private final String templateId;
    
    PhenotypeOpt(String description, String filename, String templateId){
    	this.description = description;
        this.filename = filename;
        this.templateId = templateId;
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
