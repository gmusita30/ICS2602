import java.util.Scanner;
public class LE2SolutionV2
{
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a 3 - digit number: ");
			int num = s.nextInt();
			
			int hund = num / 100;
			int rem1 = num % 100;
			
			int tens = rem1 / 10;
			int ones = rem1 % 10;
			
			System.out.println("The reverse value is " + ones + tens + hund);
			
			s.close();
		}
}