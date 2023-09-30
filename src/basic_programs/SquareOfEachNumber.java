package basic_programs;

// Write a program to find the result of the following series:
// 1^2 + 2^2 + 3^2 + 4^2 + 5^2

public class SquareOfEachNumber {
	public static void main(String args[])
	{
		int sum = 0;
		
		for (int i=1; i<=5; i++)
		{
			sum = sum + i*i;
		}
		System.out.println(sum);
	}
}
