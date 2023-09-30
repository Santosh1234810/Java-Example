package com.array_questions;

import java.util.Scanner;

public class TestCopyArray {
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	
	public int[] input()
	{
		int arr[] = new int[size];
		
		System.out.print("Enter the array size: ");
		size = sc.nextInt();
		
		for (int i=0; i<size; i++)
		{
			System.out.print("Enter the array elements: "+(i+1)+" ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public void display(int arr[])
	{
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}
	
	public void copyArray(int arr[])
	{
		int arr1[] = new int[arr.length];
		
		System.out.println("Copied arrays are: ");
		for (int i=0; i<arr1.length; i++)
		{
			arr1[i] = arr[i];
			System.out.println(arr1[i]+ "");
		}
	}
	public static void main(String[] args) {
		TestCopyArray ca = new TestCopyArray();
		int arr[] = ca.input();
		ca.display(arr);
		ca.copyArray(arr);
	}
}
