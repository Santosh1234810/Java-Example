package oops;

public class StaticKeyword {
	int a;
	static int b;
	
	static void m1()
	{
		System.out.println(" This is static method");
	}
	
	void m2()
	{
		System.out.println("This is non static method");
	}
	
	public static void main(String args[]) // static method
	{
		b = 100;
		System.out.println(b);
		m1();
		
//		a = 200 // not accessible, because it is non static variable.
//		m2(); // not accessible, because it is not static method.
		
		StaticKeyword sk = new StaticKeyword();
		sk.a = 200;
		System.out.println(sk.a);
		sk.m2();
	}
}
