package string;

public class StringMethods {
	public static void main(String args[]) {
		String s1 = "Welcome";
		
		System.out.println(s1.length());
		
//		concatenation
		String s2 = " to india";
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		System.out.println("Welcome".concat(" to training"));
		
//		equals: equals is a method to comparing the two string
		String s3 = "Welcome";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4));
		
//		equalsignoreCase: Ignore the case sensitivity
		System.out.println(s3.equalsIgnoreCase(s4));
		
//		contains: contains() method is check whether the particular string is present or not in the main string
		System.out.println(s3.contains("ABC"));
		
//		substring
		System.out.println(s3.substring(2, 5));
		
//		replace
		System.out.println(s3.replace('e', 'a'));
		
		System.out.println(s3.replace("come", "kome"));
	}
}
