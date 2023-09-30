package basic_programs;

//Write a program to print number form 1 to 50 which is divisible by 5 or 3
//Output - 3,5,6,9,10,12,15 and so on

public class Divisible5or3 {
	public static void main(String args[])
	{
		for (int i=1; i<=50; i++)
		{
			if (i % 5 == 0|| i % 3 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
