package com.thread;


class DemoThreadGroup extends Thread
{
	DemoThreadGroup(ThreadGroup tgrp, String name)
	{
		super(tgrp, name);
	}

	public void run()
	{
		System.out.println("Name: "+ currentThread().getName());
	}
}
public class TestThread2 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Parent Group");
		
//		tg.list();
		System.out.println("Thread Group Name: "+tg);
		Thread t1 = new Thread(tg,"One");
		t1.start();
		
		Thread t2 = new Thread(tg,"two");
		t2.start();
	}

}
