package exceptionhandling;

public class TryCatchFinally {
	public static void main(String args[])
	{
		int arr[] = new int[5];
		
		try
		{
			arr[10] = 100; // ArrayIndexOutOfBoundsException
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("This is finally block");
		}
	}
}
