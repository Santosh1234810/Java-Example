package oops.inheritance;

class A 
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
	}
}

class B extends A
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}

public class SingleIheritance {
	
	public static void main(String args[]) {
		
		/*A aobj = new A();
		aobj.a = 100;
		aobj.b = 200;
		aobj.display();*/
		
		B bobj = new B();
		bobj.x = 100;
		bobj.y = 100;
		bobj.show();
		
		bobj.a = 10;
		bobj.b = 20;
		bobj.display();
	}
}
