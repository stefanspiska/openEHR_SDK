/*
 *  Copyright (c) 2019  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 *  This file is part of Project EHRbase
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.ehrbase.client.openehrclient.defaultrestclient;

import org.ehrbase.client.Integration;
import org.ehrbase.client.classgenerator.EhrbaseBloodPressureSimpleDeV0;
import org.ehrbase.client.flattener.FlattenerTest;
import org.ehrbase.client.openehrclient.CompositionEndpoint;
import org.ehrbase.client.openehrclient.OpenEhrClient;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.net.URISyntaxException;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@Category(Integration.class)
public class DefaultRestCompositionEndpointIT {

    private static OpenEhrClient openEhrClient;

    @BeforeClass
    public static void setup() throws URISyntaxException {
        openEhrClient = DefaultRestClientTestHelper.setupDefaultRestClient();
    }

    @Test
    public void testSaveCompositionEntity() {

        UUID ehr = openEhrClient.ehrEndpoint().createEhr();
        EhrbaseBloodPressureSimpleDeV0 bloodPressureSimpleDeV0 = FlattenerTest.buildEhrbaseBloodPressureSimpleDeV0();

        UUID compositionId = openEhrClient.compositionEndpoint(ehr).saveCompositionEntity(bloodPressureSimpleDeV0);
        assertThat(compositionId).isNotNull();
    }

    @Test
    public void testFind() {

        UUID ehr = openEhrClient.ehrEndpoint().createEhr();
        EhrbaseBloodPressureSimpleDeV0 bloodPressureSimpleDeV0 = FlattenerTest.buildEhrbaseBloodPressureSimpleDeV0();

        CompositionEndpoint compositionEndpoint = openEhrClient.compositionEndpoint(ehr);
        UUID compositionId = compositionEndpoint.saveCompositionEntity(bloodPressureSimpleDeV0);

        Optional<EhrbaseBloodPressureSimpleDeV0> actual = compositionEndpoint.find(compositionId, EhrbaseBloodPressureSimpleDeV0.class);
        assertTrue(actual.isPresent());
    }
}