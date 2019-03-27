package partB;

/*
 * Class to increment input integer by 1
 */
public class Q_01 {
	
	public static void main(String[] args) {
		// invoke Increment with parameter 5
		Increment(5);
	}
	
	public static int Increment(int a) {
		// increment input a by 1
		int output = a + 1;
		
		// print result to console & return output
		System.out.println("Output: " + output);
		return output;
	}
}
