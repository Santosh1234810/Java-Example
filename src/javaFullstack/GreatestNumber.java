package javaFullstack;
import java.util.*;

class ThreeNumber
{
	int num1, num2, num3;
	Scanner sc = new Scanner(System.in);
	
	
	
	void input()
	{
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter ther second number: ");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		num3 = sc.nextInt();
	}
	
	void output()
	{
		if (num1 > num2)
		{
			if (num1 > num3)
			{
				System.out.println(num1 + " "+ " is greater number");
			}
			else
			{
				System.out.println(num3 + " "+ " is greater number");
			}
		}
		else
		{
			if (num2 > num3)
			{
				System.out.println(num2 + " "+ " is greater number");
			}
			else
			{
				System.out.println(num3 + " "+ " is greater number");
			}
		}
	}
}

public class GreatestNumber {
	public static void main(String args[])
	{
		ThreeNumber tn = new ThreeNumber();
		tn.input();
		tn.output();
	}
}
