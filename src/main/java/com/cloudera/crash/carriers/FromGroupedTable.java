/*
 * Copyright 2013 Cloudera Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the license at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.crash.carriers;

import com.cloudera.crash.Main;

public abstract class FromGroupedTable<KI, VI, T> extends FromTable<KI, Iterable<VI>, T> {

  protected FromGroupedTable(String name, Main.Script script) {
    super(name, script);
  }

  @Override
  public Iterable<VI> wrap(Iterable<VI> value) {
    // TODO: wrap the iterable in something more friendly
    return value;
  }

  public abstract void work(KI key, Iterable<VI> value);
}