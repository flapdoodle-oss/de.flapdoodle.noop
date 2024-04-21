package de.flapdoodle.noop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NoopTest {
	@Test
	public void noop() {
		Noop testee = new Noop();
		assertThat(testee).isNotNull();

		assertThat(testee.getClass().getResource("Noop.txt"))
			.isNotNull();
		assertThat(testee.getClass().getResource("NoopTest.txt"))
			.isNotNull();
	}
}