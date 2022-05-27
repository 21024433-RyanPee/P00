import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,  b);
		
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testMultiple() {
		int a = 10;
		int b = 20;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 200;
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testDivideWith0Denominator() {
		int a = 500;
		int b = 5;
		
		try {
			Calculator cal = new Calculator();
			cal.divide(a, b);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch (IllegalArgumentException e) {
			assertEquals("Division by zero is not allowed", e.getMessage());
		}catch (Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	
	public final void testDivideWithout0Denominator() {
		int a = 800;
		int b = 100;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 8;
		assertEquals(expected, actual);

	}

}
