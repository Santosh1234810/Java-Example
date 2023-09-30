package javaFullstack;


class Vehicle
{
	static void display()
	{
		System.out.println("From Vehicle class");
	}
}

class Car extends Vehicle
{
	static void display()
	{
//		super.display();
		System.out.println("From Car class");
	}
}
public class TestMethodOverriding {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.display();
		
		Car c = new Car();
		c.display();
	}

}
