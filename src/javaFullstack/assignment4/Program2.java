package javaFullstack.assignment4;

import java.util.Scanner;

class ReverseArray
{
	Scanner sc = new Scanner(System.in);
	
	public int[] input()
	{
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
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
	
	public void reverse(int arr[])
	{
		System.out.println("Reversed arrays are: ");
		for (int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] +" ");
		}
	}
}
public class Program2 {
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int dsp[] = ra.input();
		ra.display(dsp);
		ra.reverse(dsp);
	}
}
