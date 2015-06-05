package Interfaces;

/*
 * Frontier Interface.
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 * Please see the slides at the address below for more information about 
 * Graph search and my definition for the Frontier Abstract Data Type.
 * 
 * https://docs.google.com/presentation/d/1pRgXbocYd9WGiG53P5beEREnUVqeJu-gVKytCueW0qM/edit?usp=sharing
 */

public interface Frontier<E> extends SizedStructure
{

	// Add an element to the frontier.
	public void add(E elem);
	
	// Retrieve and remove an element from the frontier.
	public E remove();
	
}
