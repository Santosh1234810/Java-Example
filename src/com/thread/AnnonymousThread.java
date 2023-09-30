package com.thread;


public class AnnonymousThread {
	public static void main(String[] args) {
		
		Thread t1 = new Thread("My Thread")
				{
			public void run()
			{
				System.out.println("My first Thread");
			}
				};
				t1.start();
	}
}
