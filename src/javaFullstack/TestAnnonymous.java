package javaFullstack;

abstract class Vehicle2
{
	abstract public void run();
}
public class TestAnnonymous {
	
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2()
				{
			public void run()
			{
				System.out.println("This is annonymous class");
			}
		};
		v.run();
	}
}
