package javaFullstack;

public class Employee {

	private String name;
	private double basic,da,hra,total,pf,netsal;
	
	public Employee()
	{
		this.basic = 20000;
		this.name = "Akshay";
	}
	
	public void calculate()
	{
		da = 0.45*basic;
		hra = 0.15*basic;
		pf = 0.0833*basic;
		total = basic + hra + da;
		netsal = total - pf;
		
		System.out.println("Name: "+ name);
		System.out.println("Basic Salary: " + basic);
		System.out.println("DA: " + da);
		System.out.println("HRA: " + hra);
		System.out.println("PF: " + pf);
		System.out.println("Total: " + total);
		System.out.println("Net Salary: " + netsal);
	}
	
	public void printData()
	{
		
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.printData();
		emp.calculate();
	}
}
