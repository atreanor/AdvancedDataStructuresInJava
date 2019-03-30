package partD;

/**
 * Implementation of the stack ADT using a Linked List
 * @author alan treanor
 */
public class LinkedStack {
	/**
	 * inner class creates nodes
	 * @author alan
	 *
	 */
	public class Node {
		Object element;
		Node next;

		public Node(Object element) {
			this.element = element;
		}
		
		public String toString() {
			return element.toString(); 
		}
	}
	int size; 
	Node top;
	/**
	 * Class Constructor
	 */
	public LinkedStack() {
		top = null;
		size = 0;
	}
	/**
	 * method inserts object onto top of stack
	 * @param o
	 */
	public void push(Object o) {
		Node node = new Node(o);
		node.next = top;
		top = node;
		size++;
	}
	/**
	 * method removes & returns the top object from stack
	 * @return top object
	 * @throws IllegalStateException if empty
	 */
	public Object pop() throws IllegalStateException {
		if (isEmpty()) { 
			throw new IllegalStateException("Stack is empty.");
		}
		Object temp = top();
		top = top.next; // link out former node
		size--;
		return temp;		
		
	}
	/**
	 * method returns top object of stack without removing
	 * @return top object
	 * @throws IllegalStateException if empty
	 */
	public Object top() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return top.element;
	}
	/**
	 * method returns the number of objects in stack
	 * @return number of objects
	 */
	public int size() {
		return size;
		
	}
	/**
	 * method returns true if stack is empty, false otherwise 
	 * @return 
	 */
	public boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}
	/**
	 * method returns a string description of instance 
	 */
	@Override
	public String toString() {
		String output = " ";
		Node node = top;
		while (node != null) {
			output = node.element.toString() + " " + output;
			node = node.next;
		}
		return " " + size + "\t" + output;
	}
	/**
	 * main method to test linked stack
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedStack s = new LinkedStack();
		System.out.println(s);
		s.push("A");
		System.out.println(s);
		s.push("B");
		System.out.println(s);
		s.push("C");
		System.out.println(s);
	}
}
