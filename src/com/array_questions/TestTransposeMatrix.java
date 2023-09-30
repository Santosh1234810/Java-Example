package com.array_questions;

import java.util.Scanner;

class Transpose
{
	Scanner sc = new Scanner(System.in);
	
	int rows;
	int cols;
	
	public int[][] input()
	{
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<cols; j++)
			{
				System.out.print("Enter the array elements: "+(i+1) +","+(j+1) +" ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public void display(int arr[][])
	{
		System.out.println("Matrix before transpose: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public void tranpose(int arr[][])
	{
		System.out.println("Matrix after transpose: ");
		for (int i=0; i<cols; i++)
		{
			for (int j=0; j<rows; j++)
			{
				System.out.print(arr[j][i] +" ");
			}
			System.out.println();
		}
	}
}

public class TestTransposeMatrix {
	public static void main(String[] args) {
		Transpose t1 = new Transpose();
		int arr2[][] = t1.input();
		t1.display(arr2);
		t1.tranpose(arr2);
	}
}
