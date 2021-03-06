package Implementations;

import Interfaces.Frontier;
import Interfaces.PriorityQueue;

/*
 * Written by Bryce Summers on 6/6/2015.
 * 
 * This could be simplified to a binary heap by omitting D
 * and basing algorithms off of the concepts of left and right.
 */

public class DHeap<E extends Comparable<E>> extends ArrayList<E> implements PriorityQueue<PriorityPair<E>>, Frontier<E>
{

	final int D;
	final int astar_weight;
	
	public DHeap(int branching_factor, int astar_weight)
	{
		D = branching_factor;
		this.astar_weight = astar_weight;
	}
	
	
	@Override
	public void enqueue(PriorityPair<E> elem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PriorityPair<E> extractDominating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PriorityPair<E> peekDominating() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(E elem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	
	// -- Main Implementation decomposition functions.
	
	private void siftUp(int index)
	{
		
	}
	
	private void heapify_all()
	{
		
	}
	
	private void sift_down(int index)
	{
		
	}
	
	private int parent(int index)
	{
		// FIXME
		return -1;
	}
	
	private int child(int index, int whichChild)
	{
		// FIXME
		return -1;		
	}
	
}
