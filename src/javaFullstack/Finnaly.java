package javaFullstack;

public class Finnaly {

	public static void main(String[] args) {
		try
		{
			int n = 6/0;
			System.out.println(n);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("finally always executed");
		}
		System.out.println("Rest of the code");
	}

}
