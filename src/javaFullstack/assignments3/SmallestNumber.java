package javaFullstack.assignments3;

import java.util.Scanner;

public class SmallestNumber {

	Scanner sc = new Scanner(System.in);
	public int[] input()
	{
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: " +(i+1) +" ");
			arr[i] = sc.nextInt();
		}
		return arr;
		
	}
	void smallest(int arr[])
	{
		int min = arr[0];
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest element: "+min);
	}
	public static void main(String[] args) {
		SmallestNumber sn = new SmallestNumber();
		int arr[] = sn.input();
		sn.smallest(arr);
	}
}
