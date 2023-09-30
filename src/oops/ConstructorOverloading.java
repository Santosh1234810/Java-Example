package oops;

public class ConstructorOverloading {

	int a = 0;
	int b = 0;
	double c = 0;
	
	ConstructorOverloading() // first 
	{
		a = 10;
		b = 20;
		c = 20.5;
	}
	
	ConstructorOverloading(int x, int y) // second
	{
		a = x;
		b = y;
	}
	
	ConstructorOverloading(int x, double y) // third
	{
		a = x;
		c = y;
	}
	
	ConstructorOverloading(int x, int y, double z) // fourth
	{
		a = x;
		b = y;
		c = z;
	}
	
	ConstructorOverloading(int x, double y, int z)
	{
		a = x;
		b = z;
		c = y;
	}
	
	void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
//		ConstructorOverloading co = new ConstructorOverloading(); // call first Constructor
		
//		ConstructorOverloading co = new ConstructorOverloading(10,20); // call second Constructor
		
//		ConstructorOverloading co = new ConstructorOverloading(10,10.5); // call third Constructor
		
//		ConstructorOverloading co = new ConstructorOverloading(10,20,10.5); // call fourth Constructor
		
		ConstructorOverloading co = new ConstructorOverloading(10,20.5,30);
		
		co.display();

	}

}
