package fpoly;

import org.junit.Test;

import junit.framework.TestCase;

public class PTBac1Test extends TestCase {
	public PTBac1Test(String testName) {
		super(testName);
	}

	public void testApp() {
		assertTrue(true);
	}
	
	@Test
	public void testIsEventNumber1() {
		App demol = new App();
		boolean result = demol.isEventNumber(2);
		assertTrue(result);
	}

	@Test
	public void testIsEventNumber2() {
		App demol = new App();
		boolean result = demol.isEventNumber(-2);
		assertTrue(result);
	}

	@Test
	public void testPT() {
		PTBac1 pt = new PTBac1();
		boolean result = pt.isPTBac1(2, -2);
		assertTrue(result);
	}
}
