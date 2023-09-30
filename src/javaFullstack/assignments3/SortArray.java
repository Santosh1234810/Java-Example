package javaFullstack.assignments3;

import java.util.Scanner;

public class SortArray {

	public static void printArray(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	Scanner sc = new Scanner(System.in);
	
	public int[] input()
	{
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: " +(i+1)+" ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public void sort(int arr[])
	{
		for (int i=0; i<arr.length-1; i++)
		{
			for (int j=0; j<arr.length-i-1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
	public static void main(String[] args) {
		SortArray sa = new SortArray();
		int arr[] = sa.input();
		sa.sort(arr);
	}
}
