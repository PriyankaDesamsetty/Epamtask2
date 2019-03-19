package epam;

import junit.framework.TestCase;

public class CostEstimatortestcase extends TestCase {
     
	
	public void testConstructionCost() {
	
		EstimatorOfCost costEstimator=new EstimatorOfCost("standard",2000,false);
		assertEquals(2400000.0,costEstimator.constructionCost());
		costEstimator=new EstimatorOfCost("highstandard",1000,false);
		assertEquals(1800000.0,costEstimator.constructionCost());
		costEstimator=new EstimatorOfCost("abovestandard",1000,false);
		assertEquals(1500000.0,costEstimator.constructionCost());
		costEstimator=new EstimatorOfCost("highstandard",1000,true);
		assertEquals(2500000.0,costEstimator.constructionCost());
	
	}

}
