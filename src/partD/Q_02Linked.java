package partD;

/**
 * class to display LinkedStack after performing actions from Q_02
 * @author alan treanor
 *
 */
public class PCQ3L {
	
	public static void main(String[] args) {
		// create new LinkedStack
		LinkedStack s = new LinkedStack(); 
		// perform instructions & print to console
		s.push("Ireland");
		System.out.print("Popped: " + "\t" + s.pop() + ",");
		s.push("England");
		System.out.print(" " + s.pop() + ",");
		s.push("Wales");
		System.out.print(" " + s.pop() + ",");
		s.push("Scotland");
		System.out.println(" " + s.pop() + ",");
		s.push("France");
		s.push("Germany");
		System.out.println("Stack: " + s);
	}

}
