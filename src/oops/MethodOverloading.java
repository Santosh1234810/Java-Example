package oops;

public class MethodOverloading {
	
	int a; 
	int b;
	
	void sum() // first method
	{
		a = 10;
		b = 20;
		System.out.println(a+b);
	}
	
	void sum(int x, int y) // second method
	{
		a = x;
		b = y;
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) // third method
	{
		System.out.println(x+y+z);
	}
	
	void sum(int a, double b) // fourth method
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.sum(); // call the first method
		mo.sum(100,200); // call the second method
		mo.sum(100,200,300); // call the third method
		mo.sum(10,10.5); // call the third method
	}
}
