import java.util.Scanner;
public class CartesianPlane
{ 	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x coordinate");
		int x = s.nextInt();
		
		System.out.println("Enter y coordinate");
		int y = s.nextInt();
	
		if (x == 0 && y == 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in origin");
		}
		else if ( x > 0 && y > 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in Q1");
		}
		else if ( x < 0 && y > 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in Q2");
		}
		else if (x < 0 && y < 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in Q3");	
		}
		else if (x > 0 && y < 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in Q4");
		}
		else if ( x > 0 ||x < 0 && y == 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in x axis");
		}
		else if (x == 0 && y > 0 || y < 0)
		{
			System.out.println("pt " + x + " and " + y + " lies in y axis");
		}
	
		s.close();

	}
	
}