package partD;

/**
 * Implementation of the stack ADT using an array.
 * @author alan treanor
 */
public class ArrayStack<E> implements Stack<E> {
	public static final int CAPACITY = 1000; // default array capacity
	private E[] data; // generic array used for storage
	private int top = -1; // index of the top element in stack
	
	/**
	 * default constructor for ArrayStack, sets array size to 1000
	 */
	public ArrayStack() {
		// default constructor
		this(CAPACITY);
	}
	/**
	 * class constructor for ArrayStack, sets array size to capacity
	 * @param capacity
	 */
	public ArrayStack(int capacity) {
		// class constructor with given capacity
		data = (E[]) new Object[capacity];
	}
	/**
	 * method returns the number of elements in stack
	 */
	public int size() {
		return (top + 1);
	}
	/**
	 * method returns true if stack is empty
	 */
	public boolean isEmpty() {
		return (top < 0);
	}
	/**
	 * method to push element onto top of stack
	 * throws exception if stack is full
	 */
	public void push(E e) throws IllegalStateException {
		if (size() == data.length) {
			throw new IllegalStateException("Stack is full.");
		}
		data[++top] = e; 
	}
	/**
	 * method returns top element of stack
	 * throws exception if stack is empty
	 */
	public E top() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		return data[top];
	}
	/**
	 * method pops & returns element from top of stack
	 * throws exception if stack is empty
	 */
	public E pop() throws IllegalStateException {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty.");
		}
		E answer = data[top];
		data[top] = null; // dereference S[top] for garbage collection
		top--;
		return answer;
	}
	
	@Override 
	/**
	 * returns string definition of stack
	 */
	public String toString() {
		int size = top + 1;
		String output = " " + size + "\t";
		for (int i = 0; i < size; i++) {
			output += data[i] + " ";
		}
		return output;
	}
	/**
	 * main method to test ArrayStack
	 * @param args
	 */
	public static void main(String[] args) {
		// main method to test stack
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
