package partD;

/**
 * class to display of ArrayStack after performing actions for Q_01
 * @author alan treanor
 *
 */
public class Q_01Array {
	
	public static void main(String[] args) {
		// create new ArrayStack
		ArrayStack s = new ArrayStack();
		// perform actions & print result to console
		s.push("e");
		s.push("s");
		s.push("c");
		System.out.print("Popped: " + "\t" + s.pop());
		s.push("u");
		s.push("a");
		System.out.print(" " + s.pop());
		s.push("o");
		s.push("t");
		System.out.println(" " + s.pop());
		s.push("h");
		System.out.println("Stack: " + s);

	}

}
