/**
 * Copyright 2012 Twitter, Inc.
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
 */
package parquet.example.data.simple;

import parquet.io.api.FixedBinary;
import parquet.io.api.RecordConsumer;

public class FixedBinaryValue extends Primitive {

  private final FixedBinary fixedBinary;

  public FixedBinaryValue(FixedBinary fixedBinary) {
    this.fixedBinary = fixedBinary;
  }

  @Override
  public FixedBinary getFixedBinary() {
    return fixedBinary;
  }

  @Override
  public String getString() {
    return fixedBinary.toStringUsingUTF8();
  }

  @Override
  public void writeValue(RecordConsumer recordConsumer) {
    recordConsumer.addFixedBinary(fixedBinary);
  }

  @Override
  public String toString() {
    return getString();
  }
}
