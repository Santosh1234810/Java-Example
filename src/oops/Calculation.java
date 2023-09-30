package oops;

public class Calculation {
	
	int a;
	int b;
	
//	1) method may not take parameter
//	2) method may not return a value
	/*void sum() {
		System.out.println(a+b);
	}
	*/
	
//	2) method may takes the parameter
/*	void sum(int x, int y) {
		a = x;
		b = y;
		System.out.println(a+b);
	}
	*/
	
//	3) A method may return the value
	int sum() {
		return a+b;
	}
	public static void main(String args[]) {
		Calculation cal = new Calculation();
		
//		1) method may not take parameter
		/*cal.a = 100;
		cal.b = 200;
		cal.sum();
		*/
		cal.a = 100;
		cal.b = 200;
		
		int c = cal.sum();
		System.out.println(c);
		
	}
}
