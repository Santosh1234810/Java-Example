package javaFullstack;
import java.util.*;

class Numbers
{
	int num;
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the number: ");
		num = sc.nextInt();
	}
	
	void output()
	{
		if (num > 0)
		{
			System.out.println("Number is positive");
		}
		
		else if(num < 0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
	}
}


public class PositiveNegative {
	public static void main(String args[])
	{
		Numbers n = new Numbers();
		n.input();
		n.output();
	}
}
