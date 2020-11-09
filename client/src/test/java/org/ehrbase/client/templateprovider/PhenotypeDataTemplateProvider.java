package org.ehrbase.client.templateprovider;

import org.apache.xmlbeans.XmlException;
import org.ehrbase.test_data.operationaltemplate.PhenotypeOpt;
import org.ehrbase.webtemplate.model.WebTemplate;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhenotypeDataTemplateProvider implements TemplateProvider {
    @Override
    public Optional<OPERATIONALTEMPLATE> find(String templateId) {
        return Optional
            .ofNullable(PhenotypeOpt.findByTemplateId(templateId))
            .map(PhenotypeOpt::getStream)
            .map(str -> {
                try{
                    return TemplateDocument.Factory.parse(str);
                }catch(XmlException | IOException ex){
                    throw new RuntimeException(ex.getMessage(), ex);
                }
            })
            .map(TemplateDocument::getTemplate);
    }

    public List<String> listTemplateIds(){
        return Arrays
            .stream(PhenotypeOpt.values())
            .map(PhenotypeOpt::getTemplateId)
            .collect(Collectors.toList());
    }
}
