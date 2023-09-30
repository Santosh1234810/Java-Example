package javaFullstack.assignments3;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in first array: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter how many elements you want in second array: ");
		int n2 = sc.nextInt();
		
		int n3 = n1 + n2;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		int arr3[] = new int[n3];
		
		System.out.println("Enter " +n1+ " values for first array: ");
		for (int i=0; i<n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter " +n2+ " values for second array: ");
		for (int i=0; i<n2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		for (int i=0; i<n1; i++)
		{
			arr3[i] = arr1[i];
		}
		
		for (int i=0; i<n2; i++)
		{
			arr3[n1+i] = arr2[i];
		}
		
		System.out.println("Merged arrays are: ");
		for (int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
	}
}
