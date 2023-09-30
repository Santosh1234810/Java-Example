package array;
import java.util.*;

public class Array2 {
	public static void main(String args[])
	{
//		takes the array size from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size fo an array: ");
		int size = sc.nextInt();
		
//		create the array
		int arr[] = new int[size];
		
//		takes the array elements from the user
		for (int i=0; i<size; i++)
		{
			System.out.print("Enter the array elements: " +(i+1) +" ");
			arr[i] = sc.nextInt();
		}
		
//		output
		for (int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
	}
}


