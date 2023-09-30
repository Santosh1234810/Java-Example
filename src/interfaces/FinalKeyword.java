package interfaces;

final class Test1
{
	final int a = 10;
	
	final void m1()
	{
//		a = 20; // not valid because a is a final variable
		System.out.println(a);
	}
}

/*
class Test2 extends Test1
{
	/*void m1() //not valid because method m1 is final method
	{
		System.out.println("method m1 is overriden");
	} 
}
*/



public class FinalKeyword {

	public static void main(String[] args) {
	}
}
