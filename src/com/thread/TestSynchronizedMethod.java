package com.thread;

class Table2
{
	
	public void printTable(int n)
	{
		synchronized (this)
		{
		for (int i=1; i<=10; i++)
		{
			System.out.println(n +"*"+i +" "+ " "+" =" +n*i);
		}
	}
}

class MyThread3 extends Thread
{
	Table t1;
	
	 MyThread3(Table t1)
	{
		 this.t1 = t1;
	}
	
	public void run()
	{
		t1.printTable(5);
	}
}
public class TestSynchronizedMethod {

	public static void main(String[] args) {
		Table t1 = new Table();
		MyThread2 m1 = new MyThread2(t1);
		MyThread2 m2 = new MyThread2(t1);
		
		m1.start();
		m2.start();
	}
}

}
