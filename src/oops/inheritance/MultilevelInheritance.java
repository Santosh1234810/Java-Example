package oops.inheritance;

class P
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
	}
}

class Q extends P
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}

class R extends Q
{
	int p;
	int q;
	
	public void addition()
	{
		System.out.println(p+q);
	}
}

public class MultilevelInheritance {
	
	public static void main(String args[]) {
		
		/*P pobj = new P();
		pobj.a = 100;
		pobj.b = 200;
		pobj.display();*/
		
		Q qobj = new Q();
		qobj.x = 100;
		qobj.y = 100;
		qobj.show();
		
		qobj.a = 10;
		qobj.b = 20;
		qobj.display();
		
		R robj = new R();
		robj.a = 100;
		robj.b = 200;
		robj.x = 300;
		robj.y = 200;
		robj.p = 10;
		robj.q = 20;
		
		robj.display();
		robj.show();
		robj.addition();
	}
}
