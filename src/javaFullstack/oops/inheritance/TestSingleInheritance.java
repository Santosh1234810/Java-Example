package javaFullstack.oops.inheritance;


class Bicycle
{
	int gear, speed;
	
	Bicycle()
	{
		
	}
	Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBreak(int decrement)
	{
		decrement = decrement - speed;
	}
	
	void speedUp(int increment)
	{
		increment = increment + speed;
	}
	
	public String toString()
	{
		return gear +" "+ speed;
	}
}
public class TestSingleInheritance extends Bicycle{

	public static void main(String[] args) {
		Bicycle b = new Bicycle(4,60);
		b.applyBreak(4);
		b.speedUp(50);
		System.out.println(b);
	}
}
