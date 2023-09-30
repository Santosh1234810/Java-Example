package javaFullstack;


class Pattern
{
	void pattern1()
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
	
	void pattern2()
	{
		for (int i=5; i>=1; i--)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
	
	void pattern3()
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
	
	void pattern4()
	{
		int count = 1;
		for (int i=1; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
	
	void pattern5()
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print(k +" ");
			}
			System.out.println();
		}
		System.out.println("*********************************************");
	}
	
	void pattern6()
	{
		int count = 1;
		for (int i=1; i<=4; i++)
		{
			for (int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
public class NumberPattern {

	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.pattern1();
		p.pattern2();
		p.pattern3();
		p.pattern4();
		p.pattern5();
		p.pattern6();
	}

}
