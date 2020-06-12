public class AssignClue
{
	public static void main(String args[])
	{
		String str = args[0];
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		System.out.println("String: " + str);
		System.out.println("First Char: " + firstChar);
		System.out.println("Last Char: " + lastChar);
		System.out.println("String length: " + str.length());
	}
}
