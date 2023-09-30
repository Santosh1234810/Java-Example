package basic_programs;

// Write a program to separate each digit of a number

// Example input: 123
// Output
// 3
// 2
// 1 
public class Separate_Number {
	public static void main(String args[])
	{
		int num = 123;
		
		while (num != 0)
		{
			System.out.println(num % 10);
			num = num / 10;
		}
	}
}
