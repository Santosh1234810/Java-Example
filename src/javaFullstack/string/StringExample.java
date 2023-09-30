package javaFullstack.string;

public class StringExample {
	private static String s;

	public static void main(String[] args) {
		String str1 = "welcome";
		String str2 = new String("welcome");
		char ch[] = {'w','e','l','c','o','m','e'};
		
		String str3 = new String(ch);
		
		System.out.println("Using equal method...");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println("*****************************************************");
		
		System.out.println("Using == operator...");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println("*****************************************************");
		
		String s1 = "Sachin";
		s1.concat("Tendulakar");
		System.out.println(s1);
		System.out.println("*****************************************************");
		
		s1 = s1.concat("Tendulkar");
		System.out.println("Concatenation using Reassign: "+s1);
		System.out.println("*****************************************************");
		
		System.out.println("Comparison of Strings: ");
		
		String one = "Welcome";
		String two = "Hello";
		String three = "Welcome";
		String four = "Hello";
		
		System.out.println((int)'W');
		System.out.println((int)'H');
		System.out.println(two.compareTo(one));
		System.out.println(one.compareTo(three));
		System.out.println(two.compareTo(four));
		
		System.out.println("*****************************************************");
		System.out.println("************************Substring********************");
		System.out.println(one.substring(0,3));
		
		System.out.println("******************Uppercase & Lowercase**************");
		
		String s4 = "welcome";
		String s5 = "WELCOME";
		String s6 = "Hello";
		System.out.println(s4.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s6.toUpperCase());
		System.out.println("*****************************************************");
		
		System.out.println("*****************Starts with & Ends with*************");
		System.out.println(s4.startsWith("w"));
		System.out.println(s4.endsWith("e"));
		System.out.println("*****************************************************");
		
		System.out.println("***********************Trim Metthod******************");
		String str4 = " hello";
		System.out.println(str4);
		System.out.println(str4.trim());
		System.out.println("*****************************************************");
		
		System.out.println("*************************charAt()********************");
		String str5 = "hello";
		System.out.println(str5.charAt(0));
		System.out.println("*****************************************************");
		
		System.out.println("********************inter() method*******************");
		System.out.println("Intern");
		s = new String("Hello");
		s1 = s.intern();
		System.out.println(s1);
		
		System.out.println("*****************************************************");
		System.out.println("*********************valueOf() method****************");
		int a = 10;
		String str7 = String.valueOf(a);
		System.out.println(str7 + 10);
		System.out.println(a + 10);
		
		System.out.println("*****************************************************");
		System.out.println("*************************replace() method************");
		String str8 = "this is java class";
		System.out.println(str8);
		String str9 = str8.replace("Java","Python");
		System.out.println(str9);
		
		System.out.println("*****************************************************");
		System.out.println("***********************indexOf() method**************");
		String x = "Hello World";
		System.out.println(x.indexOf("w"));
		System.out.println(x.indexOf('o'));
		System.out.println(x.indexOf('o',5));
	}
}
