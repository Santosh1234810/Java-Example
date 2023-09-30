package basic_programs;

// Program to swap values of two variables

public class Swap {
	public static void main(String args[])
	{
		int a = 20;
		int b = 10;
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of a after swap: "+b);
	}
}
