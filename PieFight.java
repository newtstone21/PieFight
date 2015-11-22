package newcomer.test;

class PieFight
{

	/**
	 * Starts the application.
	 *
	 * @param args an array of command-line arguments
	 */
	public static void main(String[] args)
	{

		// Create and initialize three threads
		Stooge moe = new Stooge("Moe", 10);
		Stooge larry = new Stooge("Larry", 10);
		Stooge curly = new Stooge("Curly", 10);

		//We need some timing variables
		long start = 0;
		long stop = 0;

		//Start the clock!
		start = System.currentTimeMillis();

		// Get those pies a-throwin'!
		moe.start();
		larry.start();
		curly.start();

		//Keep the clock running while any of the threads/Stooges are alive.
		while (moe.isAlive() | larry.isAlive() | curly.isAlive())
		{
			;    //null loop
		}

		//Stop the clock!
		stop = System.currentTimeMillis();

		//Report the elapsed time.
		System.out.println("All pies thrown. Elapsed time=" + (stop - start) + " ms!");

	}
}
