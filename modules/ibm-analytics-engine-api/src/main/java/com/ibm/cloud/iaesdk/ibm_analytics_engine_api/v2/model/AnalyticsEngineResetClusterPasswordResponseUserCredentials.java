/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * User credentials.
 */
public class AnalyticsEngineResetClusterPasswordResponseUserCredentials extends GenericModel {

  protected String user;
  protected String password;

  /**
   * Gets the user.
   *
   * Username.
   *
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * Gets the password.
   *
   * New password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }
}

