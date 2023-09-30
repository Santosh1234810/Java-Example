package javaFullstack.assignment4;

import java.util.Scanner;

class SortString
{
	public char[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		

		char ch[] = str.toCharArray();
		return ch;
	}
	
	public void display(char[] ch)
	{
		System.out.println("Entered String: ");
		for (int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]);
		}
	}
	
	public void sort(char ch[])
	{
		System.out.println("\nSorted String");
		for (int i=0; i<ch.length; i++)
		{
			for (int j=i+1; j<ch.length; j++)
			{
				if (ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
	}
}
public class Program6 {

	public static void main(String[] args) {
		
		SortString s = new SortString();
		char ch[] = s.input();
		s.display(ch);
		s.sort(ch);
		
		
	}
}
