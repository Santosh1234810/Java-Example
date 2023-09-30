package array;
import java.util.*;

public class TwoDArray1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		takes the rows and columns from the user
		System.out.print("Enter the number of rows: ");
		int rows  = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
//		create 2D array
		int arr[][] = new int[rows][cols]; 
		
//		takes array elements from the user
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print("Enter the array elements: "+(i+1) +"," +(j+1) + " ");
				arr[i][j] = sc.nextInt();
			}
		}
//		show the entered arrays
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
