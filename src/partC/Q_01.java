package partC;

/*
 * Class to calculate the average running time of Q_01.Increment(int n)
 */
public class Q_01 {
	
	public static void main(String[] args) {
		double duration = 0;
		for (int i=0; i < 5;i++) {
			long start = System.currentTimeMillis();
			partB.Q_01.Increment(5);
			long end = System.currentTimeMillis();
			duration += end - start;
		}
		// calculate average running time
		duration = duration / 5;
		// print result to console
		System.out.println("Running Time: " + duration);
	}	

}
