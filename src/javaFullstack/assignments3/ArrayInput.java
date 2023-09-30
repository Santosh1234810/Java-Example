package javaFullstack.assignments3;

import java.util.Scanner;

public class ArrayInput {
	Scanner sc = new Scanner(System.in);
	
	
	
	public int[] input()
	{
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the array elements: "+(i+1) + " ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
		public void display(int [] arr)
		{
			
			System.out.println("Display entered arrays: ");
			for (int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i] +" ");
			}
		}
		
	public static void main(String args[])
	{
		ArrayInput ta = new ArrayInput();
		int arr[] = ta.input();
		ta.display(arr);
	}
}
