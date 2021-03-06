/**
 * Copyright 2011-2012 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.records;

import org.gedcomx.common.URI;
import org.gedcomx.links.HypermediaEnabledData;
import org.gedcomx.rt.EnumUtil;
import org.gedcomx.types.ResourceType;
import org.simpleframework.xml.Root;

/**
 * A description of the content of a collection by resource type.
 *
 * @author Reed Ellsworth
 */
@Root (strict = false)
public class CollectionContent extends HypermediaEnabledData
{

  private URI resourceType;
  private Integer count;
  private Float completeness;

  /**
   * The type of resource being covered in this collection.
   *
   * @return The type of resource being covered in this collection.
   */
  public URI getResourceType() {
    return resourceType;
  }

  /**
   * The type of resource being covered in this collection.
   *
   * @param resourceType The type of resource being covered in this collection.
   */
  public void setResourceType( URI resourceType ) {
    this.resourceType = resourceType;
  }

  /**
   * The type of resource being covered in this collection.
   *
   * @return The type of resource being covered in this collection.
   */
  public ResourceType getKnownResourceType() {
    return getResourceType() == null ? null : ResourceType.fromQNameURI( getResourceType() );
  }

  /**
   * The type of resource being covered in this collection.
   *
   * @param type The type of resource being covered in this collection.
   */
  public void setKnownResourceType( ResourceType type ) {
    setResourceType(type == null ? null : URI.create( EnumUtil.toURIValue( type )));
  }

  /**
   * The count of the items applicable to this content aspect.
   *
   * @return The count of the items applicable to this content aspect.
   */
  public Integer getCount() {
    return count;
  }

  /**
   * The count of the items applicable to this content aspect.
   *
   * @param count The count of the items applicable to this content aspect.
   */
  public void setCount( Integer count ) {
    this.count = count;
  }

  /**
   * A completeness factor for this content; i.e. what percentage of the total number of items in the collection is included in this content aspect. The
   * completeness factor is a value between 0 and 1.
   *
   * @return A completeness factor for this content aspect, a value between 0 and 1.
   */
  public Float getCompleteness() {
    return completeness;
  }

  /**
   * A completeness factor for this content; i.e. what percentage of the total number of items in the collection is included in this content aspect. The
   * completeness factor is a value between 0 and 1.
   *
   * @param completeness A completeness factor for this content aspect, a value between 0 and 1.
   */
  public void setCompleteness( Float completeness ) {
    this.completeness = completeness;
  }

}
