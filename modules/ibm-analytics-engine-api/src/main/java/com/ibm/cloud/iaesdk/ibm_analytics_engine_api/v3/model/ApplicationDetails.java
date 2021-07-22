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
package com.ibm.cloud.iaesdk.ibm_analytics_engine_api.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of an application.
 */
public class ApplicationDetails extends GenericModel {

  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("spark_application_id")
  protected String sparkApplicationId;
  protected String state;
  @SerializedName("start_time")
  protected String startTime;
  @SerializedName("finish_time")
  protected String finishTime;

  /**
   * Gets the applicationId.
   *
   * Identifier of the application.
   *
   * @return the applicationId
   */
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Gets the sparkApplicationId.
   *
   * Identifier of the Spark application.
   *
   * @return the sparkApplicationId
   */
  public String getSparkApplicationId() {
    return sparkApplicationId;
  }

  /**
   * Gets the state.
   *
   * Status of the application.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the startTime.
   *
   * Time when the application was started.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the finishTime.
   *
   * Time when the application was completed.
   *
   * @return the finishTime
   */
  public String getFinishTime() {
    return finishTime;
  }
}
