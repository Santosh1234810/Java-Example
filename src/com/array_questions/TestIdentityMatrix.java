package com.array_questions;

import java.util.Scanner;

public class TestIdentityMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		if (rows != cols)
		{
			System.out.println("Matrix is not identity matrix....");
		}
		else
		{
			for (int i=0; i<rows; i++)
			{
				for (int j=0; j<cols; j++)
				{
					System.out.print("Enter the array elements: "+(i+1) +","+(j+1) +" ");
					arr[i][j] = sc.nextInt();
				}
				
				
				
			}
			System.out.println("Matrix");
			for (int i=0; i<rows; i++)
			{
				for (int j=0; j<cols; j++)
				{
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			for (int i=0; i<rows; i++)
			{
				for (int j=0; j<cols; j++)
				{
//					for principal diagonal
					if (i != j && arr[i][j] != 1)
					{
						flag = false;
						break;
					}
					
					if (i != j && arr[i][j] != 0)
					{
						flag = false;
						break;
					}
				}
			}
			if (flag = true)
			{
				System.out.println("It is an identity matrix....");
			}
			else
			{
				System.out.println("Not an identity matrix....");
			}
			
		}
	}
}
