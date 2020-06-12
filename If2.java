// consonant or vowels
import java.util.Scanner;
public class If2
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = s.next().toLowerCase().charAt(0);

		// check if ch is a letter
		if (Character.isLetter(ch)) {
			// System.out.println("ch was: " + ch);
			// determine if the character is a vowel or a consonant
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel.");
			}
			else  {
				System.out.println(ch + " is a consonant.");
			}
		}
		else {
			System.out.println("NOT a letter: " + ch);
		}

		s.close();
	}
}
