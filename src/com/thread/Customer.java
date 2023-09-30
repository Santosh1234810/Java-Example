package com.thread;

public class Customer {
	int amount;
	
	synchronized public void withdraw(int amount)
	{
		if (this.amount < amount)
		{
			System.out.println("Withdraw amount is less than your current balance");
		}
		
		try
		{
			wait();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		this.amount = this.amount - amount;
		
		if (this.amount > 0)
		{
			System.out.println("Withdraw completed...");
		}
		else
		{
			System.out.println("Withdraw not completed...");
		}
		
	}
	synchronized public void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount = this.amount + amount;
		System.out.println("Deposit completed...");
		notify();
	}
	
	public static void main(String[] args) {
		final Customer c = new Customer();
			
			new Thread()
			{
				public void run()
				{
					c.withdraw(15000);
				}
			}.start();
			
			new Thread()
			{
				public void run()
				{
					c.deposit(20000);
				}
			}.start();
				
	}
}
