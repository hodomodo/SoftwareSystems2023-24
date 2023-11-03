package lab3;

import java.util.Arrays;


/**
 * 
 * Adds a collection of numbers to an array and returns some statistics based on these values
 * 
 * @author HODOM
 *
 */
public class Stats
{
	/**
	 * Collection of numerical values
	 */
	int[] numbers;

	/**
	 * The number of values added to the array
	 */
	int count;

	/**
	 * Adds a new value to the collection
	 * 
	 * @param first value will be added
	 */
	public void addValue(int value)
	{
		numbers[count] = value;
		count++;
	}

	/**
	 * 
	 * @return the number of variables in the array
	 */
	public int getCount()
	{
		return count;
	}

	/**
	 * 
	 * @return the maximum value stored in the array
	 */
	public int getMaxValue()
	{

		int max = numbers[0];

		for (int i = 1; i < count; i++)
		{
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * 
	 * @return the minimum value stored in the array
	 */
	public int getMinValue()
	{
		int min = numbers[0];

		for (int i = 1; i < count; i++)
		{

			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	/**
	 * 
	 * @return the total value of all numbers stored
	 */
	public int getTotal()
	{

		int total = 0;

		// total all values within the array
		for (int i = 0; i < count; i++)
		{
			total += numbers[i];
		}
		return total;
	}

	/**
	 * 
	 * @return the average of all values in the array
	 */
	public double getAverage()
	{

		int x = 0;
		for (int i = 0; i < count; i++)
		{
			x += numbers[i];
		}

		double y = x / (double) count;

		return y;
	}

	@Override
	public String toString()
	{
		return Arrays.toString(numbers);
	}

	/**
	 * Constructor
	 * 
	 * @param capacity is maximum number of values that can be added to the array
	 */
	public Stats(int capacity)
	{
		numbers = new int[capacity];
	}

}