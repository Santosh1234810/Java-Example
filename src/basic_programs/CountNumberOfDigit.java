package basic_programs;

// Program to number of digit in a given number
// Input: 123, Output: 3

public class CountNumberOfDigit {
	public static void main(String args[])
	{
		int num = 1234;
		int count = 0;
		
		while (num > 0)
		{
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
}
