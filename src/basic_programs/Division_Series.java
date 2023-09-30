package basic_programs;

//Write a java program to generate the following series:
// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8  + 8/9 + 9/10 + 10/11

public class Division_Series {
	public static void main(String args[])
	{
		double sum = 0;
		
		for (double i=1; i<=10; i++)
		{
			sum = sum + i/(i+1);
		}
		System.out.println(sum);
	}
}
