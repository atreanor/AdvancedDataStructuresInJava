package partB;

import java.util.Arrays;

/*
 * Class that converts an array of integers to an array of averages, eg. index 
 * X[i] is average of A[0] - A[i].
 */
public class Q_07 {
	
	public static void main(String[] args) {
		// create test array
		int[] myArray = {5, 4, 3, 2, 1};
		// invoke PrefixAverages2 with parameters
		PrefixAverages2(myArray, 5);
		
	}
	public static int[] PrefixAverages2(int[] A, int n) {
		int[] X = new int[n];
		int runningSum = 0;
		// iterate over array, calculate average & write average to new array
		for (int j=0; j <= n-1; j++) {
			runningSum += A[j];
			X[j] = runningSum / (j + 1);
		}
		// print result to console & return 
		System.out.println("Output: " + Arrays.toString(X));
		return X;
	}

}
