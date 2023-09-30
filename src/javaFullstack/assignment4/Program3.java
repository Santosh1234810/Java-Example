package javaFullstack.assignment4;

import java.util.Scanner;

class SortingArray
{
	Scanner sc = new Scanner(System.in);
	
	public static void printArray(int arr[])
	{
		System.out.println("Sorting arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");;
		}
		System.out.println();
	}
	
	public int [] input()
	{
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: " +(i+1));
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public void display(int arr[])
	{
		System.out.println("Entered arrays arrays: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
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
}
public class Program3 {

	public static void main(String[] args) {
		SortingArray sa = new SortingArray();
		int dsp[] = sa.input();
		sa.display(dsp);
		sa.sort(dsp);
	}
}
