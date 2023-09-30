// Java program to print the array elements

package array;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[])
	{
//		takes the array size from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		
//		create an array
		int arr[] = new int[size];
		
//		takes the array elements from the user
		for (int i=0; i<size; i++)
		{
			System.out.print("Enter the array elements: "+(i+1) + " ");
			arr[i] = sc.nextInt();
		}
		
//		display the entered arrays
		System.out.println("Entered arrays are: ");
		for (int i=0; i<size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
//		reversed arrays
		System.out.println("\nReversed arrays are: ");
		for (int i=size-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}


