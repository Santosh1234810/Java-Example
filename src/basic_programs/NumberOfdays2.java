package basic_programs;

//Print number of days in a given month (1 to 12) using Switch statement
//Input - 12, Output - 31

public class NumberOfdays2 {
	public static void main(String args[])
	{
		int number = 12;
		
		switch(number) {
		case 1:
			System.out.println(31);
			break;
			
		case 2:
			System.out.println(28);
			break;
			
		case 3:
			System.out.println(31);
			break;
			
		case 4:
			System.out.println(30);
			break;
			
		case 5:
			System.out.println(31);
			break;
			
		case 6:
			System.out.println(30);
			break;
			
		case 7:
			System.out.println(31);
			break;
			
		case 8:
			System.out.println(31);
			break;
			
		case 9:
			System.out.println(30);
			break;
			
		case 10:
			System.out.println(31);
			break;
			
		case 11:
			System.out.println(30);
			break;
			
		case 12:
			System.out.println(31);
			break;
			
		default:
			System.out.println("Invalid input");
		}
	}
}
