package javaFullstack;

import java.util.Scanner;

class TotalSalary
{
	int empcode;
	double salary;
	double totalSalary;
	double allowance;
	
	void input()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee code: ");
		empcode = sc.nextInt();
		
		System.out.println("Enter the salary: ");
		salary = sc.nextDouble();
	}
	
	void calculate()
	{
		allowance = salary * 0.17;
		totalSalary = salary + allowance;
	}
	
	void display()
	{
		System.out.println("Employee code: "+empcode);
		System.out.println("Salary before allownace: "+salary);
		System.out.println("Total Allownace: "+allowance);
		System.out.println("Total Salary: "+totalSalary);
	}
}

public class EmployeeCode {
	public static void main(String args[])
	{
		TotalSalary ts = new TotalSalary();
		ts.input();
		ts.calculate();
		ts.display();
	}
}
