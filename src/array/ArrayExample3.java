package array;

public class ArrayExample3 {
	public static void main(String args[]) {
		int arr[] = {10,20,30,40,50};
		
		int sum = 0;
		for (int i:arr) {
			System.out.println(i);
			
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
