package Interfaces;

public interface Grid<E>
{

	public void initialize(int width, int height);
	
	public E lookup(int row, int column);
	public void set(int row, int column, E new_value);
	
	public int getWidth();
	public int getHeight();
	
	// Maze Transversal Functions. They return null if no such location exists.
	public E left(E location);
	public E right(E location);
	public E up(E location);
	public E down(E location);

}
