package com.array_questions;

public class TestEvenOdd {
	public static void main(String[] args) {
		int arr[] = {7,8,3,2,1,5,6,10,9};
		
		System.out.println("Even number are:");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%2 == 0)
			{
				System.out.print(arr[i] +" ");
			}
		}
		
		System.out.println("\nOdd numbers are: ");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]%2 != 0)
			{
				System.out.print(arr[i] +" ");
			}
		}
	}
}
