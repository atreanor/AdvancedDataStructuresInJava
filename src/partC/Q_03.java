package partC;

/*
 * Class to calculate the average running time of partB.Q_03.MaxInt 
 */
public class Q_03 {
	
	public static void main(String[] args) {
		double duration = 0;
		// perform test 5 times
		for (int i=0; i < 5; i++) {
			long start = System.currentTimeMillis();
			partB.Q_03.MaxInt(10, 20);
			long end = System.currentTimeMillis();
			duration += end - start;
		}
		// calculate average time & print to console
		duration = duration / 5;
		System.out.println("Running Time: " + duration);
	}	

}
