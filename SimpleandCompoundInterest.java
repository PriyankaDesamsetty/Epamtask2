package epam;

/**
 * This program calculates the simple and compoundInterest for the given principle,ratoeOfinterest,time 
 * @author  Priyanka Desamsetty
 *
 */
public class SimpleandCompoundInterest {
	int principle;
	double rateofInterest;
	int time;
	/**
	 * constructor to initialize the following parameters
	 *  @param principle
	 *  @param rateofInterest
	 *  @param time
	 */
	public SimpleandCompoundInterest(int principle, double rateofInterest, int time) {
		this.principle = principle;
		this.rateofInterest = rateofInterest;
		this.time = time;
	}
	/**
	 * function that returns simpleInterest 
	 *  @return double value
	 */
	public double SimpleInterest() {
		return (principle * rateofInterest * time) / 100;
	}
	/**
	 * function that returns compoundInterest
	 *  @return double value
	 */

	public double CompoundInterest() {
		return principle * (Math.pow((1 + rateofInterest / 100), time));

	}

}