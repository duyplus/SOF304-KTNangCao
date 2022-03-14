package fpoly;


import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	public AppTest(String testName) {
		super(testName);
	}

	public void testApp() {
		assertTrue(true);
	}

	@Test
	public void testIsEventNumber2() {
		App demol = new App();
		boolean result = demol.isEventNumber(2);
		assertTrue(result);
	}

	@Test
	public void testIsEventNumber4() {
		App demol = new App();
		boolean result = demol.isEventNumber(4);
		assertTrue(result);
	}
}
