package com.thread;

class DemoThread implements Runnable 
{
	public void run()
	{
		System.out.println("Creating thread runnable interface");
	}
}


public class TestRunnableInterface {

	public static void main(String[] args) {
		DemoThread td = new DemoThread();
		Thread thread = new Thread(td);
		thread.start();
	}

}
