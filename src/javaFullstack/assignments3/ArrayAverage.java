package javaFullstack.assignments3;

import java.util.Scanner;

class TestAverage
{
//	int arr2[] = new int[size];
	
	Scanner sc = new Scanner(System.in);
	
	int [] input()
	{
//		System.out.println("Enter the array1 size: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print((i+1) +" ");
			arr1[i] = sc.nextInt();
		}
		return arr1;
	}
	
	public void display(int[] arr1)
	{
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}
	
	int [] sum(int arr[], int arr1[])
	{
		int arrsum[] = new int[0];
//		System.out.println(arr1+ arr1);
//		arrsum = arr[] + arr1[];
		return arrsum;
	}
}


public class ArrayAverage {

	public static void main(String[] args) {
		TestAverage ta = new TestAverage();
		
		System.out.println("Enter array1 size: ");
		int arr[] = ta.input();
		System.out.println("Display array1 elements: ");
		ta.display(arr);
		
		TestAverage ta2 = new TestAverage();
		System.out.println("\nEnter array2 size: ");
		int arr2[] = ta2.input();
		System.out.println("Display array2 elements: ");
		ta2.display(arr2);
		
//		int arr3[] = new int[0];
		
		TestAverage ta3 = new TestAverage();
		System.out.println("Sum of two arrays: ");
//		int arr3[] = ta3.sum(arr,arr3);
		
	}

}
