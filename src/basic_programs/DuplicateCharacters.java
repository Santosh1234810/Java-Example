//Java program to find the duplicate words in a string and count the duplicate words.

package basic_programs;

public class DuplicateCharacters {
	public static void main(String args[])
	{
		String str = "Automation";
		char ch[] = str.toCharArray();
		int count = 0;
		
		for (int i=0; i<ch.length; i++)
		{
			for (int j=i+1; j<ch.length; j++)
			{
				if (ch[i] == ch[j])
				{
					System.out.println("Duplicate characters in string are: "+ch[j]);
					count++;
				}
			}
		}
		System.out.println("Duplicate characters count: "+count);
	}
}








