package javaFullstack.assignments3;

public class ArrayLength {
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50,55,60,70,80,90};
		int count = 0;
		
		for (int i=0; i<arr.length; i++)
		{
			count++;
		}
		System.out.print("Length of an array: "+count);
	}
}
