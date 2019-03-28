package partB;

/*
 * Class to return the index of the smallest value in an integer array
 */
public class Q_06 {
	
	public static void main(String[] args) {
		// create test array
		int[] myArray = {5, 4, 3, 2, 1};
		// invoke MinValueIndex with test array as parameter
		MinValueIndex(myArray, 5);
	}

	public static int MinValueIndex(int[] A, int n) {
		int minIndex = 0;
		// iterate over array, if value at index i < value at minIndex, minIndex = i
		for (int i=1; i <= n-1; i++) {
			if (A[minIndex] > A[i])
				minIndex = i;
		}
		// print result to console & return
		System.out.println("Output: " + minIndex);  // print result
		return minIndex;
	}

}
