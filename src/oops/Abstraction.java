package oops;

abstract class Animal {
	abstract void walk();
}

class Horse extends Animal {
	public void walk() {
		System.out.println("Walks on 4 legs");
	}
}

class Duck extends Animal {
	public void walk() {
		System.out.println("Walks on legs");
	}
}

public class Abstraction{
	public static void main(String a[]) {
		Horse horse = new Horse();
		horse.walk();
		
		Duck duck = new Duck();
		duck.walk();
	}
}