package javaFullstack;

public class ArmstrongNumber {

	int countDigit(int n)
	{
		int count = 0;
		
		while (n != 0)
		{
			count++;
			n = n / 10;
		}
		return count;
	}
	
	int power(int n, int p)
	{
		int result = 0;
		
		for (int i=1; i<=p; i++)
		{
			
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		ArmstrongNumber as = new ArmstrongNumber();
	}

}
