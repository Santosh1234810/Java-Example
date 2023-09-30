package javaFullstack.assignment4;

import java.util.Scanner;

class TestConcArrray
{
	Scanner sc = new Scanner(System.in);
	
	public int[] input()
	{
		System.out.println("Enter the array1 size: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the array2 size: ");
		int n2 = sc.nextInt();
		
		int n3 = n1 + n2;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		int arr3[] = new int[n3];
		
		System.out.println("Enter the " + n1 + " elements: ");
		for (int i=0; i<n1; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the " + n2 +" elements: ");
		for (int i=0; i<n2; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		for (int i=0; i<n1; i++)
		{
			arr3[i] = arr1[i]; 
		}
		
		for (int i=0; i<n2; i++)
		{
			arr3[n1+i] = arr2[i];
		}
		
		System.out.println("Merged arrays are: ");
		for (int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
		return arr3;
	}
}
public class Program8 {
	public static void main(String[] args) {
		TestConcArrray th = new TestConcArrray();
		int dsp[] = th.input();
	}
}
