package javaFullstack;

public class StaticVariable {
	
	int x;
	static int c;
	
	void count()
	{
		System.out.println("value of x before count: "+x);
		System.out.println("value of c before count: "+c);
		
		x++;
		c++;
		System.out.println("==========================================");
		
		System.out.println("value of x after count: "+x);
		System.out.println("value of c after count: "+c);
	}
	
	public static void main(String args[])
	{
		StaticVariable s1 = new StaticVariable();
		s1.count();
		
		StaticVariable s2 = new StaticVariable();
		s2.count();
	}
}
