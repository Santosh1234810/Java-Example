package basic_programs;

public class Max_Digit {
	public static void main(String args[])
	{
		int num = 357;
		int max = num % 10;
		
		while (num > 0)
		{
			if (num % 10 > max)
			{
				max = num % 10;
			}
			num = num / 10;
		}
		System.out.println(max);
	}	
}
