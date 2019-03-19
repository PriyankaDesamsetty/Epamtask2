package epam;

import junit.framework.TestCase;

public class CalJunittest extends TestCase {

	public void testAdd() {

		assertEquals(25.5, Calculator.add("1 2 3.6 8.9 10"));
		assertEquals(-9.4, Calculator.add("7.6 -9 -8"));
	}

	public void testDiv() {
		boolean check = false;
		assertEquals(0.6, Calculator.div(3,5));
		try {
			Calculator.div(3, 0);
		} catch (ArithmeticException e) {
	e.printStackTrace();		
		}
		
	}

	public void testMultiply() {

		assertEquals(-336.96, Calculator.multiply("7.8 9 -8 0.6"));
		assertEquals(0.0, Calculator.multiply("1.0 0 -81 -8 "));
	}

}
