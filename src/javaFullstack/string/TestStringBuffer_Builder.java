package javaFullstack.string;

public class TestStringBuffer_Builder {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("World");
		
		System.out.println("Append: \n"+sb1);
		sb1.insert(10, "java");
		
		System.out.println("Insert at index: \n"+sb1);
		
		sb1.reverse();
		System.out.println("Reversed string: "+sb1);
		
		StringBuffer sb2 = new StringBuffer("This is java class");
		
		System.out.println(sb2.indexOf("java"));
		
		sb2.replace(8, 12, "Python");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
//		sb2.append("\nWelcome to java programming");
//		(old capacity * 2) + 2 ---> (16*2) + 2 = 34
		System.out.println("Capacity when long string: \n"+sb2.capacity());
		
		sb2.ensureCapacity(10); // return boolean value
		System.out.println("Ensure calacity: \n"+sb2.capacity());
		
		sb2.ensureCapacity(50);
//		if it sufficient then it will not change an if it is greater so
//		its not sufficient for it then it will increase its capacity
		System.out.println("Ensure capacity: \n"+sb2.capacity());
		
		System.out.println(sb2);
		sb2.delete(0, 5);
		System.out.println("After delete: \n"+sb2);
		
		System.out.println("*****************************************************");
		String st = "This is java class";
		String arr[] = st.split(" ");
		
		for (String sp:arr)
		{
			System.out.println(sp);
		}
		System.out.println("*****************************************************");
		
	}
}
