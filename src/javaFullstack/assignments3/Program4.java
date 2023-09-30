package javaFullstack.assignments3;

import java.util.Scanner;

class Type1
{
	Scanner sc = new Scanner(System.in);
	
	int arr1[] = new int[5];
	
	public void display1()
	{
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] +" ");
			
		}
	}
	
	public void display2()
	{
		System.out.println("\nEnter how many elements you want?: ");
		int n1 = sc.nextInt();
		
		int arr3[] = new int[n1];
		System.out.println("Enter the " + n1 + " elements: ");
		for (int i=0; i<arr3.length; i++)
		{
			arr3[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] +" ");
		}
	}
	
	public void display3()
	{
		System.out.println("\nEnter how many elements you want in array1: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter how many elements you want in array2");
		int n3 = sc.nextInt();
		
		int arr2[][] = new int[n2][n3];
		
		System.out.println("\nEnter the array elements: : ");
		for (int i=0; i<arr2.length; i++)
		{
			for (int j=0; j<arr2.length; j++)
			{
				
				arr2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr2.length; i++)
		{
			for (int j=0; j<arr2.length; j++)
			{
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
public class Program4 {
	public static void main(String[] args) {
		Type1 t1 = new Type1();
		t1.display1();
		t1.display2();
		t1.display3();
	}
}
