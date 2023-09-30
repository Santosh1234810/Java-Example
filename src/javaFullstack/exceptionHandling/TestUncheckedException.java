package javaFullstack.exceptionHandling;

import java.util.Scanner;

class AgeValidation extends RuntimeException
{
	AgeValidation (String s)
	{
		super(s);
	}
}

public class TestUncheckedException {
	public static void validation(int age)
	{
		if (age >= 18)
		{
			System.out.println("Valid for voting");
		}
		
		else
		{
			try
			{
			throw new AgeValidation("Not valid for voting");
		}
			catch(AgeValidation a)
			{
				System.out.println(a);
			}	
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		validation(age);
	}

}
