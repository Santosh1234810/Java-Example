//Write a java program to check given number is prime or not

//Prime Number: A number that is divisible only by 1 and a number itself.
//Example: 2,3,5,7,11,13

package basic_programs;
import java.util.*;

public class Prime_Number {
	public static void main(String args[])
	{
		int num = 7;
		int count = 0;
		
		for (int i=1; i<=num; i++)
		{
			if (num % i == 0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}
}
