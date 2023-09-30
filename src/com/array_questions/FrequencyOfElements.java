package com.array_questions;

import java.util.Scanner;

class TestFrequency
{
	Scanner sc = new Scanner(System.in);
	int visited = -1;
	
	
	public int[] input()
	{
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the array elements: "+(i+1)+" ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public void display(int arr[])
	{
		System.out.println("================================================");
		
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		System.out.println("================================================");
	}
	
	public void checkFrequncy(int arr[])
	{
		int freq[] = new int[arr.length];
		for (int i=0; i<arr.length; i++)
		{
			int count = 1;
			
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					count ++;
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
				System.out.println("Elements || Frequency");
				System.out.println(arr[i] + "\t\t" +freq[i]);
			}
		}
	}
}
public class FrequencyOfElements {
	public static void main(String args[])
	{
		TestFrequency tf = new TestFrequency();
		int arr[] = tf.input();
		tf.display(arr);
		tf.checkFrequncy(arr);
	}
}
