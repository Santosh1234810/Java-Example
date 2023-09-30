package oops.inheritance;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
public class Overriding2 {
	
	public static void main(String args[]) 
	{
		Vehicle ve = new Vehicle();
		ve.run();
		
		Bike bike = new Bike();
		bike.run();
	}
}
