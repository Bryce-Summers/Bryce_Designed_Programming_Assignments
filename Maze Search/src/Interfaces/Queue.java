package Interfaces;

/*
 * 
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 * 
 */

public interface Queue<E> extends Frontier<E>
{

	// Add an element to the structure.
	public void enq(E elem);
	
	// Remove and return the oldest element enqueued in the structure.
	public E deq();
	
	// Return, but not remove, the oldest element enqueued in the structure.
	public E peek();
	

	
}
