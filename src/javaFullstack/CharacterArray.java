package javaFullstack;

import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		int size = 0;
		char ch[] = new char[size];
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many characters you want: ");
		size = sc.nextInt();
				
		for(int i=0; i<size; i++)
		{
			size = sc.nextInt();
		}
		System.out.println("Enter the characters: ");
		
		for (int i=0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		
		System.out.println("********************************************");
		System.out.println("Entered characters are:");
		for (int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
	}

}
