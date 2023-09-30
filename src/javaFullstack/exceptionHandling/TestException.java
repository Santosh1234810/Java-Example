package javaFullstack.exceptionHandling;

import java.util.Scanner;

public class TestException {
	public static void checked(int num)
	{
		if (num > 0)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			try
			{
				throw new ArithmeticException("Negative Number Exception");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		checked(num);
	}
}
