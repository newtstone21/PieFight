package newcomer.test;


/**
 * This is a thread that's used to test mutithreading
 * in the PieFight application.
 */

public class Stooge extends Thread
{
	/**
	 * This field sets the number of repetitions
	 * for each thread.
	 */
	protected int loopNum_ = 10;

	/**
	 * Create a Stooge thread object.
	 */
	public Stooge(String name, int loop)
	{
		//Set the name using the java.lang.Thread constructor.
		super(name);

		//How many pies we throwin'?
		loopNum_ = loop;
	}

	/**
	 * This is the thread's run logic.
	 */
	public void run()
	{
		// Initialize the start and stop variables
		long start = 0;
		long stop = 0;

		// Start the clock!
		start = System.currentTimeMillis();

		// Have the stooge throw loopNum_ pies
		for (int i = 0; i < loopNum_; i++)
		{
			System.out.println(getName() + " throws pie # " + i);
		}

		// Stop the clock!
		stop = System.currentTimeMillis();

		// Display the elapsed time
		System.out.println(getName() + " threw pies for: " + (stop - start) + " ms!");
	}
}
