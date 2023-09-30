package javaFullstack;

import java.util.Scanner;

class Addition
{
	int sum = 0;
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	
	void input()
	{
		
		System.out.println("Enter the elements:");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	void display()
	{
		System.out.println("Display arrays: ");
		
		for (int i=0; i<arr.length; i++)
		{
			
			System.out.print("\n"+arr[i] +" ");
		}
	}
	
	void sum()
	{
		for (int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("\nSum: "+sum );
			
	}
}

public class ArrayMethod {

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		ad.input();
		ad.display();
		ad.sum();
	}

}
