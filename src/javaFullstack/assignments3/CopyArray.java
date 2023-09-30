package javaFullstack.assignments3;

public class CopyArray {

	public int[] copy()
	{
		int arr[] = {7,8,3,2,1};
		int copy[] = new int[arr.length];
		
		System.out.println("Original arrays are: ");
		for (int i=0; i<arr.length; i++)
		{
			copy[i] = arr[i];
		}
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nCopied arrays are: ");
		for (int i=0; i<copy.length; i++)
		{
			System.out.print(copy[i] + " ");
		}
		return copy;
	}
	public static void main(String[] args) {
		CopyArray ca = new CopyArray();
		ca.copy();
	}
}
