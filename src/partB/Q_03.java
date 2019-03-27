package partB;

/*
 * Class to calculate & return the maximum of two integers
 */
public class Q_03 {
	
	public static void main(String[] args) {
		// invoke MaxInt on parameters
		MaxInt(10, 20);
	}
	
	public static int MaxInt(int a, int b) {
		// if a > b, print output a to console & return a
		if (a > b) {
			System.out.println("Output: " + a);
			return a;
		} 
		// if b > a, print output b to console & return b
		else {
			System.out.println("Output: " + b);
			return b;
		}
	}

}
