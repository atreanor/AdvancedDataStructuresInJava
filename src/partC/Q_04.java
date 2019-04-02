package partC;

/*
 * Class to carry out results smoothign
 */
public class Q_04 {
	
	public static void main(String[] args) {
		double duration = 0;
		// perform method 5 times
		for (int i=0; i < 5; i++) {
			long start = System.currentTimeMillis();
			partB.Q_04.Difference(100, 150);
			long end = System.currentTimeMillis();
			duration += end - start;
		}
		// calculate average runtime
		System.out.println("Total Duration: " + duration); // print result
		double avgDuration = duration / 5;
		System.out.println("Average Run Time: " + avgDuration); // print result
	}	

}
