package javaFullstack.assignments3;

import java.util.Scanner;

public class ArraySumNormal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many elements you want: ");
		int size = sc.nextInt();
		
		double arr[] = new double[size];
		double sum = 0;
		
		System.out.print("Enter the " +size + " array elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextDouble();
		}
		
		System.out.println("Sum of arrays: ");
		for (int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
