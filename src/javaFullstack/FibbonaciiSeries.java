package javaFullstack;

public class FibbonaciiSeries {
	int x = 0;
	int y = 1;
	int num3;
	
	void printFibbo()
	{
		for (int i=1; i<=10; i++)
		{
			num3 = x + y;
			x = y;
			y = num3;
			System.out.println(num3);
		}
	}
	
	public static void main(String args[])
	{
		FibbonaciiSeries fs = new FibbonaciiSeries();
		fs.printFibbo();
	}
}
