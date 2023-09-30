package loops;

public class Swapping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a before swapping: "+a);
		System.out.println("Value of a before swapping: "+b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("================================");
		System.out.println("Value of a after swapping: "+a);
		System.out.println("Value of a after swapping: "+b);
	}

}
