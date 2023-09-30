package javaFullstack;

import java.util.Scanner;

public class TwoDArraySum {
	
	Scanner sc = new Scanner(System.in);


	int rows, cols;
	
	public int[][] input()
	{
		int arr[][] = new int[rows][cols];
		
		for (int i=0; i<rows; i++) 
		{
			for (int j=0; j<cols; j++) 
			{
				System.out.print("Enter the array elements: " +(i+1) +","+(j+1) +" ");
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	void display(int arr[][])
	{
		System.out.println("Display 2 dimensional array: ");
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		TwoDArraySum t = new TwoDArraySum();
		int a[][]=t.input();
		t.display(a);
//		System.out.println(d);
	}

}
