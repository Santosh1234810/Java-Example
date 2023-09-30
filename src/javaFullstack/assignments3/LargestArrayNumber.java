package javaFullstack.assignments3;

public class LargestArrayNumber {

	public static void main(String[] args) {
		int arr[] = {10,20,50,39,99,46,79,90};
		
		int max = arr[0];
		
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest number from an array: "+max);
	}

}
