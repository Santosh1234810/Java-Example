package basic_programs;

// Write a program to print sum 0f given number
// example: Input: 1234, Output: 10

public class SumOfGivenNumber {

	public static void main(String[] args) {
		int num = 123456;
		int sum = 0;
		
		while (num > 0)
		{
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
