package basic_programs;

//Program to find out the largest number out of 2 numbers

public class Largest_Number {
	public static void main(String args[])
	{
		int num1 = 20;
		int num2 = 20;
		
		if (num1 > num2)
		{
			System.out.println(num1);
		}
		
		else if (num1 == num2)
		{
			System.out.println("Equal");
		}
		
		else
		{
			System.out.println(num2);
		}
	}
}
