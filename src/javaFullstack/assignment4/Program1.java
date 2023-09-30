package javaFullstack.assignment4;

import java.util.Scanner;

class Avearge
{
	int sum = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public int [] input()
	{
		System.out.println("Enter the array size: ");
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		for (int i=0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		return arr1;
	}
	
	public void display(int arr1[])
	{
		System.out.println("Entered arrays are: ");
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}
	
	public void sum(int arr1[])
	{
		System.out.println("\nSum of arrays are: ");
		for (int i=0; i<arr1.length; i++)
		{
			sum = sum + arr1[i];
		}
		System.out.println(sum);
		
		double avg = sum / arr1.length;
		System.out.println("Average of arrays are: "+avg);
		
	}
}
public class Program1 {
	public static void main(String[] args) {
		Avearge a = new Avearge();
		int abc[] = a.input();
		a.display(abc);
		a.sum(abc);
	}
}
