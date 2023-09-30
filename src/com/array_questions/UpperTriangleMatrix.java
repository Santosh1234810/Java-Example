package com.array_questions;

import java.util.Scanner;

class UpperTriangle
{
	Scanner sc = new Scanner(System.in);
	
	public int[][] input()
	{
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<rows; j++)
			{
				System.out.print("Enter the array elements: "+(i+1)+","+(j+1)+" ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public void display(int arr[][])
	{
		System.out.println("Matrix is: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public void upper(int arr[][])
	{
		System.out.println("Upper Triangle Matrix: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				if (i <= j)
				{
					System.out.print(arr[i][j] +" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
public class UpperTriangleMatrix {
	public static void main(String[] args) {
		UpperTriangle ut = new UpperTriangle();
		int arr2[][] = ut.input();
		ut.display(arr2);
		ut.upper(arr2);
	}
}
