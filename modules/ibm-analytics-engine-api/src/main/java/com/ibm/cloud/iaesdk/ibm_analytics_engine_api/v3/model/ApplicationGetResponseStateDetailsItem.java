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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Additional information message on the current state of the application.
 */
public class ApplicationGetResponseStateDetailsItem extends GenericModel {

  /**
   * Type of the message.
   */
  public interface Type {
    /** user_error. */
    String USER_ERROR = "user_error";
    /** server_error. */
    String SERVER_ERROR = "server_error";
    /** info. */
    String INFO = "info";
  }

  protected String type;
  protected String code;
  protected String message;

  protected ApplicationGetResponseStateDetailsItem() { }

  /**
   * Gets the type.
   *
   * Type of the message.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the code.
   *
   * Fixed code for the message.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * A descriptive message providing additional information on the current application state.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

