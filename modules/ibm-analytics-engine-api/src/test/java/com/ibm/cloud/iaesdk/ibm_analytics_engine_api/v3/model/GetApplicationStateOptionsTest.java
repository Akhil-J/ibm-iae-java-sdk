/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v3.model;

import com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v3.model.GetApplicationStateOptions;
import com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v3.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetApplicationStateOptions model.
 */
public class GetApplicationStateOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetApplicationStateOptions() throws Throwable {
    GetApplicationStateOptions getApplicationStateOptionsModel = new GetApplicationStateOptions.Builder()
      .instanceId("e64c907a-e82f-46fd-addc-ccfafbd28b09")
      .applicationId("ff48cc19-0e7e-4627-aac6-0b4ad080397b")
      .build();
    assertEquals(getApplicationStateOptionsModel.instanceId(), "e64c907a-e82f-46fd-addc-ccfafbd28b09");
    assertEquals(getApplicationStateOptionsModel.applicationId(), "ff48cc19-0e7e-4627-aac6-0b4ad080397b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetApplicationStateOptionsError() throws Throwable {
    new GetApplicationStateOptions.Builder().build();
  }

}