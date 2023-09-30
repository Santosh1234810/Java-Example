package javaFullstack;

interface VehicleDemo
{
	void display();
}

public class TestLambdaExpression {
	public static void main(String[] args) {
		VehicleDemo v = ()->{
			System.out.println("The implementation of Vehicle interface...");
		};
		v.display();
	}
}
