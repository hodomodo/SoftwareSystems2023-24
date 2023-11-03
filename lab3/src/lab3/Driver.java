package lab3;

import java.util.Random;

import lab3.Stats;

/**
*
*/
public class Driver
{

	/**
	*Sets the maximum number of values to be stored
	*/
	static final int VALUES = 10;

	public static void main(String[] args)
	{

		Stats stats = new Stats(VALUES);

		Random random = new Random();

		for (int i = 0; i < VALUES; i++)
		{

			stats.addValue(random.nextInt(100));
		}

		System.out.println("Numbers stored : ");
		System.out.println(stats);
		System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getMinValue());
		System.out.println("Maximum value = " + stats.getMaxValue());
	}
}