package com.thread;

class TestNumber1to100 extends Thread
{
	public synchronized void run()
	{
		System.out.println("1 to 100 Numbers");
		for (int i=1; i<=100; i++)
		{
			System.out.print(i +" ");
		}
		System.out.println();
	}
}

class TestNumber100to1 extends Thread
{
	public void run()
	{
		System.out.println("\n100 to 1 Numbers: ");
		for (int i=100; i>=1; i--)
		{
			System.out.print(i +" ");
		}
	}
}
public class TestThreadNumber1to100 {

	public static void main(String[] args) {
		
		TestNumber1to100 tn = new TestNumber1to100();
		tn.start();
		
		TestNumber100to1 tn1 = new TestNumber100to1();
		tn1.start();
	}
}
