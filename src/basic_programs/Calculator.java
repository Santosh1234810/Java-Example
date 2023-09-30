package basic_programs;

// Write a calculator program using switch statement

public class Calculator {
	public static void main(String args[])
	{
		int num1 = 10, num2 = 20;
		
		String operation = "Add";
		
		switch(operation)
		{
		case "Add":
			System.out.println(num1 + num2);
			break;
			
		case "Sub":
			System.out.println(num1 - num2);
			break;
			
		case "Mul":
			System.out.println(num1 * num2);
			break;
			
		case "Div":
			System.out.println(num1 / num2);
			break;
			
			default:
				System.out.println("Invalid input");
		}
	}
}
