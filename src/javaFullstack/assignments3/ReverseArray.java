package javaFullstack.assignments3;

import java.util.Scanner;

public class ReverseArray {

	Scanner sc = new Scanner(System.in);
	public int[] input()
	{
		
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: " + (i+1) +" ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	void display(int arr[])
	{
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	
		System.out.println("\nReversed arrays are: ");
		for (int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		ReverseArray ra = new ReverseArray();
		int arr[] = ra.input();
		ra.display(arr);
	}

}
