package partC;

/*
 * Class to calculate the average running time of a partB.Q_02.Average method
 */
public class Q_02 {
	
	public static void main(String[] args) {
		double duration = 0;
		// perform test 5 times recording time for each test
		for (int i=0; i < 5;i++) {
			long start = System.currentTimeMillis();
			partB.Q_02.Average(20, 80);
			long end = System.currentTimeMillis();
			duration += end - start;
		}
		// calculate average time & print to console
		duration = duration / 5;
		System.out.println("Running Time: " + duration);
	}

}
