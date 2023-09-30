package javaFullstack;

import java.util.Scanner;

public class TestArray2 {
	public static void main(String args[])
	{
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<arr.length; i++)
		{
			System.out.println("Enter the array elements: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
