/*
 *
 * Copyright (c) 2020  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 * This file is part of Project EHRbase
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
 *
 */

package org.ehrbase.aql.dto.condition;

import java.util.Objects;

public class SimpleValue implements Value {

  private Object value;

  public SimpleValue() {
  }

  public SimpleValue(Object value) {
    this.value = value;
  }

  public Object getValue() {
    return this.value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof SimpleValue)) return false;
    final SimpleValue other = (SimpleValue) o;
    if (!other.canEqual(this)) return false;
    final Object otherValue = other.getValue();
    return Objects.equals(value, otherValue);
  }

  protected boolean canEqual(final Object other) {
    return other instanceof SimpleValue;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (value == null ? 43 : value.hashCode());
    return result;
  }

  public String toString() {
    return "SimpleValue(value=" + this.getValue() + ")";
  }
}
