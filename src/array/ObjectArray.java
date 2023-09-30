package array;

public class ObjectArray {
	public static void main(String args[]) {
		
		/*Object ob[] = new Object[5];
		
		ob[0] = 10;
		ob[1] = 10.5;
		ob[2] = "Welcome";
		ob[3] = true;
		ob[4] = 'G';
		*/
		
		Object ob[] = {10, 10.5, "Welcome", 'G', true};
		
		for (Object i:ob) {
			System.out.println(i);
		}
	}
}
