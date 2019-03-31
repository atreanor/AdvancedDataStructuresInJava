package partD;

import assign3.ArrayStack;

/**
 * class to test the ArrayStack with implementation
 * @author alan treanor
 *
 */
public class StackTest {

	public static void main(String[] args) {
		ArrayStack s = new ArrayStack();
		System.out.println(s);
		s.push("A");
		System.out.println(s);
		s.push("B");
		System.out.println(s);
		s.push("C");
		System.out.println(s);
	}

}
