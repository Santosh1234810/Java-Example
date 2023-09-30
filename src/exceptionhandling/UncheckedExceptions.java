package exceptionhandling;

public class UncheckedExceptions {
	public static void main(String args[]) 
	{
		int a = 10;
//		System.out.println(a/0); // Arithmetic Exception
		
		String str = null;
//		System.out.println(str.length()); // Null Pointer Exception
		
		String str2 = "abcd";
//		int i = Integer.parseInt(str2); // Number Format Exception
//		System.out.print(i);
		
		int arr[] = new int[5];
//		arr[10] = 100; // Array Index Out Of Bounds Exception
		
	}
}
