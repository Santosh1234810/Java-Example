package array;
import java.util.*;

public class ArraySum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		takes the array size from the user
		System.out.print("Enter the size of an array:");
		int size = sc.nextInt();
		
//		create new array
		int arr[] = new int[size];
		
//		takes the array elements from the user
		for (int i=0; i<size; i++) {
			System.out.print("Enter the array elements: "+(i+1) + " ");
			arr[i] = sc.nextInt();
		}
//		show the entered arrays
		System.out.print("Entered arrays are: ");
		for (int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
		
//		sum of array
		int sum = 0;
		for (int i=0; i<size; i++) {
			sum = sum + arr[i];
		}
		System.out.print("\nSum of arrays are: "+sum);
	}
}
