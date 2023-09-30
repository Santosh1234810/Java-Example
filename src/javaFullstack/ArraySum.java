package javaFullstack;

import java.util.Scanner;

public class ArraySum {
	public static void main(String args[])
	{
		int arr[] = new int[3];
		int arr1[] = new int[3];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the array1 elements: "+(i+1)+" ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("*****************************************************");
		System.out.println("Display 1st arrays: ");
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(+arr[i] +" ");
		}
		
		System.out.println("*****************************************************");
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print("Enter the array2 elements: ");
			arr1[i] = sc.nextInt();
		}
		System.out.println("*****************************************************");
		
		System.out.println("Display 2nd arrays: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("\n"+arr1[i] + " ");
		}
		System.out.println("*****************************************************");
		
		int arr2[] = new int[arr.length];
		System.out.println("Sum of arrays:");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i] + arr1[i];
			System.out.println(arr[i]);
		}
	}
}
