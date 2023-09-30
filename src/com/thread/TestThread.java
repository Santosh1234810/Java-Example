package com.thread;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is Working");
	}
}


public class TestThread {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}
}
