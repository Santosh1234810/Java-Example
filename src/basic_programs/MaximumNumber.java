package basic_programs;

// Write a program to find the maximum number out of three number
// Input: 10, 30, 40, 20; Output - 40

public class MaximumNumber {

	public static void main(String[] args) {
		int a = 310, b = 320, c = 120;
		
		if (a > b && a > c)
		{
			System.out.println(a);
		}
		
		else if(b > c)
		{
			System.out.println(b);
		}
		
		else
		{
			System.out.println(c);
		}
	}

}
