package com.array_questions;

import java.util.Scanner;

public class TestArrayElementsFrequency {
	Scanner sc = new Scanner(System.in);
	int visited = -1;
	
	public int[] input()
	{
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for (int i=0; i<size; i++)
		{
			System.out.print("Enter the array elements: "+(i+1) +" ");
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
		System.out.println();
	}
	
	public void checkFrequency(int arr[])
	{
		int freq[] = new int[arr.length];
		
		for (int i=0; i<arr.length; i++)
		{
			int count = 1;
			
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
					freq[j] = visited; 
				}
				if (freq[i] != visited)
				{
					freq[i] = count;
				}
			}	
		}
		for (int i=0; i<freq.length; i++)
		{
			if (freq[i] != visited)
			{
				System.out.println("||Elements   \t|| Frequency||");
				System.out.println("||\t"+arr[i]+"\t||\t"+ freq[i]+"   || ");
			}
		}
	}
	public static void main(String[] args) {
		TestArrayElementsFrequency ef = new TestArrayElementsFrequency();
		int arr[] = ef.input();
		ef.display(arr);
		ef.checkFrequency(arr);
	}
}
