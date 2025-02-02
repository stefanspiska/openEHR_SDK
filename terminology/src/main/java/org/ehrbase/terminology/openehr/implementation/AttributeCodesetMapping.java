/*
 * Copyright (c) 2019 Vitasystems GmbH and Christian Chevalley (Hannover Medical School).
 *
 * This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.terminology.openehr.implementation;

import org.ehrbase.serialisation.util.SnakeCase;
import org.ehrbase.terminology.openehr.TerminologyResourceException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provide mappings between RM object attributes and their corresponding entry into openehr terminology
 * F.e. mapping between Composition.lifecycle_state and its matching entry: 'version lifecycle state' in openehr terminology (en)
 * or 'estado de ciclo de vida de versão' (pt)
 */
public class AttributeCodesetMapping {


    private Map<String, Map<String, AttributeGroupMap>> groupMaps;
    private static final String ATTRIBUTE_MAP_DEFINITION = "attribute_to_openehr_codesets.xml";
    private static final String EXTERNAL_ID_PREFIX = "openehr_";

    /**
     * Gets an terminology source loaded with specified xml content
     */
    public static AttributeCodesetMapping getInstance(String xmlfilename) throws TerminologyResourceException {
        return new AttributeCodesetMapping(xmlfilename);
    }

    public static AttributeCodesetMapping getInstance() throws TerminologyResourceException {
        return new AttributeCodesetMapping(ATTRIBUTE_MAP_DEFINITION);
    }

    private Map<String, Map<String, AttributeGroupMap>> getMappers() {
        return groupMaps;
    }

    /*
     * Constructs an instance loaded with terminology content
     */
    private AttributeCodesetMapping(String filename) throws TerminologyResourceException {
        groupMaps = new HashMap<>();
        loadMappersFromXML(filename);
    }

    private void loadMappersFromXML(String filename) throws TerminologyResourceException {
        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filename)) {

            if (resourceAsStream == null)
                throw new TerminologyResourceException("Could not access filename:" + filename);

            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            final DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            final Document document = documentBuilder.parse(resourceAsStream);
            Element root = document.getDocumentElement();
            NodeList mapList = root.getElementsByTagName("map");

            for (int idx = 0; idx < mapList.getLength(); idx++) {
                Element element = (Element) mapList.item(idx);
                if (element.getElementsByTagName("terminology") != null && element.getElementsByTagName("terminology").getLength() > 0) {
                    String terminology = element.getElementsByTagName("terminology").item(0).getTextContent();
                    if (terminology.startsWith(EXTERNAL_ID_PREFIX)) {
                        terminology = "openehr";
                    }
                    if (!groupMaps.containsKey(terminology))
                        groupMaps.put(terminology, new HashMap<>());
                    AttributeGroupMap attributeGroupMap = loadMap(element);
                    groupMaps.get(terminology).put(attributeGroupMap.getAttribute(), attributeGroupMap);
                } else {
                    throw new IllegalArgumentException("no terminology specified for entry:" + element.toString());
                }
            }
        } catch (Exception e) {
            throw new TerminologyResourceException(e.getMessage());
        }
    }


    /*
     * Loads a code set from XML element
     */
    private AttributeGroupMap loadMap(Element element) {
        String rmAttribute = element.getElementsByTagName("rm_attribute").item(0).getTextContent();
        String container = "";
        if (element.getElementsByTagName("container").getLength() > 0)
            container = element.getElementsByTagName("container").item(0).getTextContent();
        NodeList matcherList = element.getElementsByTagName("match");
        Map<String, String> matcherMap = new HashMap<>();
        for (int idx = 0; idx < matcherList.getLength(); idx++) {
            Element matcher = (Element) matcherList.item(idx);
            NodeList codeStringMaps = matcher.getElementsByTagName("codeset");
            for (int j = 0; j < codeStringMaps.getLength(); j++) {
                Element codeStringDef = (Element) codeStringMaps.item(j);
                String language = codeStringDef.getAttribute("language");
                String id = codeStringDef.getAttribute("id");
                matcherMap.put(language, id);
            }
        }


        return new AttributeGroupMap(rmAttribute, container, matcherMap);
    }

    public String actualAttributeId(String terminology, String attribute, String language) {
        if (attribute == null) {
            return null;
        }

        String snakeAttribute = new SnakeCase(attribute).camelToSnake();

        String fixTerminlogy = fixTerminlogy(terminology);

        if (!getMappers().get(fixTerminlogy).containsKey(snakeAttribute))
            throw new IllegalArgumentException("attribute:" + attribute + ", is not defined in terminology:" + terminology);

        if (!getMappers().get(fixTerminlogy).get(snakeAttribute).getIdMap().containsKey(language))
            language = "en"; //default to English

        return getMappers().get(fixTerminlogy).get(snakeAttribute).getIdMap().get(language);
    }

    public boolean isLocalizedAttribute(String terminology, String attribute, String language) {
        if (attribute == null) {
            return false;
        }

        String snakeAttribute = new SnakeCase(attribute).camelToSnake();

        String fixTerminlogy = fixTerminlogy(terminology);

        if (!getMappers().containsKey(fixTerminlogy))
            throw new IllegalArgumentException("Invalid terminology id:" + terminology);

        if (!getMappers().get(fixTerminlogy).containsKey(snakeAttribute))
            throw new IllegalArgumentException("attribute:" + attribute + ", is not defined in terminology:" + terminology);

        //default to English
        return getMappers().get(fixTerminlogy).get(snakeAttribute).getIdMap().containsKey(language);
    }

    //openehr_compression_algorithm, openehr_integrity_check_algorithm,openehr_normal_status
    private String fixTerminlogy(String terminology) {
        String fixTerminlogy;
        if (terminology.contains("openehr")){
            fixTerminlogy = "openehr";
        }else{
            fixTerminlogy = terminology;
        }
        return fixTerminlogy;
    }

    public ContainerType containerType(String terminology, String attribute) {
        if (!getMappers().containsKey(terminology))
            return ContainerType.UNDEFINED;

        if (!getMappers().get(terminology).containsKey(attribute)) {
            if (terminology.equals("openehr"))
                return ContainerType.GROUP;
            else
                return ContainerType.CODESET;
        }

        return getMappers().get(terminology).get(attribute).getContainer();
    }
}