//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Pasikat
{
	public static void main(String args[])
	{	

		/*String input = 
		JOptionPane.showInputDialog("Enter a 1 to 3 digit number ");
		int abc = Integer.parseInt(input);
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 1 to 3 digit number");
		int num = s.nextInt();
		
		int a = (num / 100);
		int b = (num % 100 / 10 * 10);
		int ba = (num % 100);
		int c = (num % 10);
		
		String as;
		String aa = "";
		
		if (a==1)
		{
			aa = "One hundred ";
		}
		else if (a==2)
		{
			 aa = "Two hundred ";
		}
		else if (a==3)
		{
			 aa = "Three hundred ";
		}
		else if (a==4)
		{
			 aa = "Four hundred ";
		}
		else if (a==5)
		{
			 aa = "Five hundred ";
		}
		else if (a==6)
		{
			 aa = "Six hundred ";
		}
		else if (a==7)
		{
			 aa = "Seven hundred ";
		}
		else if (a==8)
		{
			 aa = "Eight hundred ";
		}
		else if (a==9)
		{
			 aa = "Nine hundred ";
		}
		else 
		{
			 aa = "";
		}
		as = aa;
		
		String bs;
		String bb = "";
		
		if (ba>10 && ba<20)
		{
			if (ba == 11)
			{
				bb = "eleven ";
			}				
			else if (ba == 12)
			{
				bb = "twelve ";
			}				
			else if (ba == 13)
			{
				bb = "thirteen ";
			}			
			else if (ba == 14)
			{
				bb = "fourteen ";
			}			
			else if (ba == 15)
			{
				bb = "fifteen ";
			}			
			else if (ba == 16)
			{
				bb = "sixteen ";
			}			
			else if (ba == 17)
			{
				bb = "seventeen ";
			}			
			else if (ba == 18)
			{
				bb = "eighteen ";
			}			
			else if (ba == 19)
			{
				bb = "nineteen ";
			}
		}
		else if (!(ba>10 && ba<20))
		{
			if (b == 10)
			{
				bb = "ten";
			}			
			else if (b == 20)
			{
				bb = "twenty ";
			}			
			else if (b == 30)
			{
				bb = "thirty ";
			}			
			else if (b == 40)
			{
				bb = "fourty ";
			}			
			else if (b == 50)
			{
				bb = "fifty ";
			}			
			else if (b == 60)
			{
				bb = "sixty ";
			}			
			else if (b == 70)
			{
				bb = "seventy ";
			}			
			else if (b == 80)
			{
				bb = "eighty ";
			}			
			else if (b == 90)
			{
				bb = "ninty ";
			}			
		}	
		else 
		{
			bb = "";
		}
		bs = bb;
		
		String cs;
		String cc = "";
		if (c == 1)
		{
			cc = "one";
		}
		else if (c == 2)
		{
			cc = "two";
		}
		else if (c == 3)
		{
			cc = "three";
		}
		else if (c == 4)
		{
			cc = "four";
		}
		else if (c == 5)
		{
			cc = "five";
		}
		else if (c == 6)
		{
			cc = "six";
		}
		else if (c == 7)
		{
			cc = "seven";
		}
		else if (c == 8)
		{
			cc = "eight";
		}
		else if (c == 9)
		{
			cc = "nine";
		}
		else 
		{
			cc = "";
		}
		cs = cc;
		
		if (abc == 0)
		{
			String msg = "In word(s), the number you entered (" + abc + ") is zero.";
		//JOptionPane.showMessageDialog(null,msg);
		}	
		else if (abc<0 || abc>999)
		{
			String msg = "Your input(" +abc+") is invalid, please try again.";
		//JOptionPane.showMessageDialog(null,msg);
		}
		else if (ba>10 && ba<20)
		{
			String msg = "In word(s), the number you entered ("+abc+") is " + as + bs + ".";
		//JOptionPane.showMessageDialog(null,msg);
		}
		else if (!(ba>10 && ba<20))
		{
			String msg = "In word(s), the number you entered ("+abc+") is " + as + bs + cs + ".";
		//JOptionPane.showMessageDialog(null,msg);
		}
		
	}
}