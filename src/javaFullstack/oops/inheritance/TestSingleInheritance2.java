package javaFullstack.oops.inheritance;


class Bicycle2
{
	int gear, speed;
	
	Bicycle2(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBreak(int decrement)
	{
		speed = speed - decrement;
	}
	
	void speedUp(int increment)
	{
		speed =  speed + increment;
	}
	
	public String toString()
	{
		return (gear +" "+ speed);
	}
}

class MountainBike extends Bicycle
{
	private int seatHeight;
	
	MountainBike(int gear, int speed, int seatHeight)
	{
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	public String toString()
	{
		return super.toString() +" "+seatHeight;
	}
}
public class TestSingleInheritance2 {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(4,50,100);
		mb.applyBreak(20);
		mb.speedUp(30);
		System.out.println(mb);
	}
}
