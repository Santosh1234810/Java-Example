package javaFullstack;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[])
	{
		int arr[][] = new int[4][4];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
		   		System.out.print("Enter the array elements: " +(i+1)+","+(j+1) + "==> ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Display 2 Dimensional array: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
