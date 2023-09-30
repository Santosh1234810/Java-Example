package basic_programs;

public class AdditionSubstraction {
	public static void main(String args[])
	{
		int num = 10;
		int sum = 0;
		
		for (int i=1; i<=10; i++)
		{
			if (i%3 == 0)
			{
				sum = sum - i;
			}
			else
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
