package com.array_questions;

import java.util.Arrays;

public class TestRemoveDuplicates {
	public static void main(String[] args) {
		int arr[] = {5,6,3,5,6,2,3,1,2,1,4,3,2,1};
		
		Arrays.sort(arr);
		
		int len = arr.length;
		int j = 0;
		
//		traverse the array
		for (int i=0; i<len-1; i++)
		{
			if (arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[len-1];
		
		System.out.println("Arrays after removed duplicates: ");
		for (int k=0; k<j; k++)
		{
			System.out.print(arr[k] + " ");
		}
	}
}
