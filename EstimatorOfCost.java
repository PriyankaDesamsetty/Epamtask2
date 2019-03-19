package epam;

/**
 * The program to estimate the cost of the house based on standard materials,house area
 * and automation features   
 * @author Priyanka Desamsetty
 *
 */
public class EstimatorOfCost {
	String materialStandard;
	double houseArea;
	boolean isAutomated;

	/**
	 * constructor  to initialize houseArea,materialStandard,isAutomated values 
	 * @param housearea,materialStandard,isAutomated
	 * 
	 *  */
	public EstimatorOfCost(String materialStandard, double houseArea, boolean isAutomated) {

		this.materialStandard = materialStandard;
		this.houseArea = houseArea;
		this.isAutomated = isAutomated;
	}

	/**
	 * function that returns the construction cost of house based on high standard,above standard,normal standard
	 *  @return double cost of the house
	 */
	public double constructionCost() {
		
		double cost = 0.0;
		if (materialStandard.equalsIgnoreCase("standard"))
			cost = 1200;
		else if (materialStandard.equalsIgnoreCase("abovestandard"))
			cost = 1500;
	    else if (materialStandard.equalsIgnoreCase("highstandard") && isAutomated)
			cost = 2500;
		else if (materialStandard.equalsIgnoreCase("highstandard"))
			cost = 1800;

		return houseArea * cost;
	}
}
