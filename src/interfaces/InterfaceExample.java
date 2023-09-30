package interfaces;

interface TestInterface
{
	int a = 10; // by default variable is static and final
	
	void display(); // by default method is abstract
}

public class InterfaceExample implements TestInterface{
	
	public void display()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		TestInterface ti = new InterfaceExample();
		ti.display();
	}
}
