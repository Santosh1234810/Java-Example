package javaFullstack;

public class Armstrong100to5000 {
	
	public static void main(String args[])
	{
		int n, count = 0, a, b, c, sum = 0;
		
		for (int i=100; i<=5000; i++)
		{
			n = 1;
			
			while (n > 0)
			{
				b = n % 10;
				sum = sum + (b*b*b);
				n = n / 10;
			}
			if (sum == i)
			{
				System.out.println(i+" ");
			}
			sum = 0;
			System.out.println("Armstrong numbers are: "+i);
		}
	}
}
