package loops;

public class BreakStatement {
	public static void main(String a[]) {
		 
		for (int i=1; i<=10; i++) {
			if (i == 5) {
				break; //break keyword is used for come out from the loop based on certain command
			}
			System.out.println(i);
		}
	}
}
