import java.util.Scanner;

public class ScannerTest
{
		public static void main(String args[])
		{
				String name;
				int age;
				double gpa;
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("Enter your name: ");
				// name = s. next();	// abc
				name = s.nextLine();	// abc def
				
				System.out.println("How old are you?; ");
				age = s.nextInt();
				
				System.out.println("What is your GPA: " );
				gpa = s.nextDouble();
				
				System.out.println("Hello" + name +
						", next year you will be " + (age + 1)
						+ ", you got a gpa of " + gpa);
				
				s.close();
		}
}