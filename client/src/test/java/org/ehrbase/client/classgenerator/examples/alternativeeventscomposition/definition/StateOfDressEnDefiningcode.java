/*
 *
 *  *  Copyright (c) 2020  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 *  *  This file is part of Project EHRbase
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package org.ehrbase.client.classgenerator.examples.alternativeeventscomposition.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StateOfDressEnDefiningcode implements EnumValueSet {
    UNBEKLEIDET("Unbekleidet", "Ohne Kleidung.", "local", "at0013"),

    FULLYCLOTHEDWITHOUTSHOESEN("*Fully clothed, without shoes (en)", "*Clothing which may add significantly to weight. (en)", "local", "at0028"),

    VOLLBEKLEIDETMITSCHUHEN("Voll bekleidet, mit Schuhen", "Bekleidung, die signifikant zum Gewicht beiträgt, mit Schuhen.", "local", "at0010"),

    WINDEL("Windel", "Trägt Windel; kann signifikant zum Gewicht beitragen.", "local", "at0017"),

    UNTERWASCHE("Leicht bekleidet / Unterwäsche", "Bekleidung, die nicht signifikant zum Gewicht beiträgt.", "local", "at0011");

    private String value;

    private String description;

    private String terminologyId;

    private String code;

    StateOfDressEnDefiningcode(String value, String description, String terminologyId, String code) {
        this.value = value;
        this.description = description;
        this.terminologyId = terminologyId;
        this.code = code;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTerminologyId() {
        return this.terminologyId;
    }

    public String getCode() {
        return this.code;
    }
}
