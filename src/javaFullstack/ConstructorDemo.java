package javaFullstack;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	
	Scanner sc = new Scanner(System.in);

Student()
{
	id = 11;
	name = "vijay";
}

Student(int id, String name)
{
	this.id = id;
	this.name = name;
}

void input()
{
	System.out.println("Enter the id: ");
	id = sc.nextInt();
	
	System.out.println("Enter the name: ");
	name = sc.next();
}

void display()
{
	System.out.println(id +" "+name);
}
}

public class ConstructorDemo {
	
	public static void main(String[] args) {
		Student ob1 = new Student(10,"Ajay");
		
		Student ob = new Student();
		ob.display();
		
		ob1.input();
		ob1.display();
		
	}
}


