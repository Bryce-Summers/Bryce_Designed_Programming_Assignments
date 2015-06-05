package Testing;

/*
 * 
 * 
 * Written by Bryce Summers on 6/5/2015.
 * 
 * 
 */

public abstract class Tester
{
	// Should be used at the beginning of procedures to assert properties about the preconditions.
	public void REQUIREs(boolean b)
	{
		ASSERT(b);
	}

	// Should be used at the end of procedures to assert properties about the postconditions.
	public void ENSURES(boolean b)
	{
		ASSERT(b);
	}
	
	// General correctness assertion, should be used at intermediary steps in procedures.
	// Also used in standard unit testing.
	public void ASSERT(boolean b)
	{
		if(!b) throw new Error("Error: Assertion Failed.");
	}
	

}
