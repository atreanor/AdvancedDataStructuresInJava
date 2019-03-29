package partD;

/**
 * Class to display LinkedStack after performing actions for Q_01
 * @author alan treanor
 *
 */
public class Q_01Linked {
	
	public static void main(String[] args) {
		// create new LinkedStack
		LinkedStack s = new LinkedStack();
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
