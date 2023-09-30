package javaFullstack;
import java.util.*;

class MenuTest
{
	private int num, exp, result;
	
	Scanner sc = new Scanner(System.in);
	
	public void input()
	{
		System.out.println("Enter the number: ");
		num = sc.nextInt();
	}
	
	public void power()
	{
		for (int i=1; i<=exp; i++)
		{
			result = num*exp;
			System.out.println("Power is: "+result);
		}	
	}
}



public class MenuDriven {

	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
		
		
	}

}
