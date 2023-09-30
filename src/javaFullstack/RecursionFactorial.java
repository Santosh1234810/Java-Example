package javaFullstack;

import java.util.Scanner;

public class RecursionFactorial {
	
	public int fact(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		
		else
		{
			return num * fact(num-1);
		}
	}
	
	
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		RecursionFactorial rf = new RecursionFactorial();
		int result = rf.fact(9);
		System.out.println(result);
	}
}
