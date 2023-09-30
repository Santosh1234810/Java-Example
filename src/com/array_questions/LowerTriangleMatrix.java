package com.array_questions;

import java.util.Scanner;

class LowerTriangle
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
			for (int j=0; j<cols; j++)
			{
				System.out.print("Enter the array elments: "+(i+1) +","+(j+1)+" ");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		return arr;
	}
	
	public void display(int arr[][])
	{
		System.out.println("Matrx is: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public void lower(int arr[][])
	{
		System.out.println("Lower triangle matrix: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				if (i >= j)
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
public class LowerTriangleMatrix {
	public static void main(String[] args) {
		LowerTriangle lt = new LowerTriangle();
		int arr[][] = lt.input();
		lt.display(arr);
		lt.lower(arr);
	}
}
