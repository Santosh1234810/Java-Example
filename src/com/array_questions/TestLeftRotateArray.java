package com.array_questions;

import java.util.Scanner;

class LeftRotate
{
	Scanner sc = new Scanner(System.in);
	
	public int[] input()
	{
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for (int i=0; i<size; i++)
		{
			System.out.print("Enter the array size: "+(i+1)+" ");
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
	
	public void rotate(int arr[])
	{
		int first = arr[0];
		
		System.out.println("\nRotate arrays are: ");
		for (int i=0; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
		
		for (int j=0; j<arr.length; j++)
		{
			System.out.print(arr[j] +" ");
		}
	}
}
public class TestLeftRotateArray {
	public static void main(String[] args) {
		LeftRotate lr = new LeftRotate();
		int arr[] = lr.input();
		lr.display(arr);
		lr.rotate(arr);
	}
}
