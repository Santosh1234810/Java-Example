package javaFullstack;

public class WhileSquare {
	public static void main(String args[])
	{
		int i = 1;
		int square = 0;
		
		while (i <= 5)
		{
			square = square+i*i;
			i++;
		}
		System.out.println(square);
	}
}
