package javaFullstack;

public class TestShape {

//	float r = 5;
	double PI = 3.14;
	void area (float r)
	{
		double a = PI * r * r;
		System.out.println("Area of circle: "+a);
	}
	
	void area (int r)
	{
		int a = r * r; // side * side
		System.out.println("Area of square: "+a);
	}
	
	void area (int x, int y) 
	{
		System.out.println("Area of reactangle: "+ x*y);
	}
	
	public static void main(String[] args) {
		TestShape mo = new TestShape();
		mo.area(4.0f);
		mo.area(3);
		mo.area(5, 6);
	}

}
