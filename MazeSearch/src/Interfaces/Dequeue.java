package Interfaces;

/*
 * 
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 * 
 */

public interface Dequeue<E> extends Queue<E>, Stack<E>
{
	public void add_start(E elem);
	public E rem_start();
	
	public void add_end(E elem);
	public E rem_end();
}
