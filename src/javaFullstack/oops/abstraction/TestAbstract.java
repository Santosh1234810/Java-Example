package javaFullstack.oops.abstraction;


abstract class Vehicle
{
	private String cname;
	abstract void run();
	
	void display()
	{
		System.out.println("Vehicle class");
	}
	
	Vehicle()
	{
		System.out.println("Default Constructer");
	}
	
	Vehicle(String cname)
	{
		this.cname = cname;
	}
	
	static void show()
	{
		System.out.println("All are vehicle");
	}
	
	final void manufacture()
	{
		System.out.println(cname + "Any manufacture");
	}
}

class Car extends Vehicle
{
	int cost;
	
	Car(String cname, int cost)
	{
		super(cname);
		this.cost = cost;
	}
	
	@Override
	void run()
	{
		System.out.println("from the car class");
		System.out.println("The cost of car is: "+ cost);
	}
}

class Activa extends Vehicle
{
	int version;
	
	Activa(String cname, int cost, int version)
	{
		super(cname);
		this.version = version;
	}
	
	@Override
	void run()
	{
		System.out.println("From Activa class");
		System.out.println("Version of Activa: "+ version);
	}
}
public class TestAbstract {

	public static void main(String[] args) {
		Car c = new Car("Honda ", 1500000);
		c.display();
		c.show();
		c.manufacture();
		
//		Vehicle.show(); // call the static method
		Vehicle vehicle1, vehicle2;
		vehicle1 = new Car("BMW", 600000);
		vehicle2 = new Activa("5G", 65000,2009);
		
		vehicle1.run();
		vehicle2.run();
	}

}
