package javaFullstack;

import java.util.Scanner;

class Average
{
	int m1,m2,m3,m4,m5,totalMarks;
	double average;
	
	Scanner sc = new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the marks: ");
		System.out.println("***********************************************");
		System.out.print("Physics: ");
		m1 = sc.nextInt();
		m1++;
		
		System.out.print("Chemistry: ");
		m2 = sc.nextInt();
		
		System.out.print("Biology: ");
		m3 = sc.nextInt();
		System.out.print("Maths: ");
		m4 = sc.nextInt();
		
		System.out.print("English: ");
		m5 = sc.nextInt();
		
		System.out.println("***********************************************");
	}
	
	void calculate()
	{
		totalMarks = m1+m2+m3+m4+m5;
		average = totalMarks/5;
		System.out.println("Total Marks: "+totalMarks);
		
		System.out.println("***********************************************");
		
		System.out.println("Percentage: "+average +" %");
		
		System.out.println("***********************************************");
	}
	
	void grades()
	{
		if (average >= 90 && average < 100)
		{
			System.out.println("A+ grade");
		}
		
		else if (average >= 70 && average <= 89)
		{
			System.out.println("A grade");
		}
		
		else if (average >= 60 && average <= 69)
		{
			System.out.println("B grade");
		}
		
		else if (average >= 50 && average <= 59)
		{
			System.out.println("C grade");
		}
		
		else if (average >= 36 && average <= 49)
		{
			System.out.println("D grade");
		}
		
		else if (average < 35)
		{
			System.out.println("Fail");
		}
		
		System.out.println("***********************************************");
	}
}

public class StudentGrades {
	public static void main(String args[])
	{
		Average a = new Average();
		a.input();
		a.calculate();
		a.grades();
	}
}
