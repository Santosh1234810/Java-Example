package javaFullstack;

import java.util.Scanner;

class Box
{
	private int length, breadth, height, result;
	
	Scanner sc = new Scanner(System.in);
	
	Box()
	{
		length = 10;
		breadth = 20;
		height = 30;
	}
	
	Box(int length, int breadth, int height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void input()
	{
		System.out.println("Enter the value length: ");
		length = sc.nextInt();
		
		System.out.println("Enter the value breadth : ");
		breadth = sc.nextInt();
		
		System.out.println("Enter the value height : ");
		height = sc.nextInt();
		
	}
	
	void calculate()
	{
		result = length * breadth * height;
		System.out.println("Volume: "+ result);
	}
}

public class Volume
{
	public static void main(String args[])
	{
		Box b = new Box();
		
		b.input();
		b.calculate();
		
		Box b1 = new Box();
		b1.calculate();
	}
}

