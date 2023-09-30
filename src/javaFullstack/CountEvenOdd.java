package javaFullstack;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		
		int ecount = 0, ocount = 0, esum = 0,osum = 0;
		
//		create an array
		int arr[] = {10,20,11,12,30,13,17,19,6};
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%2 == 0)
			{
				ecount++;
				esum = esum + arr[i];
			}
			
			else 
			{
				ocount++;
				osum = osum + arr[i];
			}
		}
		System.out.println("Even numbers count: "+ecount);
		System.out.println("Odd number count: "+ocount);
		System.out.println("Sum of even numbers: "+esum);
		System.out.println("Sum of odd numbers: "+osum);
		
	}
}
