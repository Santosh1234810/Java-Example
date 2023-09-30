package javaFullstack.assignments3;

import java.util.Scanner;

public class ArrayAverageNormal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want?: ");
		int size = sc.nextInt();
		
		int arr[] =  new int[size];
		
		int sum = 0;
		int avg = 0;
		
		System.out.println("Enter " + size + " array elements: ");	
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
			avg = sum / size;
		}
		System.out.println("Average of arrays: "+avg);
	}
}
