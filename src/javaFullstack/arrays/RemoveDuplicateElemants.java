package javaFullstack.arrays;

import java.util.Arrays;

public class RemoveDuplicateElemants {
	public static void main(String[] args) {
		int arr[] = {7,8,3,2,3,2,7,8,1,2,1};
		
		Arrays.sort(arr);
		
		int n = arr.length;
		int j = 0;
		
		System.out.println("Before Removal: ");
		for (int i=0; i<n-1; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		int temp[] = new int[n];
		
		for (int i=0; i<n-1; i++)
		{
			if (arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[n-1];
		
		System.out.println("\nArrays after removes duplicates: ");
		for (int k=0; k<j; k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}
