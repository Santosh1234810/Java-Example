package loops;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int i=1; i<=10; i++) {
			if (i == 5) {
				continue; // the continue key is used for skipping the specific number
			}
			System.out.println(i);
		}
	}

}
