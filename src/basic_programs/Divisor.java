// Write a java program to find a divisor or factor of given number

// Divisor: Divisor means a number that divides an integer number perfectly.
// Example: Input: 6 Output: 1,2,3,6

package basic_programs;

public class Divisor {
	public static void main(String args[])
	{
		int num = 8;
		
		for (int i=1; i<=num; i++)
		{
			if (num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
