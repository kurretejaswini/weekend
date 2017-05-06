package world;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOf10Test {

	@Test
	public void validValueTest() {
		PowerOf10 power = new PowerOf10();
		String result = power.PowerOf(30);
		assertEquals("Nonillion", result);

	}

	@Test
	public void validValueTest2() {
		PowerOf10 power = new PowerOf10();
		String result = power.PowerOf(30);
		assertEquals("Nonillion", result);
	}

	@Test
	public void invalidValueTest3() {
		PowerOf10 power = new PowerOf10();
		String result = power.PowerOf(30);
		assertEquals("Nonillion", result);

	}
}
