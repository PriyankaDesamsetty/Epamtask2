package epam;

/**
 * The program to calculate the addition,multiplication of given numbers and
 * division of 2 numbers
 * 
 * @author Priyanka Desamsetty
 *
 */
public class Calculator {
	/**
	 * function that returns the sum of numbers
	 * 
	 * @return sum
	 */
	public static double add(String nums) {
		String st[] = nums.split(" ");
		double sum = 0.0;
		for (String i : st) {
			sum += Double.parseDouble(i);
		}
		return sum;
	}

	/**
	 * function that returns the multiplication of numbers
	 * 
	 * @return multiplication result
	 */

	public static double multiply(String numbers) {
		String nums[] = numbers.split(" ");
		double result = 1.0;
		for (String i : nums) {
			result *= Double.parseDouble(i);
		}
		return result;
	}

	/**
	 * function that returns the division of 2 nums
	 * 
	 * @return double value of result
	 */

	public static double div(int a, int b) {

		return (double) (a / (double) b);
	}

}
