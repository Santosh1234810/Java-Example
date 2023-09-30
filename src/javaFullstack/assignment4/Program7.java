package javaFullstack.assignment4;

import java.util.Scanner;

class Test
{
	Scanner sc = new Scanner(System.in);
	
	public int[] input()
	{
		System.out.println("Enter the size of an array: ");
		int n1 = sc.nextInt();
		
		int arr[] = new int[n1];
		
		System.out.println("Enter the " + n1 + " elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public void display(int arr[])
	{
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	public void largest(int arr[])
	{
		int max = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest element from an array: "+ max);
	}
	public void secondlargest(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second largest element from an array: "+arr[1]);
	}
}

public class Program7 {
	public static void main(String[] args) {
		Test t1 = new Test();
		int inp[] = t1.input();
		t1.display(inp);
		t1.largest(inp);
		t1.secondlargest(inp);
	}
}
