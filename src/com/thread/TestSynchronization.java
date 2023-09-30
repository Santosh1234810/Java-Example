package com.thread;

class Table
{
	
	public void printTable(int n)
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(n +"*"+i +" "+n*i);
		}
	}
}

class MyThread2 extends Thread
{
	Table t1;
	
	 MyThread2(Table t1)
	{
		this.t1 = t1;
	}
	
	public void run()
	{
		t1.printTable(5);
	}
}
public class TestSynchronization {

	public static void main(String[] args) {
		Table t1 = new Table();
		MyThread2 m1 = new MyThread2(t1);
		MyThread2 m2 = new MyThread2(t1);
		
		m1.start();
		m2.start();
	}

}
