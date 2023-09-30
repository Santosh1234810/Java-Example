package com.array_questions;

import java.util.Scanner;

class Frequency
{
	int i,j;
	int count;
	int sameelement=-1;
	Scanner sc = new Scanner(System.in);
	
	int [] input()
	{
		System.out.println("Enter Array size: ");
		int size=sc.nextInt();
		System.out.println("Enter Array Elements: ");
	
		
		int arr[]= new int [size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}	
	void Display(int arr[])
	{
		System.out.println("Array is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
		
		
		
	void CheckFrequency(int arr[])
		{
		int fr[]=new int [arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					// To Avoid Same element again
					fr[j]=sameelement;
				}
			}
			
							
		
		if(fr[i] != sameelement)
			fr[i]=count;	
	
		}
	//Display the frequency of each elements
	System.out.println("*******************************************************\n");
	System.out.println(" Element   |  Frequency");
	System.out.println("*******************************************************");
	
	for(int i=0;i<fr.length;i++)
	{
		if(fr[i] != sameelement)
		 
			System.out.println("  "+arr[i]+"        |    "+fr[i]);
		
	}
	System.out.println("*******************************************************");
	
	
	}
}
public class TestMatrixFrequency {

	public static void main(String[] args) 
	{
		Frequency f = new Frequency();
		int b[]=f.input();
		f.Display(b);
		f.CheckFrequency(b);
		
	}

}
