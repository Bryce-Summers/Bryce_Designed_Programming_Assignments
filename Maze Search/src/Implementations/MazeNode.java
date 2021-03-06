package Implementations;

import Interfaces.Pair;

/**
 * Written By Bryce Summers on 6/6/2015.
 * 
 * This class will be used to store information about Maze Nodes,
 *
 * Maze Nodes know whether they contain a wall or not.
 * Maze Nodes know where their predecessor in a search is.
 * 
 * Maze Nodes probably know where their location is.
 * 
 */

public class MazeNode implements Pair<Integer, Integer>
{	

	private enum State{UNVISITED, VISITED, INPATH}
	
	@Override
	public Integer val1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer val2() {
		// TODO Auto-generated method stub
		return null;
	}

}
