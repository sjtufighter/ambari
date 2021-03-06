/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.server.view.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * View parameter configuration.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ParameterConfig {
  /**
   * The parameter name.
   */
  private String name;

  /**
   * The parameter description.
   */
  private String description;

  /**
   * Indicates whether or not the parameter is required.
   */
  private boolean required;

  /**
   * Get the parameter name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Get the parameter description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Indicates whether or not the parameter is required.
   *
   * @return true if the parameter is required; false otherwise
   */
  public boolean isRequired() {
    return required;
  }
}
