package basic_programs;

// Program to print the even numbers from 1 to 10.

public class SumOfEvenNumber {
	public static void main(String args[])
	{
		int num = 20;
		int sum = 0;
		
		for (int i=1; i<=num; i++)
		{
			if (num%2 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
