package exceptionhandling;

public class HandleUncheckedExceptions {
	public static void main(String args[]) 
	{
		System.out.println("Program Started");
		int a = 10;
		
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		String str = null;
		
		try
		{
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program Completed");
	}
}
