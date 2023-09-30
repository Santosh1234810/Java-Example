package javaFullstack;

import java.util.Scanner;

public class SwitchOperation {
	public static void main(String args[])
	{
		int num1, num2, result;
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("Enter the choice: ");
		ch = sc.next().charAt(0);
		
		switch (ch)
		{
		case '+':
			result = num1 + num2;
			System.out.println("Addition: "+ result);
			break;
			
		case '-':
			result = num1 - num2;
			System.out.println("Substraction: "+ result);
			break;
			
		case '*':
			result = num1 * num2;
			System.out.println("Multiplication: "+ result);
			break;
			
		case '/':
			result = num1 / num2;
			System.out.println("Division: "+ result);
			
			default:
				System.out.println("Invalid Input");
		}
	}
}
