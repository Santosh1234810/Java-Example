package basic_programs;

// Program to swap values of two variables without using third variable.

public class Swap2 {
	public static void main(String args[])
	{
		int a = 10, b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a after swap: "+a);
		System.out.println("Value of b after swap: "+b);
	}
}
