package com.array_questions;

import java.util.Scanner;

public class TestNumberOfElementsPresent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements: ");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Number of elements present in array: "+arr.length);
		
	}
}
