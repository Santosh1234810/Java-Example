package javaFullstack;

import java.util.Scanner;

class TotalCost
{
	int price, quantity;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quatity: ");
		quantity = sc.nextInt();
		
		System.out.println("Enter the price: ");
		price = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Entered quantity: "+ quantity);
		System.out.println("Entered price: "+ price);
	}
	
	void calculate()
	{
		double discount = 0;
		double netAmount;
		int total = quantity * price;
		
		System.out.println("Gross Amount: "+ total);
		
		discount = total * 0.1;
		netAmount = total-discount;
		
		System.out.println("Discount: "+discount);
		System.out.println("Net Amount: "+netAmount);
		
	}
	
}

public class Product {
	public static void main(String args[])
	{
		TotalCost ts = new TotalCost();
		ts.input();
		ts.display();
		ts.calculate();
	}
}
