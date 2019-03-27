package partB;

/*
 * Class to calculate & return the average of two integers
 */
public class Q_02 {
	
	public static void main(String[] args) {
		// invoke Average method on parameters
		Average(20, 80);
	}
	public static int Average(int a, int b) {
		
		// calculate average of input parameters
		int avg = (a + b) / 2;
		
		// print average to console & return average
		System.out.println("Output: " + avg);
		return avg;
	}

}
