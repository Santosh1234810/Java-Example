package javaFullstack.assignments3;

public class CompareArrays {

	public static void main(String[] args) {
		int arr1[] = {3,2,4,1};
		int arr2[] = {7,8,5,3};
		
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		if (l1 == l2)
		{
			System.out.println("Arrays length are equal");
		}
		else
		{
			System.out.println("Arrays length are not equal");
		}
		
		if (arr1 == arr2)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

}
