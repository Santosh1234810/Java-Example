package sortingalgorithm;

public class InsertionSort {
	public static void printArray(int arr[])
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
//		create an array
		int arr[] = {7,8,3,2,1,10,9,6,4,5};
		
//		insertion sort
		for (int i=1; i<arr.length; i++)
		{
			int current = arr[i];
			int j = i-1;
			
			while (j >= 0 && current < arr[j])
			{
				arr[j+1] = arr[j];
			}
//			placement
			arr[j+1] = current;
		}
		printArray(arr);
	}
}




//			A-607