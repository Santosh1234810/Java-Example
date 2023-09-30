package javaFullstack;

import javaFullstack.model.Address;

public class TestGetterSetter
{
	private int id;
	private String name;
	private int salary;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public TestGetterSetter()
	{
		
	}
	
//	public void Employee2(int id, String name, int salary)
//	{
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return id + " "+ name +" "+ salary +" "+address;
	}
}
/*
public class TestGetterSetter {

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.setId(101);
		e.setName("Akshay");
		e.setSalary(25000);
		System.out.println(e);
		
	}

}
*/