package Interfaces;

/*
 * 
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 * 
 */

public interface Stack<E> extends Frontier<E>
{
	// Add elem to the head of the structure.
	public void push(E elem);
	// Remove and return the head of the structure.
	public E pop();
	
	// Retrieve, but not remove, the head element.
	public E top();
	
	// Size functions.
	public boolean isEmpty();
	public int size();
	
}
