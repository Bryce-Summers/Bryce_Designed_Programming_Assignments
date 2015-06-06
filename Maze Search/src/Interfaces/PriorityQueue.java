package Interfaces;

public interface PriorityQueue<E extends Comparable<E>>
{

	public void enqueue(E elem);
	public E extractDominating();
	public E peekDominating();
		
	
}
