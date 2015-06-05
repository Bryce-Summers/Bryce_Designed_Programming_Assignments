package Interfaces;

/* Unbounded Array Abstract Data Type.
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 */

public interface UBA<E> extends SizedStructure
{

	// Adds the element to the index one greater than the highest current indexed memory location.
	public void add(E elem);
	
	// Returns the element at the given index.
	// throws an error if the index is beyond the current space allocated for the array.
	public E lookup(int index);
	
	// Sets the memory corresponding to the given index to the given element.
	public void set(int index, E elem);
	
	// Returns and removes the element with the highest index.
	// This may then decrease the allocated space of the array if prudent.
	public E remove_end();
	
	/* Throws an error is new_size < 0.
	 * Expands the total storage space if new_size > size().
	 * Loses memory of all elements at indices >= new_size. 
	 */
	public void resize(int new_size);
	
}
