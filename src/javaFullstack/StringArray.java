package javaFullstack;

import java.util.Scanner;

public class StringArray {
	public static void main(String args[])
	{
		String s1[] = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		for (int i=0; i<s1.length; i++)
		{
			s1[i] = sc.next();
		}
		
		System.out.println("Display String: ");
		for (int i=0; i<s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
}
