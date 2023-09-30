package javaFullstack.assignment4;

import java.util.Scanner;

class MatrixSum
{
	Scanner sc = new Scanner(System.in);
	
	public int[][] input()
	{
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				
				System.out.print("Enter the elements: " +(i+1) +","+ (j+1) +" ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public void display(int arr[][])
	{
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void sum(int arr[][])
	{
		int sum = 0;
		System.out.println("Sum of Matrix: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				sum = sum + arr[i][j];
			}
		}
		System.out.print(sum);
	}
}
public class Program5 {
	public static void main(String[] args) {
		MatrixSum ms = new MatrixSum();
		int inp[][] = ms.input();
		ms.display(inp);
		ms.sum(inp);
	}
}
