package javaFullstack;

public class WhileTest {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i <= 5)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
