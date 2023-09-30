package javaFullstack;

public class TestPrime1to100 {

	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		int num = 0;
		String prime = " ";
		for (i=1; i<=100; i++)
		{
			if (num%i == 0)
			{
				count++;
			}
			count = count+1;
			
		}
		if (count == 2)
		{
			prime = prime + i + " ";
		}
		System.out.println("Prime Number");
	}

}
