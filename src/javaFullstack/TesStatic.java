package javaFullstack;


class Addition3
{
	static int add1(int a, int b)
	{
		return a + b;
	}
	
	static int add1(int x, int y, int z)
	{
		return x + y + z;
	}
}
public class TesStatic {

	public static void main(String[] args) {
		System.out.println("Addition 1: "+Addition3.add1(10, 20));
		System.out.println("Addition 2: "+ Addition3.add1(10, 20, 30));
	}
}
