package javaFullstack;
import java.util.*;

public class Addition1 {
	public static void main(String args[])
	{
		int num=1;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=5; i++)
		{
			System.out.println("Enter the number: "+i);
			num = sc.nextInt();
			sum = sum + num;
		}
		System.out.println("Addition: " + sum);
	}
}
