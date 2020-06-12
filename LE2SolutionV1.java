import java.util.Scanner;
public class LE2SolutionV1
{
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a 3 - digit number:");
			String str = s.next();
			StringBuilder sb =new StringBuilder(str);
			System.out.println("The reverse value is: " + sb.reverse());
			s.close();
		}
}