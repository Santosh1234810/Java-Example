package javaFullstack.assignments3;

import java.util.Scanner;

public class Prgram14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements you want?: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter the " + num + " array elements: ");
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sorted arrays are: ");
		
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			System.out.print(arr[i] +" ");
		}
			System.out.println("\nSecond Largest element: "+ arr[1]);
		
	}
}
