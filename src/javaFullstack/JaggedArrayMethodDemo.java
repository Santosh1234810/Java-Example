package javaFullstack;

import java.util.Scanner;

class JaggedDemo
{
	
	static int[][] input()
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print("Enter the array elements: "+(i+1) +","+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	static void display(int arr[][])
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	
}


public class JaggedArrayMethodDemo {
	
	public static void main(String args[])
	{
		int arr[][] = JaggedDemo.input();
		JaggedDemo.display(arr);
	}
}
