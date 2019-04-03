package partB;

/*
 * Class to calculate factorial of integer parameter
 */
public class Q_08 {
	
	public static void main(String[] args) {
		// invoke Factorial with parameter
		Factorial(5);

	}
	public static int Factorial(int n) {
		int fact = 1;
		// iterate over n, increment factorial
		for (int i=1; i <= n; i++) {
			fact = fact * i;
		}
		// print result & return
		System.out.println("Output: " + fact);
		return fact;
	}

}
