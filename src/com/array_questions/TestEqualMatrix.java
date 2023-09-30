package com.array_questions;

import java.util.Scanner;

class Equal
{
}
public class TestEqualMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,rows1,rows2,cols1,cols2;
		boolean flag = true;
		
		System.out.print("Enter the number rows of matrix1: ");
		rows1 = sc.nextInt();
		
		System.out.print("Enter the number of columns of matrix1: ");
		cols1 = sc.nextInt();
		
		System.out.print("Enter the number rows of matrix2: ");
		rows2 = sc.nextInt();
		
		System.out.print("Enter the number columns of matrix2:");
		cols2 = sc.nextInt();
		
		int arr1[][] = new int[rows1][cols1];
		int arr2[][] = new int[rows2][cols2];
		
		if (rows1 != rows2 || cols1 != cols2)
		{
			System.out.println("Matrices are not equal: ");
		}
		else
		{
			for (i=0; i<rows1; i++)
			{
				for (j=0; j<cols1; j++)
				{
					System.out.print("Enter the Matrix1 elements: "+(i+1)+ ","+ (j+1)+ " ");
					arr1[i][j] = sc.nextInt();
				}
			}
			
			for (i=0; i<rows2; i++)
			{
				for (j=0; j<cols2; j++)
				{
					System.out.print("Enter the Matrix2 elements: "+(i+1) +","+(j+1)+" ");
					arr2[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Matrix-1 is: ");
			for (i=0; i<rows1; i++)
			{
				for (j=0; j<cols1; j++)
				{
					System.out.print(arr1[i][j] +" ");
				}
				System.out.println();
			}
			
			System.out.println("Matrix-2 is: ");
			for (i=0; i<rows2; i++)
			{
				for (j=0; j<cols2; j++)
				{
					System.out.print(arr2[i][j] + " ");
				}
				System.out.println();
			}
			
			for (i=0; i<rows1; i++)
			{
				for (j=0; j<cols1; j++)
				{
					if (arr1[i][j] != arr2[i][j])
					{
						flag = false;
						break;
					}
				}
			}
			if (flag)
			{
				System.out.println("Both Matrix are equal...");
			}
			else
			{
				System.out.println("Matrix are not equal...");
			}
		}
	}
}
