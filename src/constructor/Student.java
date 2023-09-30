package constructor;

import java.util.Scanner;

public class Student {
	static int id;
	static String name;
	
	Student()
	{
		
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id +" "+name);
	}
	
	public static void main(String args[])
	{
		Student[] s1 = new Student[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<s1.length; i++)
		{
			System.out.println("Enter the id: ");
			id = new Scanner(System.in).nextInt();	
		}
		
		for (int i=0; i<s1.length; i++)
		{
			System.out.println("Enter the name: ");
			name = new Scanner(System.in).next();	
		}
		
		for (int i=0; i<s1.length; i++)
		{
			s1[i] = new Student(id,name);
			s1[i].display();
		}
		
	}
}
