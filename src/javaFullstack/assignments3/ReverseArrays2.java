package javaFullstack.assignments3;

public class ReverseArrays2 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,50,60,70};
		
		int arr2[] = new int[arr1.length];
		
		for (int i=arr1.length-1; i>=0; i--)
		{
			System.out.println(arr1[i]);
		}
	}

}
