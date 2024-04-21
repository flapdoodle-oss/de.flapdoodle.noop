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