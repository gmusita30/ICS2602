import java.util.Scanner;
public class LE5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = s.nextInt();
		
		System.out.print("Enter second number:");
		int b = s.nextInt();
		
		int product = 0;
		int pro = 0;
		int quotient = 0;
		int modulo = 0;
		int temp = 0;
		
		while (temp < b)
		{
			product = pro += a;
			temp ++;
		}
		System.out.println("The product is " + product);
		
		while (a > b)
		{
			modulo = a -= b;
			quotient ++;
		}
		System.out.println("The quotient is " + quotient);
		System.out.println("The modulo is " + modulo);
			
		s.close();
	}
}