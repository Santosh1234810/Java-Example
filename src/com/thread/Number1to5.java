package com.thread;

/*class Number extends Thread
{
	public void run()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(currentThread().getName() + " "+i + " " +currentThread().getPriority());
//			System.out.println(currentThread().getId() + " "+i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Number1to5 {

	public static void main(String[] args) {
		Number n1 = new Number();
		Number n2 = new Number();
		
		n1.setName("T1");
		n2.setName("T2");
		
		n1.setPriority(2);
		n2.setPriority(7);
		
		n1.start();
		try {
//			n1.join();
			n1.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		n2.start();	
	}
}*/

class Thread1 extends Thread
{
	
	public void run()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(currentThread().getName()+" " + i);
			
			if (i == 5)
			{
				Thread.yield();
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Number1to5 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		
		t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
	
	}