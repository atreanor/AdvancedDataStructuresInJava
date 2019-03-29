package partD;

/**
 * class to display result of performing actions on array from Q_02
 * @author alan treanor
 *
 */
public class Q_02Array {
	
	public static void main(String[] args) {
		// create new ArrayStack
		ArrayStack s = new ArrayStack();
		// perform actions & print result to console
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
