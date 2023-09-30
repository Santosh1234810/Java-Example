package javaFullstack;

interface Vehicle3
{
	void run();
}

public class AnnonymlusInterface {
	public static void main(String[] args) {
		Vehicle3 v = new Vehicle3()
				{
			public void run()
			{
				System.out.println("Interface of vehicle is implemented");
			}
				};
				v.run();
	}
}
