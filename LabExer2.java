import java.util.Scanner;
public class LabExer2
{
		public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a 3 digit number");
			int User = input.nextInt();
		
				
			int Hundreds = User /100;
			int Seconddigit = User %100;
			int Tens = Seconddigit /10;
			int Ones = User %10;
			
		System.out.println("The reverse value is: "+ Ones + Tens + Hundreds);
		}
}