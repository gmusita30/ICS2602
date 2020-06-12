import java.util.Scanner;

public class If1
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = s.nextInt();

		if (year % 4 == 0) // {
			System.out.println("The year " + year + " is a leap year.");
		// }
		else  // {
			System.out.println("The year " + year + " is NOT a leap year.");
		// }	

		s.close();
	}
}
