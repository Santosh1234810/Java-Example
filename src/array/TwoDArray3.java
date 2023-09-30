package array;
import java.util.*;

public class TwoDArray3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		takes the rows and columns from user
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
//		create a 2D arrays
		int arr[][] = new int[rows][cols];
		
//		takes the array elements from the array
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print("Enter the array elements: " +(i+1) +","+(j+1) +" ");
				arr[i][j] = sc.nextInt();
			}
		}
		
//		show the entered arrays
		System.out.println("Entered arrays are: ");
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Which element you want to find out?: ");
		int x = sc.nextInt();
		
//		search the element
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (arr[i][j] == x) {
					System.out.print("x is found at index: (" + i + "," + j +")");
				}
			}
		}
	}
}
