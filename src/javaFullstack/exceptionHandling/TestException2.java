package javaFullstack.exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class TestException2 {

	public static void checked(int num) 
	{
		if (num > 0)
		{
			System.out.println("Positive number");
		}
		else
		{
			try
			{
				throw new ArithmeticException("Negative Number");
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				throw e;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		checked(num);
	}

}
