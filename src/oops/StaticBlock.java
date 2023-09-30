package oops;

public class StaticBlock {
	static {
		System.out.println("This class is executed without main method");
		System.exit(0);
	}
}
