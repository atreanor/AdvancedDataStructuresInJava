package partB;

/*
 * Class to identify the smallest value in an integer array
 */
public class Q_05 {
	
	public static void main(String[] args) {
		// create test array
		int[] myArray = {5, 4, 3, 2, 1};
		// invoke MinValue method using test array
		MinValue(myArray, 5);
	}
	
	public static int MinValue(int[] A, int n) {
		int minVal = A[0];
		// iterate over array, if i < min, min = i
		for (int i=1; i <= n-1; i++) {
			if (minVal > A[i]) 
				minVal = A[i];
		}
		// print result to console & return
		System.out.println("Output: " + minVal);
		return minVal;
	}
}
