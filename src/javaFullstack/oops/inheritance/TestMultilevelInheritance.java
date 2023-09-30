package javaFullstack.oops.inheritance;

class Vehicle
{
	public String make, color, model;
	
	Vehicle(String make, String color, String model)
	{
		this.make = make;
		this.color = color;
		this.model = model;
	}
	
	public void printDetails()
	{
		System.out.println("Make: " + make + " Color: " + color + " Model: " + model + " Cost: ");
	}
}

class Car extends Vehicle
{
	public String bodyStyle;
	
	Car(String make, String color, String model, String bodyStyle)
	{
		super(make, color, model);
		this.bodyStyle = bodyStyle;
	}
	
	public void carDetails()
	{
		carDetails();
//		System.out.println(" Cost: " +cost);
	}
}

class Maruti800 extends Car
{
	public int cost;
	
	Maruti800(String make, String color, String model, String bodyStyle, int cost)
	{
		super(make, color, model, bodyStyle);
		this.cost = cost;
	}
	
	public void show()
	{
		carDetails();
		System.out.println("Cost: "+cost);
	}
}

public class TestMultilevelInheritance {

	public static void main(String[] args) {
		Maruti800 m = new Maruti800("Suzuki", "White", "Ciaz", "Sedan", 1500000);
		m.printDetails();
	}
}
