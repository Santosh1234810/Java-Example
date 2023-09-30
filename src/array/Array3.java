//find the particular element from an array 

package array;
import java.util.*;

public class Array3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		takes the array size form user
		System.out.print("Enter the size of an array: ");
		int size  = sc.nextInt();
		
//		create the new array
		int arr[] = new int[size];
		
//		takes the array elements from the user
		for (int i=0; i<size; i++) {
			System.out.print("Enter the array elements: " + (i+1) + " ");
			arr[i] = sc.nextInt();
		}
		
//		for particular element
		System.out.print("Which element you want to find out?: ");
		int x = sc.nextInt();
		
//		find out the particular index
		for (int i=0; i<size; i++) {
			
			if (arr[i] == x) {
				System.out.print(arr[i] + " is found at index: " +i);
			}
		}
	}
}
