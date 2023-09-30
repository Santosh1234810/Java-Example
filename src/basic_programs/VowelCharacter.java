package basic_programs;

// Write a program to check given character is vowel or not
// Valid vowel characters: a, e, i, o, u
// input - a, output - Vowel
// input - j, output - not vowel

public class VowelCharacter {
	public static void main(String args[])
	{
		char c = 'A';
		
		if (c=='a' || c=='A' || c=='e' || c=='E'|| c=='i' || c=='I' || c=='o' || c=='O' || c == 'u' || c=='U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not vowel");
		}
	}
}
