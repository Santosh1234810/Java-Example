package javaFullstack.assignments3;

public class TestException {

	public static void main(String[] args) {
		int a = 5, b = 0;
		
		int c = a+b;
		System.out.println(c);
		
		try {
			
			int d = a/b;
			System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		int e = a * b;
		System.out.println(e);
		
		int f = a - b;
		System.out.println(f);
}

}
