package com.array_questions;

import java.util.Scanner;

public class TestEvenPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i=0; i<size; i++)
		{
				System.out.println("Enter the array elements: "+(i+1)+" ");
				arr[i] = sc.nextInt();
			}
		
		System.out.println("\n");
		for (int i=2; i<size; i++)
		{
			if (i%2==0)
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

