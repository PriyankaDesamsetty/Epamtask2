package epam;

import junit.framework.TestCase;

public class SimpleCompoundTestcase extends TestCase {

	public void testSimpleInterest() {
		SimpleandCompoundInterest simpleinterest;
		simpleinterest = new SimpleandCompoundInterest(2000, 4, 2);
		double res = simpleinterest.SimpleInterest();
		assertEquals("error in simpleInterest()", 160.0, res);
		simpleinterest = new SimpleandCompoundInterest(8000, 4.5, 1);
		assertEquals("error in simpleInterest()", 360.0, simpleinterest.SimpleInterest());
	}

	public void testCompoundInterest() {
		SimpleandCompoundInterest compoundinterest;
		compoundinterest = new SimpleandCompoundInterest(2000, 4.5, 2);
		double res = compoundinterest.CompoundInterest();
		assertEquals(2184.0499999999997,res);
		compoundinterest = new SimpleandCompoundInterest(2007480, 8.5, 2);
		assertEquals(2363255.643,compoundinterest.CompoundInterest());
	}

}
