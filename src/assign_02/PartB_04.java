package assign_02;

/*
 * Class to calculate & return the difference between two integers
 */
public class PartB_04 {
	
	public static void main(String[] args) {
		// invoke Difference on parameters
		Difference(100, 150);

	}
	/**
	 * method to calculate the difference between two integers, a and b
	 * @param a
	 * @param b
	 * @return difference a - b or b - a 
	 */
	public static int Difference(int a, int b) {
		// if a > b, subtract b from a, print to console & return result
		if (a > b) {
			System.out.println("Output: " + (a - b));
			return a - b;
		} 
		// if b > a, subtract a from a, print to console & return result
		else {
			System.out.println("Output: " + (b - a));
			return b - a;
		}
	}

}
