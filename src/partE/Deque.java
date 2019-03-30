package partE;

/*
 * Deque Interface
 * @author alan treanor
 */
public interface Deque<E> {
	
	/**
	 * returns the number of elements in the deque
	 * @return number of elements
	 */
	public int size();
	
	/**
	 * returns whether the deque is empty
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * returns the first element of deque (null if empty)
	 * @return first element of deque
	 */
	public E first();
	
	/**
	 * returns the last element of the deque (null if empty)
	 * @return last element of deque
	 */
	public E last();
	
	/**
	 * inserts an element into the front of deque
	 * @param element inserted first
	 */
	public void addFirst(E element);
	
	/**
	 * inserts an element into the back of deque
	 * @param element inserted last
	 */
	public void addLast(E element);
	
	/**
	 * removes the first element of the deque (null if empty)
	 * @return first element
	 */
	public E removeFirst();
	
	/**
	 * removes the last element of the deque (null if empty)
	 * @return last element
	 */
	public E removeLast();

}
