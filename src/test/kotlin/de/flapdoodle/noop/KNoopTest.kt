/*
 * Copyright (C) 2023
 *   Michael Mosmann <michael@mosmann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.flapdoodle.noop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class KNoopTest {
  @Test
  fun noop() {
    val testee = Noop()
    assertThat(testee).isNotNull()

    assertThat(testee.javaClass.getResource("Noop.txt"))
      .isNotNull()
    assertThat(testee.javaClass.getResource("NoopTest.txt"))
      .isNotNull()
  }

  @Test
  fun knoop() {
    val testee = KNoop()
    assertThat(testee).isNotNull()

    assertThat(testee.javaClass.getResource("Noop.txt"))
      .isNotNull()
    assertThat(testee.javaClass.getResource("NoopTest.txt"))
      .isNotNull()
  }
}