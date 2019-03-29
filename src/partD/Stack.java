package partD;
// import all packages from java.util

import java.util.EmptyStackException;

/*
 * Interface for stack
 */
public interface Stack<E> {
	/*
	 * Returns the number of elements in a stack
	 * @return number of elements in the stack
	 */
	int size();
	
	/*
	 * Tests whether the stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/*
	 * Returns element from top of stack, does not remove it
	 * @return top element in the stack (or null if empty)
	 */
	E top() throws EmptyStackException;
	
	/*
	 * Inserts an element at the top of the stack
	 * @param e the element to be inserted
	 */
	void push (E element);
	
	/*
	 * Removes & returns the top element from the stack
	 * @return element removed (or null if empty)
	 */
	E pop() throws EmptyStackException;
	
}
