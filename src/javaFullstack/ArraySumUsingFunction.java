package javaFullstack;

import java.util.Scanner;

//class Addition
//{
//	
//}
public class ArraySumUsingFunction {

	int []input()
	{
		int arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: "+(i+1) + " ");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	void display(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void sum(int arr[])
	{
		System.out.println("Sum of arrays: ");
		for (int i=0; i<arr.length; i++)
		{
			int arrsum = (arr[i] + arr[i]);
		}
	}
	public static void main(String[] args) {
		ArraySumUsingFunction ad = new ArraySumUsingFunction();
		System.out.println("First Array: ");
		int arr[] = ad.input();
		
		ArraySumUsingFunction ad1 = new ArraySumUsingFunction();
		System.out.println("Second Array: ");
		int a[] = ad1.input();
		
		System.out.println("Display first array: ");
		ad.display(arr);
		
		System.out.println("Display second array: ");
		ad1.display(a);
		
		ArraySumUsingFunction ad2 = new ArraySumUsingFunction();
		ad2.sum(arr);
	}

}
