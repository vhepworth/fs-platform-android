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
package org.gedcomx.atom;

import org.gedcomx.common.URI;
import org.simpleframework.xml.Attribute;

/**
 * @author Reed Ellsworth
 */
//@XmlType ( name = "CommonAttributes" )
public abstract class CommonAttributes
{

  @Attribute (required = false)
  private String lang;
  @Attribute (required = false)
  private URI base;

  /**
   * The language.
   *
   * @return The language.
   * @see <a href="http://tools.ietf.org/html/rfc4287#section-2">The atom spec, section 2.</a>
   */
  public String getLang() {
    return lang;
  }

  /**
   * The language.
   *
   * @param lang The language.
   * @see <a href="http://tools.ietf.org/html/rfc4287#section-2">The atom spec, section 2.</a>
   */
  public void setLang( String lang ) {
    this.lang = lang;
  }

  /**
   * The base.
   *
   * @return The base.
   * @see <a href="http://tools.ietf.org/html/rfc4287#section-2">The atom spec, section 2.</a>
   */
  public org.gedcomx.common.URI getBase() {
    return base;
  }

  /**
   * The base.
   *
   * @param base The base.
   * @see <a href="http://tools.ietf.org/html/rfc4287#section-2">The atom spec, section 2.</a>
   */
  public void setBase( URI base ) {
    this.base = base;
  }

}
