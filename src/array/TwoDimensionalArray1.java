package array;

public class TwoDimensionalArray1 {
	public static void main(String args[]) {
		
		int arr[][] = new int[3][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 60;
		arr[1][2] = 70;
		
		arr[2][0] = 80;
		arr[2][1] = 90;
		arr[2][2] = 99;
		
/*		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
//		for each loop
		for (int i[]: arr) {
			for (int j:i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
